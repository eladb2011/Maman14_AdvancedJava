/**
 * User: EladB
 * Description:
 */
public class OneCellMultiplication extends Thread {

    private int[] row;
    private int[] col;
    private static int result;

    public OneCellMultiplication(int[] row, int[] col) {
        super();
        this.row = row;
        this.col = col;
        result = 0;
    }

    @Override
    public void run() {
        multiply();
        notify();
    }

    public void multiply() {

        for(int i=0; i < row.length; i++) {
            result += row[i] * col[i];
        }
    }

    public int getResult() {
        return result;
    }
}
