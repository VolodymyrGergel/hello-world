/**
 * Created by Volodymyr.Gergel on 2/24/2016.
 */

import java.lang.Math;

import org.junit.*;

import static junit.framework.TestCase.assertEquals;

public class HomeWork1 {

    public static void main(String[] args) throws Exception {
        try {
            int a, b, c, x1, x2;
            a = 3;
            b = 2;
            c = 1;
            double d = getD( a, b, c );
            System.out.println( "D: " + d );
            sqrt( a, b, d );
        }
        catch (Exception e) {
            System.out.println( "Exception detected!" + e.getMessage() );
            System.out.println( "Exception detected!" + e.getLocalizedMessage() );
            System.out.println( "Exception detected!" + e );
            throw e;
        }
    }
    public static double sqrt(double a, double b, double d) {
        double x1 = 0;
        double x2 = 0;
        if (d > 0) {
            x1 = (-b + Math.sqrt( d )) / (2 * a);
            x2 = (-b - Math.sqrt( d )) / (2 * a);
            System.out.println( "x1: " + x1 );
            System.out.println( "x2: " + x2 );
        } else if (d == 0) {
            x1 = x2 = -b / (2 * a);
            System.out.println( "x1 and x2: " + x1 );
        } else
            System.out.println( "No square root" );
        //int r = 1 / 0;
        return x1;
    }

    public static double getD(double a, double b, double c) {
        return Math.pow(b, 2) - 4 * a * c;

    }

}
