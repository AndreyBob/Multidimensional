package by.epamtc.bobkov.main;

public class Task02 {
    public static void main(String[] args) {
        int n = 8;
        if ((n % 2) == 0) {
            print(createSquareMatrix(n));
        } else {
            System.out.println("Введите другое число");
        }
    }

    public static int[][] createSquareMatrix(int size) {
        int[][] squareMatrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            squareMatrix[i][i] = (1 + i) * (2 + i);
        }
        return squareMatrix;
    }

    public static void print(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
