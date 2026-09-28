package Demo;
import java.util.Scanner;

///
public class ScanerClassUsing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter second number: ");
        int secondNumber = scanner.nextInt();

        System.out.print(" Enter a string");
        String string= scanner.next().toString();
        char c = string.charAt(0);

        int sum = firstNumber + secondNumber;
        System.out.println("Sum = " + sum);
        System.out.println(string);
        System.out.println(c);
    }
}
