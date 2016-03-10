
public class test {
    public static void main(String[] args) {

        String st1 = "Hellowoooorld";
        StringBuffer st4 = new StringBuffer();
        StringBuffer st5 = new StringBuffer();
        int index = 1;

        char[] ch1 = st1.toCharArray();
        for (int i = 1; i < ch1.length; i++) {
            st4.append(ch1[i-1]);
            if (ch1[i-1] == (ch1[i])) {
                while (ch1[i-1] == (ch1[i])) {
                    i++;
                    index++;
                }
                st4.append(index);
                index = 1;
            }



        }

        System.out.println(st4);

        String st6 = st4.toString();
        char[] ch2 = st6.toCharArray();
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
        System.out.println(st5);
        }

}
