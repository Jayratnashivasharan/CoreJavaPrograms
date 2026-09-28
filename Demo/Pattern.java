package Demo;

public class Pattern {
    public static void main(String[] args) {
        System.out.println("Pattern 1:");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println("\nPattern 2:");
        for (int a = 1; a <= 5; a++) {
            for (int b = 1; b <= a; b++) {
                System.out.print(b + " ");
            }
            System.out.println();
        }

        System.out.println("\nPyramid:");
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            for (int space = 1; space <= rows - i; space++) {
                System.out.print(" ");
            }

            for (int star = 1; star <= 2 * i - 1; star++) {
                System.out.print("*");
            }

            System.out.println();
        }

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
