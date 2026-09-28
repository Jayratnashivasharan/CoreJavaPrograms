package Demo;

public class loopp {
        static void main() {
//        for (start; condition; increment/decremenet)
            for (int i = 1; i <= 10; i++) {
                System.out.println(i * 2);

//        While loop(Entry control loop)
                int j = 1;
                while (j <= 10) {
                    System.out.println(j * 3);
                    j++;//increment/decrement
                }
                //DO-While loop(Exit control loop)
                do {
                    System.out.println(i * 9);
                    i++;//increment/decrement
                } while (i <= 10);//end
            }
        }

}
