/**
 * User: EladB
 * Description:
 */
class Multiply extends MatrixMultiplication {

    private int i;
    private int j;
    private int chance;

    public Multiply(int i, int j) {
        this.i = i;
        this.j = j;
        chance = 0;
    }

    //Matrix Multiplication Function
    public synchronized void multiplyMatrix() {

        int sum = 0;
        int a = 0;
        for (a = 0; a < i; a++) {
            sum = 0;
            for (int b = 0; b < j; b++) {
                sum = sum + m1.matrix[chance][b] * m2.matrix[b][a];
            }
            result[chance][a] = sum;
        }

        if (chance >= i)
            return;
        chance++;
    }
}