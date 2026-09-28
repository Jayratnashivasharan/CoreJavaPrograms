package Demo;

public class MatrixAddition {
    public static void main(String[] args) {
    int [][] matrix1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    int [][] matrix2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    int [][] result = new int[3][3];
    for (int i=0;i<matrix1.length;i++){
        for (int j=0;j<matrix1[i].length;j++){
            result[i][j]=matrix1[i][j]+matrix2[i][j];
        }
    }
    System.out.println("Resultant Matrix:");
    for(int i=0;i<result.length;i++){
        for (int j=0;j<result[i].length;j++){
            System.out.print(result[i][j]+"\t");
        }
        System.out.println();
    }
}
}
   