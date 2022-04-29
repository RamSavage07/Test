public class Breakpoint {
    public static void main(String [] args){
        int a = 1000;
        int b = 1;
        while (a > 1)
        {
            a /= b;
            b += 1;
            System.out.println(a);
            System.out.println(b);
        }
    }
}
