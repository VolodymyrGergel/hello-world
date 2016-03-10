
public class test {
    public static void main(String[] args) {
        String st1 = "Hellowoooorld";
        String[] st2 = {"H", "e", "l", "l", "o", "w", "o", "o", "o", "o", "r", "l", "d"};
        StringBuffer st4 = new StringBuffer();
        StringBuffer st5 = new StringBuffer();
        int index = 1;
        for (int i = 0; i < st2.length-1; i++) {
            st4.append(st2[i]);
            if (st2[i].equals(st2[i+1])) {
                while (st2[i].equals(st2[i + 1])) {
                    i++;
                    index++;
                }
                st4.append(index);
                index = 1;
            }
                if (i == st2.length - 2) {
                st4.append(st2[i + 1]);
 }

        }
        System.out.println(st4);

        String st6 = st4.toString();
        char[] ch1 = st6.toCharArray();
            for (int i = 0; i < ch1.length; i++) {
        if (ch1[i] == '2') {
        st5.append(ch1[i-1]);
        }
        else if (ch1[i] == '4') {
        st5.append(ch1[i-1]).append(ch1[i-1]).append(ch1[i-1]);
        }

        else {
        st5.append(ch1[i]);
        }

        }
        System.out.println(st5);
        }

}
