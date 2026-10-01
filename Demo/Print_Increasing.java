public class Print_Increasing {
    public void PrintIncreasing(int n) {
        if (n == 0) {
            return;
        }
        PrintIncreasing(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        Print_Increasing obj = new Print_Increasing();
        obj.PrintIncreasing(5);
    }
}
