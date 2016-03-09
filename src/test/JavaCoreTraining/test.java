import java.util.Random;
import java.util.StringTokenizer;

/**
 * Created by Volodymyr.Gergel on 3/3/2016.
 */


// public static int parseInt(String s, int radix)

import java.util.*;

public class test {
    public static void main(String[] args) {
        String[] a = {"h", "e", "l", "l", "o", "w", "o", "o", "o", "o", "r", "l", "d"};
        int d = 1;
        for (int i = 0; i < a.length - 1; i++) {
            while (a[i] == a[i+1]) {
                d++;
                a[i+1] = String.valueOf(d);
            }
            System.out.print(a[i]);
            }



//        char[] e = a.toCharArray();
            //       int d = 1;
//        for (int i = 1; i < e.length; i++) {

            //               d++;
            // e[i] = (char) d;
//                return a.substring(0,i) + d + a.substring(i+1);
//            }

            //           System.out.println(e);
        }

    }


//    indexOf(int ch) - поиск первого вхождения символа в строке;

   // public static String replaceCharAt(String s, int pos, char c) {

    //    return s.substring(0,pos) + c + s.substring(pos+1);

  //  }