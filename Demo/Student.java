package Demo;

public class Student extends Teacher {

    int c;

    public void sleeping() {
        System.out.println("Student is sleeping");
    }

    @Override
    public void occupation() {
        System.out.println("Student is studying");
    }

    public static void main(String[] args) {

        Student s = new Student();
        Teacher t = new Teacher();
        t.occupation();
        Teacher t1 = new Student();
        t1.occupation();
        s.sleeping();       
        s.occupation();
    }
}