public class Recursion{
    public void toh(int n,char s, char d, char h){
        if(n==0){
            return;
        }
        toh(n-1,s,h,d);
        System.out.println("Move disk "+n+" from "+s+" to "+d);
        toh(n-1,h,d,s);
    }
    public static void main(String[] args){
        Recursion r = new Recursion();
        r.toh(3,'A','C','B');
    }
}