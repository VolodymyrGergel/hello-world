import java.util.ArrayList;
import java.util.List;

public class Hellowoooorld {
    public static void main(String[] args) {

        String st1 = "Hellowoooorld";
        StringBuffer st4 = new StringBuffer();
        StringBuffer st5 = new StringBuffer();
        int index = 1;

        char[] ch1 = st1.toCharArray();
        compression(st4, index, ch1);
        System.out.println(st4);

        String st6 = st4.toString();
        char[] ch2 = st6.toCharArray();
        decompression(st5, ch2);
        System.out.println(st5);
    }

    private static void compression(StringBuffer st4, int index, char[] ch1) {
        for (int i = 0; i < ch1.length-1; i++) {
            st4.append(ch1[i]);
            if (ch1[i] == (ch1[i+1])) {
                while (ch1[i] == (ch1[i + 1])) {
                    i++;
                    index++;
                }
                st4.append(index);
                index = 1;
            }
            if (i == ch1.length - 2) {
            st4.append(ch1[i + 1]);
            }

        }
    }

    private static void decompression(StringBuffer st5, char[] ch2) {
        for (int i = 0; i < ch2.length; i++) {
            if (ch2[i] == '2') {
                st5.append(ch2[i-1]);
            }
            else if (ch2[i] == '4') {
                st5.append(ch2[i-1]).append(ch2[i-1]).append(ch2[i-1]);
            }

            else {
                st5.append(ch2[i]);
            }

        }
    }

}
