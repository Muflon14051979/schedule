/*
Напишите программу, которая возвращает количество "троек" в заданной строке.
Тройка - это символ, появляющийся три раза подряд в строке.
 Задание на внимательность!
 */
package eu.senla.task1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for ( int c = 0; c<a; c++ ) {
            System.out.print((char) '3' + "" + (char) '3' + "" + (char) '3');

        }


    }
}


