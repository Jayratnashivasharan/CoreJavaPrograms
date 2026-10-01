public class Print_Decreasing {
    public void printDecreasing(int n) {
    if(n==0){
        return;
    }
    System.out.println(n);
    printDecreasing(n - 1);
}

public static void main(String[] args) {
    Print_Decreasing obj = new Print_Decreasing();
    obj.printDecreasing(5);
}
}
