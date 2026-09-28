package Demo;

public class MatrixMultiplication {

    public static void main(String[] args) {

        int[][] matrix1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] matrix2 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] result = new int[3][3];

        for (int i = 0; i < matrix1.length; i++) {

            for (int j = 0; j < matrix2[i].length; j++) {

                for (int k = 0; k < matrix2.length; k++) {

                    result[i][j] += matrix1[i][k] * matrix2[k][j];

                }
            }
        }

        // Print result
        System.out.println("Matrix Multiplication:");

        for (int i = 0; i < result.length; i++) {

            for (int j = 0; j < result[i].length; j++) {

                System.out.print(result[i][j] + "\t");

            }

            System.out.println();
        }
    }
}