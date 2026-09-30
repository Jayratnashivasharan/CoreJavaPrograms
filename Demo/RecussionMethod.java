package Demo;

public class RecussionMethod {
    public void a(){
        System.out.println("Method A");
        b();
        System.out.println("Method A");
    }
    public void b(){
        System.out.println("Method B");
        c();
        System.out.println("Method B");
    }
    public void c(){
        System.out.println("Method C");
    }
    
    public static void main(String[] args) {
        RecussionMethod obj = new RecussionMethod();
        obj.a();
    }
}