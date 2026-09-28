package Demo;

import java.util.Scanner;

public class ScanerClassUsing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter second number: ");
        int secondNumber = scanner.nextInt();

        System.out.print("Enter a string: ");
        String text = scanner.next();

        int sum = firstNumber + secondNumber;
        System.out.println("\nSum = " + sum);
        System.out.println("String = " + text);
        System.out.println("First character = " + text.charAt(0));
    }
}
