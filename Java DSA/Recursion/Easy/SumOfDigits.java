package Recursion.Easy;

public class SumOfDigits {
    public static void main(String[] args) {
        int ans=Sum(9000);
        System.out.println(ans);

    }
    static int Sum(int n){
        if(n==0){
            return 0;
        }
        return Sum(n/10)+(n%10);
    }
}
