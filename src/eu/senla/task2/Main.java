/*
Напишите программу, которая возвращает сумму цифр, присутствующих в данной строке.
Если цифр нет, возвращаемая сумма равна 0.
 */
package eu.senla.task2;
import java.util.*;

public class Main {
    private static String v = "";

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int x = a.length();
        for (int xx = 0; xx<x; xx++) {
            int c = 0;
            int c1 = 3;
            String b = a.substring(c ,c1);
            c1 = c1 + 1;
            System.out.println("числа " + b);
            v = v + b;
        }
        System.out.println("Длинна строки " + x);
        System.out.println("числа " + v);

    }
}
