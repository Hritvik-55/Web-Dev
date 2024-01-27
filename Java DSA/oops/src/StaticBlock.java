public class StaticBlock {
    static int a=4;
    static int b;
    static {
        b=a*5;
    }

    public static void main(String[] args) {
        System.out.println(a+" "+b);
        b=3;
    }
}
