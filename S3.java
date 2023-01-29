package java1.java_dz;

import java.util.*;

public class S3 {
    /**
     * @param args
     */
    public static void main(String[] args) {
    //1 Создать новый список, добавить несколько строк и вывести коллекцию на экран.
        ArrayList <String> list1 = new ArrayList <>();
        list1.add("apple");
        list1.add("banan");
        list1.add("cherry");
        list1.add("orange");
        System.out.println("//1 "+list1);

    //2 Итерация всех элементов списка цветов и добавления к каждому символа '!'.
        ArrayList <String> list2 = new ArrayList <>();
        list2.add("красный");
        list2.add("оранжевый");
        list2.add("желтый");
        list2.add("зеленый");
        list2.add("голубой");
        list2.add("синий");
        list2.add("фиолетовый");
        System.out.println("//2 "+list2);

        ListIterator <String> listIterator = list2.listIterator();
        while(listIterator.hasNext()) {
            listIterator.set(listIterator.next() +"!");
        }
        System.out.println("//2 "+list2);

    //3 Вставить элемент в список в первой позиции.
        list2.add(0, "Белый");
        System.out.println("//3 "+list2);

    //4 Извлечь элемент (по указанному индексу) из заданного списка.
        System.out.println("//4 Элемент[5]= "+list2.get(5)); 

    //5 Обновить определенный элемент списка по заданному индексу.
        list2.set(0,"Черный");
        System.out.println("//5 "+list2); 

    //6 Удалить третий элемент из списка.
        list2.remove(2);
        System.out.println("//6 "+list2); 

    //7 Поиска элемента в списке по строке.

        System.out.println("//7 индекс элемента желтый! "+list2.indexOf("желтый!")); 
    //8 Создать новый список и добавить в него несколько елементов первого списка.
        ArrayList <String> list8 = new ArrayList <>();
        Random rnd = new Random();    
        for (int i = 0; i < 5; i++) {
            list8.add(list2.get(rnd.nextInt(7)));
        }
        System.out.println("//8 "+list8);
    //9 Удалить из первого списка все элементы отсутствующие во втором списке.
        list2.removeAll(list8);
        System.out.println("//9 "+list2);
    //10 *Сортировка списка.
        Collections.sort(list8);
        System.out.println("//10 "+list8);
        Collections.sort(list8, Collections.reverseOrder());
        System.out.println("//10 "+list8);
    }
}
