package BinarySearch;

public class CapacityToShipPackages {
    public int shipWithinDays(int[] weights, int days) {
        int start=0;
        int end=0;
        for(int i=0;i<weights.length;i++){
            start=Math.max(weights[i],start);
            end+=weights[i];
        }
        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            int totalD=MinWeight(weights,mid,days);
            if(totalD<=days){
                ans=mid;
                end=mid-1;

            }
            else start=mid+1;
        }
        return ans;

    }
    public int MinWeight(int[] arr,int mid,int days){
        int currW=0;
        int totalD=0;
        for(int i:arr){
            if(currW+i<=mid){
                currW+=i;
            }
            else {
                totalD+=1;
                currW=i;
            }
        }
        return totalD+1;
    }
}
