package Demo;

public class Arrays {
    public static void main(String[] args) {

//        int [][]arr={{1,2,3,},{5,6,7},{1,2,1}};
//        System.out.println(arr.length);
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//        }

        int [][]array=new int[3][3];
        array[0][0]=1;
        array[0][1]=2;
        array[0][2]=3;
        array[1][0]=4;
        array[1][1]=5;
        array[1][2]=6;
        array[2][0]=7;
        array[2][1]=8;
        array[2][2]=9;
        for (int i=0;i<array.length;i++){
            for (int j=0;j<array[i].length;j++){
                System.out.print(array[i][j]+"\t");
            }
            System.out.println("");
        }
    }
}
