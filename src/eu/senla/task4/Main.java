/*Создать программу, которая будет вычислять и выводить на экран простые множители из которых состоит целое число,
введенное пользователем. Если введено не целое число, то сообщать ему об ошибке.
 */
package eu.senla.task4;
import java.util.*;
public class Main {
    public static int a=0;
    public static int b=0;
    public static int x=0;
    public static int itog=0;
    public static int itogx=0;
    public static int xx=0;


    public static void main(String[] args) {

        System.out.println("Введите первое целое число: ");
        while (a == 0) {
            Scanner sc = new Scanner(System.in);
            if (sc.hasNextInt()) {
                int a = sc.nextInt();
            if(a%2==0) {
                while(itog<=a){
                    x++;
                    itogx= itog;
                    itog = x * x;
                    }
                x--;
                break;} else{
                System.out.println("Вы ввели не целое число, введите заново: ");}

            }
        }
        System.out.println("Число первое максимально x : " + x);
        System.out.println("Число первое максимально itog : " + itogx);

    }
}
