
import org.junit.*;
import static org.junit.Assert.*;

/**
 * Created by Volodymyr.Gergel on 3/11/2016.
 */
public class HomeWork1Test {

    @Before
    public void setUp() {
         HomeWork1 tester = new HomeWork1();
    }

    @Test
    public void test1HomeWork1() throws Exception {
      //  double d4 = HomeWork1.sqrt( 1, 2, 3 );
         double d1 = HomeWork1.getD( 2, 3, 4 );
         assertTrue( d1 == 0 );
        }

    @Test
    public void test2HomeWork1() throws Exception {
       double x1 = HomeWork1.sqrt( 0, 2, 3 );
       assertTrue( x1 == 0 );
    }

    @Test
    public void test3HomeWork1() throws Exception {
      int a1 = (int) HomeWork1.sqrt( 1, 2, 3 );
       assertEquals( a1, 0 );
    }

}




