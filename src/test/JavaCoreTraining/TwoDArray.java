
/**
 * Created by Volodymyr.Gergel on 2/24/2016.
 */
public class TwoDArray {

    public static void main(String[] args) {
        String[][] matrix  = {{"*", "2", "3", "4", "*"}, {"6", "*", "8", "*", "10"}, {"11", "12", "*", "14", "15"}, {"16", "*", "18", "*", "20"}, {"*", "22", "23", "24", "*"}};
        //int[][] matrix  = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}, {16, 17, 18, 19, 20}, {21, 22, 23, 24, 25}};

    for(int X = 0; X < matrix.length; X++) {
        for(int Y = 0; Y < matrix[X].length; Y++) {
            System.out.print(matrix[X][Y] + "\t");
        }
        System.out.println(); // Переходим на следующую строку
    }

    }

}
