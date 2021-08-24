/*
Напишите программу, которая возвращает сумму цифр, присутствующих в данной строке.
Если цифр нет, возвращаемая сумма равна 0.
 */
package eu.senla.task2;
import java.util.*;

public class Main {
    public static int v;
    public static int c = 0;
    public static char b;
    public static int num = 0;
    public static int q;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int x = a.length();
        for (int xx = 0; xx < x; xx++) {
            b = a.charAt(c);
            c++;
            if (b>=48&&b<=57){
             num = Integer.parseInt(String.valueOf(b));
                v = v + num;}}
            if(v >= 0){System.out.println("Cумма цифр, присутствующих в данной строке = "+v);}else{
                q = 0;
                System.out.println("Cумма цифр, присутствующих в данной строке = " + q);}
   }

}




