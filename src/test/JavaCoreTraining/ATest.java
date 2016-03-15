/**
 * Created by Volodymyr.Gergel on 3/11/2016.
 */
import junit.framework.Assert;
import org.junit.Test;

import static junit.framework.Assert.*;

public class ATest {
    @Test
    public void testAdd1() {
        assertEquals(7, A.add(2, 5)); // Первый тест
    }

    @Test
    public void testAdd2() {
        assertEquals(12, A.add(3, 9)); // Второй тест
    }

    public static class A {
        public static int add(int a, int b) {
          return a + b;
        }
   }

}

