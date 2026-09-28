package Demo;

public class loopp {
    public static void main(String[] args) {
        System.out.println("For loop:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i * 2);
        }

        System.out.println("\nWhile loop:");
        int j = 1;
        while (j <= 10) {
            System.out.println(j * 3);
            j++;
        }

        System.out.println("\nDo-While loop:");
        int k = 1;
        do {
            System.out.println(k * 9);
            k++;
        } while (k <= 10);
    }
}
