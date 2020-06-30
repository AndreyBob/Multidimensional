package by.epamtc.bobkov.main;

import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите размер магического квадрата:");
        int n = scanner.nextInt();
        while (n < 1) {
            System.out.println("Введите размер больше нуля");
            n = scanner.nextInt();
        }
        int[] array = new int[n*n];
        int[][] matrix = new int[n][n];

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        while (!isMagic(array, matrix)) {
            swapNums(array);
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }


    public static void swapNums(int[] array) {
        int a;
        int b;
        a = (int) (Math.random() * array.length);
        b = (int) (Math.random() * array.length);
        int tempIndex;
        tempIndex = array[a];
        array[a] = array[b];
        array[b] = tempIndex;
    }


    public static boolean isMagic(int[] array, int[][] matrix) {
        int c = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = array[c];
                c++;
            }
        }
        return cheсkSum(matrix);
    }


    public static boolean cheсkSum(int[][] matrix) {
        int magicConst = matrix.length * (matrix.length * matrix.length + 1) / 2;
        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
            if (sum != magicConst) {
                return false;
            }
            sum = 0;
        }
        sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[j][i];
            }
            if (sum != magicConst) {
                return false;
            }
            sum = 0;
        }
        sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
        }
        if (sum != magicConst) {
            return false;
        }
        sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][matrix.length - i - 1];
        }
        if (sum != magicConst) {
            return false;
        }

        return true;
    }

}