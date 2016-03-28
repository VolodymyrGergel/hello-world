/**
 * Created by Volodymyr.Gergel on 3/18/2016.
 */
public class InnerDemo {
    // create an array
    private final static int SIZE = 15;
    private int[] arrayOfInts = new int[SIZE];

    public InnerDemo() {
// fill the array with ascending integer values
        for (int i = 0; i < arrayOfInts.length; i++) {
            arrayOfInts[i] = i;
        }
    }

    public void printEven() {
// print out values of even indices of the array
        InnerEvenIterator iterator = this.new InnerEvenIterator();
        while (iterator.hasNext()) {
            System.out.println( iterator.getNext() + " " );
        }
    }

    private class InnerEvenIterator {
        // start stepping through the array from the beginning
        private int next = 0;
        public boolean hasNext() {
// check if a current element is the last in the array
            return (next <= arrayOfInts.length - 1);
        }
        public int getNext() {
// record a value of an even index of the array
            int retValue = arrayOfInts[next];
//get the next even element
            next += 2;
            return retValue;
        }
    }

}