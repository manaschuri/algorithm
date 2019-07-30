package algorithms.dynamicprogramming;

/*

Input:
        1    2   3   4
        5    6   7   8
        9   10  11  12
        13  14  15  16
Output:
1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10


Input:
        1   2   3   4  5   6
        7   8   9  10  11  12
        13  14  15 16  17  18
Output:
1 2 3 4 5 6 12 18 17 16 15 14 13 7 8 9 10 11

 */

public class MatrixSpiralTraversal {

    public static void main(String[] args) {
        int[][] matrix = getMatrix();
        int i = 0, j =0;
        int firstRow = 0;
        int firstColumn = 0;
        int lastRow = matrix.length - 1;
        int lastColumn = matrix[0].length - 1;

        while (firstRow <= lastRow && firstColumn <= lastColumn) {
            for (; j <= lastColumn; j++) {
                System.out.println(matrix[i][j]);
            }

            i = i + 1;
            j = j - 1;
            firstRow = firstRow + 1;

            for (; i <= lastRow; i++) {
                System.out.println(matrix[i][j]);
            }

            i = i - 1;
            j = j - 1;
            lastColumn = lastColumn - 1;

            for (; j >= firstColumn && firstRow <= lastRow; j--) {
                System.out.println(matrix[i][j]);
            }

            i = i - 1;
            j = j + 1;
            lastRow = lastRow - 1;

            for (; i >= firstRow && firstColumn <= lastColumn; i--) {
                System.out.println(matrix[i][j]);
            }

            i = i + 1;
            j = j + 1;
            firstColumn = firstColumn + 1;
        }
    }

    private static int[][] getMatrix() {
        int counter = 1;
        int[][] matrix = new int[6][3];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = counter;
                counter ++;
            }
        }
        return matrix;
    }

    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
