package BinarySearch;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FirstandLastPosition {
    public static void main(String[] args) {
        int[] arr={5,7,7,8,8,10};
        int target=8;
        int[] ans=searchRange(arr,target);
        System.out.println(Arrays.toString(ans));

    }
     static public int[] searchRange(int[] nums, int target) {
        if(nums.length==0){
            return new int[] {-1,-1};
        }
        int[] ans={-1,-1};
        ans[0]=check(nums,target,true);
        ans[1]=check(nums,target,false);
        return ans;


    }
    static public int check(int[] arr,int target,boolean isFirstStart){
        int start=0;
        int end=arr.length-1;
        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]>target){
                end=mid-1;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else if(arr[mid]==target){
                //Potentail ans
                ans=mid;
                if(isFirstStart){
                    end=mid-1;

                }
                else{
                    start=mid+1;
                }
            }
        }
        return ans;

    }
}
