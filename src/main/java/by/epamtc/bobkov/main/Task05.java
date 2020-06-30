package by.epamtc.bobkov.main;

public class Task05 {
    public static void main(String[] args) {
        double[][] matrix1 = {{1, 2}, {2, 3}, {3, 2}};
        double[][] matrix2 = {{1, 2, 1}, {2, 3, 2}};
        System.out.println("Произведение матриц равно:");
        print(multiOfMatrix(matrix1, matrix2));

    }

    public static double[][] multiOfMatrix(double[][] firstMatrix, double[][] secondMatrix) {
        int rowMatrix = firstMatrix.length;
        int columnMatrix = rowMatrix;
       double[][] resultMatrix = new double[rowMatrix][columnMatrix];
        for (int i = 0; i < rowMatrix; i++) {
            for (int j = 0; j < columnMatrix; j++) {
                for (int k = 0; k < secondMatrix.length; k++) {
                    resultMatrix[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
                }
            }
        }
        return resultMatrix;
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
