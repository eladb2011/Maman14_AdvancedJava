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

        for(int i=0; i < threadsArray.length; i++) {
            threadsArray[i] = new OneCellMultiplication(getRowVector(i), getColVector(i));
        }
    }

    private void startAllThreadsInThreadsArray() {
        for(int i=0; i < threadsArray.length; i++) {
            threadsArray[i].start();
        }
    }

    private int[] getColVector(int i) {
        return new int[0];
    }

    private int[] getRowVector(int i) {
        return new int[0];
    }
}
