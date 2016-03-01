import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by Volodymyr.Gergel on 3/1/2016.
 */
public class TwoArray_noMatrix {

    public static void main(String[] args) {
        final int columnsNumber = 5;
            for (int value = 1; value <= 25; value++) {
            int index = value - 1;
            int columnIndex  = index % columnsNumber;
            int rowIndex  = index / columnsNumber;

            boolean isRightDiagonal = rowIndex + columnIndex == columnsNumber - 1;
            if (rowIndex == columnIndex || isRightDiagonal) {
                System.out.print("*\t");
            } else {
                System.out.print(value + "\t");
            }
            if (value % columnsNumber == 0) {
                System.out.println();
            }

        }
    }
}
