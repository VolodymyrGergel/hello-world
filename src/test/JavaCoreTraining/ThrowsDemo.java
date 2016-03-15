/**
 * Created by Volodymyr.Gergel on 3/11/2016.
 */
public class ThrowsDemo {

        static void throwOne() throws IllegalAccessException {
            System.out.println("Внутри throwOne.");
            throw new IllegalAccessException("demo");
        }
        public static void main(String args[])        {
            try {
                throwOne();
            }
            catch (IllegalAccessException e) {
                System.out.println("Выброс " + e);
                }
        }

}
