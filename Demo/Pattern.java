package Demo;

public class Pattern {
    static void main() {
//        11111
//        22222
//        33333
//        44444
//        55555
//        Nested Loop
        for (int i=1;i<=5;i++){
            for (int j=1;j<=5;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        for (int a=1; a<=5;a++){
            for (int b=1; b<=a;b++){
                System.out.print(b +" ");
            }
            System.out.println();
        }
//        Pyramid
        System.out.println("Pyramid:");
        int rows = 0;
        for (int i = 1; i <= rows; i++) {
            for (int space = 1; space <= rows - i; space++) {
                System.out.print(" ");
            }

            for (int star = 1; star <= 2 * i - 1; star++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Pascal's Triangle
        System.out.println("\nPascal's Triangle:");
        for (int i = 0; i < rows; i++) {
            int value = 1;

            for (int j = 0; j <= i; j++) {
                System.out.print(value + " ");
                value = value * (i - j) / (j + 1);
            }

            System.out.println();
        }
    }
}
