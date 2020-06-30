package by.epamtc.bobkov.main;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        if ((size > 0) && (size % 2 == 0)) {
            print(createSquareMatrix(size));
        } else {
            System.out.println("Неправильно заданы размеры матрицы");
            scanner.close();
        }
    }

    public static int [] [] createSquareMatrix(int size) {
        int[][] matrix = new int[size][size];

        for (int i = 0; i < size / 2; i++) {
            for (int j = i; j < size - i; j++) {
                matrix[i][j] = 1;
            }
        }

        for (int i = size - 1; i >= size / 2; i--) {
            for (int j = size - 1 - i; j < size - (size - 1 - i); j++) {
                matrix[i][j] = 1;
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
