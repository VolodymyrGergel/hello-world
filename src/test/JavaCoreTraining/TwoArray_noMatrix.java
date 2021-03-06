import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Formatter;

/**
 * Created by Volodymyr.Gergel on 3/1/2016.
 */
public class TwoArray_noMatrix {

    public static void main(String[] args) {
        final int columnsNumber = 15;
 //       Formatter fmt = new Formatter();
            for (int value = 1; value <= 225; value++) {
            int index = value - 1;
            int columnIndex  = index % columnsNumber;
            int rowIndex  = index / columnsNumber;
            boolean isRightDiagonal = rowIndex + columnIndex == columnsNumber - 1;
            if (rowIndex == columnIndex || isRightDiagonal) {
                System.out.format(" *\t");
            } else {
                System.out.format(value + "\t");
            }
            if (value % columnsNumber == 0) {
                System.out.println();
            }

        }
    }
}
