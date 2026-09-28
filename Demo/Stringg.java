package Demo;

public class Stringg {
    static void main(String[] args) {
        String name="Honey";
        String a=name ;
        String c="Honey";
        String d=new String("Jay");
        System.out.println(a);
        System.out.println(a==c);
        System.out.println(a==d);
        System.out.println(c);
        System.out.println(d);
        System.out.println(name.equals(c));
        System.out.println("END STRING");

        for (int i=0; i<name.length();i++){
            char c1= name.charAt(i);
            System.out.println(c1);
        }

        System.out.println("Reversed string:");
        for (int j = 0; j < name.length(); j++) {
            System.out.println(name.charAt(name.length() - 1 - j));
        }
        System.out.println();
        String ans="";
        for (int i=0; i<name.length();i++){
            char ch=name.charAt(i);
            ans = ch+ ans;
            System.out.print(ans);
        }
    }

}
