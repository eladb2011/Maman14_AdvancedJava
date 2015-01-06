import java.util.Random;

/**
 * User: EladB
 * Description:
 */
public class Matrix {

    public int matrix[][];
    private int rows;
    private int cols;

    public Matrix(int rows, int cols, boolean isAutoRand) {
        this.rows = rows;
        this.cols = cols;
        matrix = new int[rows][cols];
        if (isAutoRand) {
            generateMatrixWithRandomValues();
        }
    }

    private void generateMatrixWithRandomValues() {
        Random rand = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(10);
            }
        }
    }

    public int getCell(int row, int col) {
        return matrix[row][col];
    }

    public int getRows() {
        return rows;
    }

    public int getCols() {
        return cols;
    }

    public int[] getRow(int rowIndex) {
        int[] res = new int[cols];

        for (int j = 0; j < cols; j++) {
            res[j] = matrix[rowIndex][j];
        }
        return res;
    }

    public int[] getCol(int colIndex) {
        int[] res = new int[rows];

        for (int j = 0; j < rows; j++) {
            res[j] = matrix[j][colIndex];
        }
        return res;
    }

    public void printMatrix() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
