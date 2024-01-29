package BinarySearch;

import java.util.Arrays;

public class AggressiveCows {
    public static void main(String[] args) {
        int[] stalls={87 ,93 ,51 ,81, 68, 99, 59 };
        System.out.println(aggressiveCows(stalls,4));
    }
    public static int aggressiveCows(int[] stalls, int k) {
        Arrays.sort(stalls);
        System.out.println(Arrays.toString(stalls));
        int start=1;
        int end=stalls[stalls.length-1]-stalls[0];
        int ans=-1;
        while(start<=end){

            int mid=start+(end-start)/2;
            if(CanPlace(stalls,k,mid)){
                start=mid+1;
                ans=mid;

            }
            else end=mid-1;

        }
        return ans;
        //    Write your code here.
    }

    public static boolean CanPlace(int[] arr,int k,int mid){
        int cows=1;
        int last=arr[0];

        for (int i = 1; i < arr.length; i++) {
            if((arr[i]-last)>=mid){
                cows++;
                last=arr[i];

            }
            else continue;
            if(cows>=k){
                return true;
            }

        }
        return false;

    }
}
