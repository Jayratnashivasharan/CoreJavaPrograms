public class Jay extends Honey{
    public void makeHoney() {
      System.out.println("Jay is making honey");
    }
    public static void main(String[] args) {
        Jay jay = new Jay();
        jay.makeHoney();
        jay.fly();
    }
}