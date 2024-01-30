package Recursion.Easy;

public class ProductofDigits {
    public static void main(String[] args) {
        int ans=product(505);
        System.out.println(ans);

    }
    static int product(int n){
        if(n<=10){
            return n;
        }
        return product(n/10)*(n%10);
    }
}
