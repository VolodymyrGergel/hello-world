import java.util.Random;

/**
 * Created by Volodymyr.Gergel on 3/3/2016.
 */
public class test {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
        Random rand = new Random ();
            int a = rand.nextInt(36);
        System.out.println(a);}
    }
}
