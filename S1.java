/* 
// 1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
// 2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
// 3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
// 4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m
int i = new Random().nextInt(k); //это кидалка случайных чисел!)
*/
package java1.java_dz;
// import java.util.Arrays;
import java.util.Random;

// import javax.swing.text.html.HTMLDocument.HTMLReader.FormAction;
public class S1 {
    public static void main(String[] args) {
        int i = new Random().nextInt(2000); 
        System.out.printf("i= %d",i);
        System.out.println();
        String s = Integer.toBinaryString(i);
        System.out.printf("iBinary= %s",s);
        System.out.println();
        int n = s.length()-1;
        System.out.printf("n= %d",n);
        System.out.println();
        System.out.printf("Short.MAX_VALUE= %d",Short.MAX_VALUE);
        System.out.println();
        System.out.printf("Short.MIN_VALUE=%d",Short.MIN_VALUE);
        System.out.println();
        
        int k = -1;
        for (int j = i;  j<= Short.MAX_VALUE; j++) {
            if (j%n == 0){
                k++;
            } 
        }
        System.out.printf("Размер массива m = %d",k);
        System.out.println();
        int[] m = new int[k+1];
        k = -1;
        for (int j = i;  j<= Short.MAX_VALUE; j++) {
            if (j%n == 0){
                k++;
                m[k] = j;
            }
        } 
        System.out.println("Первые 10 кратных:" ); 
        for (int j = 0; j < 10; j++) {
           System.out.printf("%d ",m[j]); 
        } 
        
        k = -1;
        for (int j = Short.MIN_VALUE;  j<= i; j++) {
            if (j%n != 0){
                k++;
            } 
        }
        System.out.println();
        System.out.printf("Размер массива m1 = %d",k);
        System.out.println();
        int[] m1 = new int[k+1];
        k = -1;
        for (int j = Short.MIN_VALUE;  j<= i; j++) {
            if (j%n != 0){
                k++;
                m1[k] = j;
            }
        }
        System.out.println();
        System.out.println("Первые 10 некратных:" ); 
        for (int j = 0; j < 10; j++) {
           System.out.printf("%d ",m1[j]); 
        } 
        System.out.println();
    }
}    