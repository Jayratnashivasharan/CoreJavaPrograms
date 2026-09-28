package Demo;

public class Stringg {
    public static void main(String[] args) {
        String name = "Honey";
        String a = name;
        String c = "Honey";
        String d = new String("Jay");

        System.out.println(a);
        System.out.println(a == c);
        System.out.println(a == d);
        System.out.println(c);
        System.out.println(d);
        System.out.println(name.equals(c));
        System.out.println("END STRING");

        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            System.out.println(ch);
        }

        System.out.println("Reversed string:");
        for (int j = 0; j < name.length(); j++) {
            System.out.println(name.charAt(name.length() - 1 - j));
        }

        String ans = "";
        System.out.println("\nReversed using string build:");
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            ans = ch + ans;
            System.out.print(ans);
        }
        System.out.println();
    }
}
