/**
 * Created by Volodymyr.Gergel on 3/17/2016.
 */

public class Child extends Parent {
    @Override
    public void methodToOverride() {
        System.out.println("child method");}
    public static void methodToHide() {
        System.out.println("child method to hide");}
}
