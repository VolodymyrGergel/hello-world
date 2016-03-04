import java.util.Random;
import java.util.StringTokenizer;

/**
 * Created by Volodymyr.Gergel on 3/3/2016.
 */


// public static int parseInt(String s, int radix)

import java.util.*;

public class test {
    public static void main(String[] args) {
        String a = "hellowoooorld";
        int d = 1;
        //char[] b = a.toCharArray();
        for (int i = 0; i < 10; i++) {
            char b = a.charAt(i);
            char c = a.charAt(i+1);
            if (b == c) {
                d++;
            }
        }
      //  StringTokenizer b = new StringTokenizer(a);
        System.out.println(b);


            }


}
