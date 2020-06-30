package by.epamtc.bobkov.main;

public class Task04 {
    public static void main(String[] args) {
        double[] massive = {1, 2, 3, 4};
        print(createSquareMatrix(massive));

    }

    public static double[][] createSquareMatrix(double[] linerMassive) {
        int size = linerMassive.length;
        double[][] squareMatrix = new double[size][size];
        for (int i = 0; i < linerMassive.length; i++) {
            for (int j = 0; j < linerMassive.length; j++) {
                squareMatrix[i][j] = Math.pow(linerMassive[j], 1 + i);
            }
        }
        return squareMatrix;
    }

    public static void print(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t" + " ");
            }
            System.out.println();
        }
    }
}
