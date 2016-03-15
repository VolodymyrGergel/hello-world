/**
 * Created by Volodymyr.Gergel on 3/11/2016.
 */
public class Exc2 {

        public static void main(String args[]) {
        int d, a;
        try { // контролировать блок кода
            d = 0;
            a = 42 / d;
            System.out.println("Это не будет напечатано.");
        }
        catch (ArithmeticException e) {
// перехватить ошибку деления на нуль
           System.out.println("Деление на нуль.");
        }
        System.out.println("После оператора catch.");
    }

}
