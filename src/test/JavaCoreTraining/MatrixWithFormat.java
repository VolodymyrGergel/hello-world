/**
 * Created by Volodymyr.Gergel on 3/10/2016.
 */
public class MatrixWithFormat {

        public static void main(String[] args) {
            final int columnsNumber = 30;
            for (int value = 1; value <= 900; value++) {
                    System.out.format(value + "\t");
                if (value % columnsNumber == 0) {
                    System.out.println();
                }

            }
        }
    }

