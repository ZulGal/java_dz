package java1.java_dz;

import javax.sound.sampled.SourceDataLine;

public class S2 {
    // 3.*Напишите программу, чтобы перевернуть строку с помощью рекурсии.
    static String rev(String s,int i) {
        if (i == 0)
            return ""+s.charAt(i);
        else
            return  s.charAt(i) + rev(s,i-1);
    }
    public static void main(String[] args) {
        String str = "Телефон";
        int n = str.length(); 
        System.out.println("//3 "+rev(str,n-1));    
    

    // 1.Напишите программу, чтобы найти вхождение в строке (содержащей все символы другой строки).
    
        String s10 = "Кабы не было зимы";
        String s11 = "Зимы";
        s10 = s10.toLowerCase();
        s11 = s11.toLowerCase();
        System.out.println("//1 "+s10.contains("не"));

    // 2.Напишите программу, чтобы проверить, являются ли две данные строки вращением друг друга 
    // (вхождение в обратном порядке).
        String s20 = "Телефон";
        String s21= "Нофелет";
        s20 = s20.toLowerCase();
        s21 = s21.toLowerCase();
        StringBuilder sb20 = new StringBuilder();
        sb20.append(s20);
        StringBuilder sb21 = new StringBuilder();
        sb21.append(s21);
        sb21.reverse();
        System.out.println("//2 " + sb20.toString().equals(sb21.toString()));
         

    // 4.Дано два числа, например 3 и 56, необходимо составить следующие строки: 
    // 3 + 56 = 59 3 – 56 = -53 3 * 56 = 168 
    // Используем метод StringBuilder.append().
        int a = 3;
        int b = 56;
        StringBuilder sb4 = new StringBuilder();
        sb4.append(a).append(" + ").append(b).append(" = ").append(a+b);
        System.out.println("//4 " + sb4);
        
        sb4.setLength(0);
        sb4.append(a).append(" - ").append(b).append(" = ").append(a-b);
        System.out.println("//4 "+ sb4);
        // 5.Замените символ “=” на слово “равно”. 
        // Используйте методы StringBuilder.insert(),StringBuilder.deleteCharAt().
        int start4 = sb4.indexOf("=");
        sb4.deleteCharAt(start4);
        sb4.insert(start4,"равно");
        System.out.println("//4 "+ sb4);

        sb4.setLength(0);
        sb4.append(a).append(" * ").append(b).append(" = ").append(a*b);
        System.out.println("//4 "+ sb4);
        // 6.*Замените символ “=” на слово “равно”. 
        // Используйте методы StringBuilder.replace().
        String s4 = "равно";
        int end4 = start4 +s4.length();
        String s1 = sb4.substring(start4+1,sb4.length());
        sb4.replace(start4, sb4.length(), " ");
        sb4.replace(start4,end4, s4);
        sb4.append(s1);
        System.out.println("//4 "+ sb4);
    
  
    // 7.**Сравнить время выполнения пунка 6 со строкой содержащей 10000 символов "=" 
    // средствами String и StringBuilder.  
        System.currentTimeMillis();
        long begin7 = System.currentTimeMillis();
        String s7 = "";
        for (int i = 0; i < 10000; i++) {
            s7 +="+";
        }    
        long end7 = System.currentTimeMillis();
        System.out.println("//7 " + (end7-begin7));
    
        begin7 = System.currentTimeMillis();
        StringBuilder sb7 = new StringBuilder();
        for (int j = 0; j < 10000; j++) {
            sb7.append("+");
        }    
        end7 = System.currentTimeMillis();
        System.out.println("//7 " + (end7-begin7));
    }
}    
