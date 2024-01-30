package Recursion.Arrays;

public class RotatedBS {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,789};
        System.out.println(RBS(arr,789,0,arr.length-1));

    }
    static int RBS(int[] arr,int target,int start,int end){
        if(start>end){
            return -1;
        }
        int mid=start+(end-start)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(arr[start]<=arr[mid]){
            if(target>=arr[start] && target<=arr[mid]){
                return RBS(arr,target,start,mid-1);
            }
            else return RBS(arr,target,mid+1,end);
        }
        if(target>=arr[mid] && target<=arr[end]){
            return RBS(arr,target,mid+1,end);
        }
        return RBS(arr,target,start,mid-1);

    }

}
