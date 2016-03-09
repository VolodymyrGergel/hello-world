/**
 * Created by Volodymyr.Gergel on 3/9/2016.
 */
public class Hellowoooorld {
    public static void main(String[] args) {
        String st1 = "Hellowoooorld";
        String[] st2 = {"H", "e", "l", "l", "o", "w", "o", "o", "o", "o", "r", "l", "d"};
        String[] st3 = new String[st2.length];
        StringBuffer st4 = new StringBuffer();
        int index = 1;
            for (int i = 0; i < st2.length-1; i++) {
                st3[i] = st2[i];
                System.out.print(st3[i]);
                if (st2[i].equals(st2[i+1])) {
                    while (st2[i].equals(st2[i+1])) {
                        i++;
                        index++;
                        st3[i] = String.valueOf(index);
                    }
                    System.out.print(st3[i]);
                    index = 1;
                }
                if (i == st2.length-2) {
                st3[i+1] = st2[i+1];
                System.out.print(st3[i+1]);
}
            }


System.out.println();

for (int i=0; i<st3.length; i++){
System.out.print(st3[i]);
}


        System.out.println();

        for (int i = 0; i < st3.length; i++) {
            if (st3[i].equals("2")) {
                st4.append(st3[i-1]);
            }

            else if (st3[i].equals("4")) {
                st4.append(st3[i-1]).append(st3[i-1]).append(st3[i-1]);
            }

            else {
                st4.append(st3[i]);
            }

            System.out.println(st4);
        }

    }

}
