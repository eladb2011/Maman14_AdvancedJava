import java.util.Random;

/**
 * User: EladB
 * Description:
 */
public class Matrix {

    private int matrix[][];
    private int rows;
    private int cols;

    public Matrix(int rows, int cols, boolean isAutoRand) {
        this.rows = rows;
        this.cols = cols;
        matrix = new int[rows][cols];
        if(isAutoRand) {
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

    public int getRows(){
        return rows;
    }

    public int getCols() {
        return cols;
    }
}
