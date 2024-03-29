package BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={-34,-4,-1,0,2,3,10,14,22,18,23,34};
        int target=140;
        int ans=BinarySearch(arr,target);
        System.out.println(ans);

    }
    static int BinarySearch(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]>target){
                end=mid-1;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else return mid;
        }
        return -1;
    }

}
