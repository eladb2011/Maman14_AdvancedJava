/**
 * User: EladB
 * Description:
 */
public class Monitor {

    private Matrix m1;
    private Matrix m2;
    private Matrix resMat;
    private OneCellMultiplication[] threadsArray;

    public Monitor() {
        m1 = new Matrix(3, 4, true);
        m2 = new Matrix(2, 5, true);
        resMat = new Matrix(m1.getRows(), m2.getCols(), false);
    }

    public void run() {
        initializeThreadsArray();
        startAllThreadsInThreadsArray();

//        resMat = getResultFromMonitor();
//        printResultMatrix();
    }

    private void initializeThreadsArray() {
        int arraySize = m1.getRows() * m2.getCols();
        threadsArray = new OneCellMultiplication[arraySize];
        int length = threadsArray.length / m1.getRows();

        for (int i = 0; i < length; i++) {
            threadsArray[i] = new OneCellMultiplication(m1.getRow(i), m2.getCol(i));

            if(length == m1.getRows()) {
                length = 0;
            }
        }
    }

    private void startAllThreadsInThreadsArray() {
        for (int i = 0; i < threadsArray.length; i++) {
            threadsArray[i].start();
        }
    }

    private int[] getColVector(int i, int colSize) {
        int[] res = new int[colSize];


        return res;
    }

    private int[] getRowVector(int i, int rowSize) {
        int[] res = new int[rowSize];


        return res;
    }
}
