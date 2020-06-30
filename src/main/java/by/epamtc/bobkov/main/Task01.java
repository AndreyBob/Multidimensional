package by.epamtc.bobkov.main;

public class Task01 {

    public static void main(String[] args) {

        print(createSquareMatrix(8));
    }

    public static int [] [] createSquareMatrix(int size) {
        int [] [] matrix = new int[size] [size];
        if ((size < 0) || (size%2 != 0)) {
            return matrix;
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i % 2 == 0) {
                    matrix[i][j] = j + 1;
                } else {
                    matrix[i][j] = size - j;
                }
            }
        }
        return matrix;
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
