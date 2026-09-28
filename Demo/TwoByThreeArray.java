package Demo;

public class TwoByThreeArray {
   
    public static void main(String[] args) {
 int  [][] array = new int[2][3];
        array[0][0] = 1;
        array[0][1] = 2;
        array[1][0] = 4;
        array[1][1] = 5;
        array[1][2] = 3;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
    }