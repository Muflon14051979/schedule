/*На вход приходят 2 вектора, описанные координатами точек начала (x1,y1) и конца (x2,y2) вектора. Найти длины векторов,
  а так же вектор произведения первого вектора на второй и второго на первый (получим 2 новых вектора).
  Векторы выводить в формате “начало (x1,y1), конец (x2,y2).
 */
package eu.senla.task3;
import java.util.*;

public class Main {
    public static double aa1 = 0.0;
    public static double aaa1 = 0.0;
    public static double bb1 = 0.0;
    public static double bbb1 = 0.0;
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        double x1y2 = ((x1 * x1) + (y2 * y2));
        double y1x2 = ((y1 * y1) + (x2 * x2));
        for(double a1 = 0.0; aa1<=x1y2; a1++){

            aa1 = a1 * a1;
           // System.out.println("aa1 "+ aa1);
           // System.out.println("a1 "+a1);
            aaa1 = a1-1.0;
        }
        double aaaaa1 = aaa1 * aaa1;
        double aaaa1 = (x1y2 - aaaaa1);
        double itogo1 = aaa1 + (aaaa1 / (2*aaa1));



        for(double b1 = 0.0; bb1<=y1x2; b1++){

            bb1 = b1 * b1;
            //System.out.println("bb1 "+ bb1);
           // System.out.println("b1 "+b1);
            bbb1 = b1-1.0;
        }
        double bbbbb1 = bbb1 * bbb1;
        double bbbb1 = (y1x2 - bbbbb1);
        double itogo2 = bbb1 + (bbbb1 / (2*bbb1));


/*
        System.out.println("Длинна вектора x1y2 " + x1y2);
        System.out.println("Длинна вектора y1x2 " + y1x2);
        System.out.println("Число в кваррате для первого " + aaa1);
        System.out.println("Число в кваррате для первого остаток от корня " + aaaa1);

 */
        System.out.println("Длинна вектора x1y2 " + itogo1);
        System.out.println("Длинна вектора y1x2 " + itogo2);

    }
}
