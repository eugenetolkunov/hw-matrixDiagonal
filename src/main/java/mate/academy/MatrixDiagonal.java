package mate.academy;

import java.util.Arrays;

public class MatrixDiagonal {
    public static void main(String[] args) {
        int[][] matrixTest = {{0, 1, 2},
                              {4, 5, 6},
                              {1, 1, 1}};

        System.out.println(Arrays.toString(getDiagonal(matrixTest)));
        System.out.println(Arrays.toString(getCounterDiagonal(matrixTest)));
    }

    public static int[] getDiagonal(int[][] matrix) {
        int[] returnInt = new int[matrix.length];
        for(int i = 0; i < matrix.length; i++) {
            returnInt[i] = matrix[i][i];
        }
        return returnInt;
    }

    public static int[] getCounterDiagonal(int[][] matrix) {
        int[] returnInt = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            returnInt[i] = matrix[i][matrix.length-1-i];
        }
        return returnInt;
    }
}

