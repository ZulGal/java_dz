import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;

public class S5 {
   public static void main(String[] args) {

      // 1. Создать словарь HashMap. Обобщение <Integer, String>.
      HashMap <Integer, String>  map = new HashMap<>();
      map.put(77, "красный");
      map.put(32, "оранжевый");
      map.put(13, "желтый");
      map.put(25, "голубой");
      map.put(64, "синий");
      map.put(27, "фиолетовый");
      System.out.println("//1: " + map);

      // 2. Заполнить тремя ключами (индекс, цвет), добавить ключь, если не было!)
      map.putIfAbsent(64,"зеленый"); 
      System.out.println("//2: " + map);  
      map.putIfAbsent(404,"зеленый");
      System.out.println("//2: " + map);

      // 3. Изменить значения дописав восклицательные знаки.
      Set <Integer> keySet = map.keySet();
      for (int i = 0; i < keySet.size(); i++) {
         map.computeIfPresent((Integer) keySet.toArray()[i],(k,v)->{
            v = v+"!";
            return v;
         });
      }
      System.out.println("//3: " + map);


      // 4. *Создать TreeMap, заполнить аналогично.
      TreeMap <Integer, String> tm = new TreeMap<>();
      tm.put(77, "красный");
      tm.put(32, "оранжевый");
      tm.put(13, "желтый");
      tm.put(25, "голубой");
      tm.put(64, "синий");
      tm.put(27, "фиолетовый");
      System.out.println("//4: " + tm);
         
      // 5. *Увеличить количество элементов до 1000 случайными ключами и общей строкой.

      TreeMap <Integer, String> tm5 = new TreeMap<>();
      int k=0;
      while (k<1000){
         int key = new Random().nextInt(2000);
         if (tm5.containsKey(key)==false){
            tm5.put(key,"Общая строка ");
            k+=1;
         }
      }
      System.out.println("//5 tm.size: " + tm5.size());

      // 6. **Сравнить время последовательного и случайного перебора тысячи элементов словарей.
      
      LinkedHashMap<Integer,String> lh6 = new LinkedHashMap<>(); 
      k=0;
      while (k<1000){
         int key = new Random().nextInt(2000);
         if (lh6.containsKey(key)==false){
            lh6.put(key,"Общая строка ");
            k+=1;
         }
      }
      System.out.println("//6 lh.size: " + lh6.size());

      long begin; 
      long end;
      
      Set <Integer> keySet6 = lh6.keySet();
      System.currentTimeMillis();
      begin= System.currentTimeMillis();
      for (Integer tmp: keySet6){
         System.out.println(tmp);
      }
      end = System.currentTimeMillis();
      long time_lh = end - begin;

      Set <Integer> keySet5 = tm5.keySet();
      System.currentTimeMillis();
      begin= System.currentTimeMillis();
      for (Integer tmp: keySet5){
         System.out.println(tmp);
      }
      end = System.currentTimeMillis();
      long time_tm = end-begin;
      
      System.out.println("//6 LinkedHasMap_time: " + time_lh);
      System.out.println("//6 TreeMap_time: " + time_tm);

   } 
}
