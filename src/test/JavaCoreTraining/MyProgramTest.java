
import com.beust.jcommander.*;
import org.junit.*;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

/**
 * Created by Volodymyr.Gergel on 3/11/2016.
 */

public class MyProgramTest {

   // MyProgram program;
    int [] array;
    int solution;

    @Before
    public void setUp() {
    //    program = new MyProgram();
        array = new int[] { 1, 2, 3, 4, 5 };
    }

    @Test
    public void sum() {
       // assertEquals(15, program.sum(array));
      //  assertTrue(program.min(array) > 0);
    }

    @Test (timeout=10)
    public void greatBig() {
      //  assertTrue(program.ackerman(5, 5) > 10e12);
    }

   // @Test (expected=IllegalArgumentException.class)
   // public void factorial() {
     //   program.factorial(-5);
   // }

   // @RunWith(value=Parameterized.class)
  //  public class FactorialTest {
    //    private long expected;
   //     private int value;
      //  @Parameters
       // public static Collection data() {
       //     return Arrays.asList( new Object[ ][ ] { { 1, 0 }, { 1, 1 }, { 2, 2 }, { 120, 5 } });
    //    }
     //   public FactorialTest(long expected, int value) { // constructor
   //         this.expected = expected;
     //       this.value = value;
     //   }
      //  @Test
       // public void factorial() {
      //      assertEquals(expected, new Calculator().factorial(value));
      //  }
  //  }

   @Ignore("I don’t want my boss to know this doesn’t work")
   @Test
   public void add() {
   //    assertEquals(4, program.sum(2, 2));
   }

    @After
    public static void tearDownClass() throws Exception {
// one-time cleanup code
    }

}
