/*Создать программу, которая будет вычислять и выводить на экран простые множители из которых состоит целое число,
введенное пользователем. Если введено не целое число, то сообщать ему об ошибке.
 */
package eu.senla.task4;
import java.util.*;
public class Main {
    public static int a=0;

    public static void main(String[] args) {

        System.out.println("Введите целое число: ");
        while (a == 0) {
            Scanner sc = new Scanner(System.in);
            if (sc.hasNextInt()) {
                int a = sc.nextInt();
            break;
            } else {
                System.out.println("Вы ввели не целое число, введите заново: ");
            }

        }
    }
}
