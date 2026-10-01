public class Print_Increasing_And_Decreasing {
    public void printDecreasing(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        printDecreasing(n-1);
        System.out.println(n);
}
public static void main(String[] args) {
        Print_Increasing_And_Decreasing obj = new Print_Increasing_And_Decreasing();
        System.out.println("Decreasing Order:");
        obj.printDecreasing(3);
    }
}
