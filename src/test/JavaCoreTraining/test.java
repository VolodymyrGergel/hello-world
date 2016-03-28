
import static junit.framework.TestCase.assertEquals;
import org.junit.*;

public class test {
    public int calA(int a, int b){
        return a+b;
    }
}

 class CalculateTest {
    @Test
    public void main(String[] args) throws Exception {
    testCalA();
    }
    public void testCalA() {
        test calculate = new test();
        int n = calculate.calA(2, 2);
        assertEquals(4, n);
    }

}
