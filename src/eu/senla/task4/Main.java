/*Создать программу, которая будет вычислять и выводить на экран простые множители из которых состоит целое число,
введенное пользователем. Если введено не целое число, то сообщать ему об ошибке.
 */
package eu.senla.task4;
import java.util.*;
public class Main {
    public static String a;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        if (sc.hasNextInt()){
            int a = sc.nextInt();
        }else {
            System.out.println("Вы ввели не целоечисло, введите заново: ");
        }

        }
    }

