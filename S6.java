package java1.java_dz;

import java.util.HashMap;
import java.util.Map;

public class S6 {
    // Разработать программу, имитирующую поведение коллекции HashSet. 
    // В программе создать метод add добавляющий элемент,
    // метод toString возвращающий строку с элементами множества и 
    // метод позволяющий читать элементы по индексу. 
    // Формат данных Integer.
    public static void main(String[] args) {
        MySet mySet = new MySet();
        mySet.add(1);
        mySet.add(6);
        mySet.add(37);
        mySet.add(6);
        System.out.println(mySet);
        for (int i = 0; i < mySet.size(); i++) {
            System.out.println(mySet.get(i));    
        }
    }    
}
class MySet{
    static Map <Integer,Object> map = new HashMap<>();
    private static final Object OBJ = new Object();
    
    @Override
    public String toString() {
        return map.keySet().toString();
    }
    public boolean add(Integer i) {
        return map.put(i,OBJ) != null ? true: false;
    }
    public Integer size(){
        return map.keySet().size();
    }
    public Integer get(Integer i) {
        return (Integer) map.keySet().toArray()[i];
    }
}
