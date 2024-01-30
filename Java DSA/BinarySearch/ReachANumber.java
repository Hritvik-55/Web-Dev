package BinarySearch;

public class ReachANumber {
    public static void main(String[] args) {
        System.out.println(reachNumber(2));

    }
    static public int reachNumber(int target) {
        int sum=0;
        for(int i=1;i<=target;i++){

            if(sum+i>target){
                sum-=i;
            }
            else if(sum+i<target){
                sum+=i;
            }
            else return i;
        }
        return -1;

    }
}
