package java1.java_dz;

import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;


public class S4 {
    public static void main(String[] args) {
    
    // 1.Сохранить в файл строку и загрузить из файла строку с выводом в консоль 
    // используя классы FileWriter и FileReader

    FileWriter fileWriter1 = null;
    try {
        fileWriter1 = new FileWriter("java1/java_dz/db1.txt");
        fileWriter1.append("Иванов Петр Петрович 50 мужской\n");
        fileWriter1.flush();
    } catch (IOException e) {
        System.out.println(e.getMessage());
    }

    String text1 ="";
    FileReader reader =null;
    try {
        reader = new FileReader("java1/java_dz/db1.txt");
        while (reader.ready()){
            text1 += (char)reader.read();
        }
    } catch (IOException e) {
        System.out.println(e.getMessage());
    }
    System.out.println("//1:\n"+ text1);

    

    // 2.Загрузить из файла многострочный текст формата ФИО возраст и пол через пробелы. 
    // Разбить по строкам и вывести в консоль в формате "Иванов И.И. 32 М"

    FileWriter fileWriter2 = null;
    try {
        fileWriter2 = new FileWriter("java1/java_dz/db2.txt");
        fileWriter2.append("Иванов Петр Петрович 50 м \n");
        fileWriter2.append("Семенов Павел Павлович 25 м \n");
        fileWriter2.append("Иванова Анна Петровна 30 ж \n");
        fileWriter2.append("Семенов Андрей Павлович 5 м \n");
        fileWriter2.append("Васильева Татьяна Алексеевна 32 ж \n");
        fileWriter2.append("Васильева Дарья Романовна 7 ж \n");
        fileWriter2.flush();
    } catch (IOException e2) {
        System.out.println(e2.getMessage());
    }
    String text2 ="";
    try {
        reader = new FileReader("java1/java_dz/db2.txt");
        while (reader.ready()){
            text2 += (char)reader.read();
        
        }
    } catch (IOException e) {
        System.out.println(e.getMessage());
    }
    System.out.println("//2:");

    String[] lines = text2.split("\n");
    for (int i = 0; i < lines.length; i++) {
        System.out.println(lines[i]);
        }

    // 3.Загруженный и разбитый по строкам текст загрузить в подготовленные списки. 
    // Фамилии, имена, отчества, возрас и пол в отдельных списках.


    ArrayList <String> listSurName = new ArrayList <>();
    ArrayList <String> listName = new ArrayList <>();
    ArrayList <String> listPatr = new ArrayList <>();
    ArrayList <Integer> listAge = new ArrayList <>();
    ArrayList <Boolean> listMale = new ArrayList <>();
 
    for (int i = 0; i < lines.length; i++) {
        String words[] = lines[i].split(" ");
        listSurName.add(words[0]);
        listName.add(words[1]);
        listPatr.add(words[2]); 
        listAge.add(Integer.valueOf(words[3])); 
        if (words[4].contains("м")) {
            listMale.add(true);
        }else{
            listMale.add(false);
        }
    }
    System.out.println("//3:");
    System.out.println(listSurName);
    System.out.println(listName);
    System.out.println(listPatr);
    System.out.println(listAge);
    System.out.println(listMale);
    
   
    // 4.Отсортировать по возрасту используя дополнительный список индексов.
    LinkedList <Integer> ls = new LinkedList<>();
    for (int i = 0; i < lines.length; i++) {
        ls.add(i);
    }
    System.out.println("//4:");
    System.out.println(ls);
    int sorted_size = 0;
    while (sorted_size<ls.size()-1){
        int index = 0;
        while (index< listAge.size()-1-sorted_size){
            if (listAge.get(index)>listAge.get(index+1)) {
                int temp = listAge.get(index);
                listAge.set(index,listAge.get(index+1)); 
                listAge.set(index+1, temp);

                temp = ls.get(index);
                ls.set(index,ls.get(index+1)); 
                ls.set(index+1, temp);
            }
            index+=1;
        }
        sorted_size +=1; 
    }
    System.out.println("listAge sorted: "+listAge);
    System.out.println("ls sorted" + ls);
    for (int i = 0; i < lines.length; i++) {
        System.out.println(lines[ls.get(i)]);
    }    






    }


}
