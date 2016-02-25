/**
 * Created by Volodymyr.Gergel on 2/25/2016.
 */
public class For {

    public static void main(String[] args) {

        int sum = 0;
        for (int j = 2; j <= 100; j = j + 2) {
            sum = sum + j;
            System.out.println(sum);
        }
    }
}
