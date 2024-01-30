package BinarySearch;

public class SquareRoot {
    public int mySqrt(int x) {
        if(x==0){
            return 0;
        }
        if (x==1){
            return 1;
        }
        int start=0;
        int end=x;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid*mid==x){
                return mid;
            }
            else if((long)mid*mid>(long)x){
                end=mid-1;
            }
            else start=mid+1;
        }
        return Math.round(end);




    }
}
