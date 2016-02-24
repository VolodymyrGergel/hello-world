/**
 * Created by Volodymyr.Gergel on 2/24/2016.
 */

import java.lang.Math;

public class HomeWork1 {

    public static void main(String[] args) {
        double a, b, c, d, x1, x2;
        a = 1;
        if (a == 0) {
            a = 0.00000000000000000000001;
        }
        b = 2;
        c = 0;
        d = Math.pow(b, 2) - 4 * a * c;
        System.out.println("D: " + d);
        if (d > 0) {
            x1 = (-b + Math.sqrt(d)) / (2 * a);
            x2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("x1: " + x1);
            System.out.println("x2: " + x2);
        }
            else if (d == 0) {
            x1 = x2 = -b / (2 * a);
            System.out.println("x1 and x2: " + x1);
        }
            else
            System.out.println("No square root");
        }

}
