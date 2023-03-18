package mate.academy;

public class MatrixDiagonal {
    public static void main(String[] args) {
        int[][] matrixTest = {{0, 1, 2},
                              {4, 5, 6},
                              {1, 1, 1}};

        getDiagonal(matrixTest);
    }

    public static int[] getDiagonal(int[][] matrix) {
        int[] returnInt = new int[3];
        for (int i = 0; i < matrix.length; i++) {
            returnInt[i] = matrix[i][i];
        }
        return returnInt;
    }

    public int[] getCounterDiagonal(int[][] matrix) {
        int[] returnInt = new int[3];
        for (int i = 0; i < matrix.length; i++) {
            returnInt[i] = matrix[i][matrix[i].length - i];
        }
        return returnInt;
    }
}

