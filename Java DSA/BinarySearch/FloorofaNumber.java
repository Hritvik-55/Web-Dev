package BinarySearch;

public class FloorofaNumber {
    public static void main(String[] args) {
        int[] arr={2,4,8,10,12,16};
        int target=2434;
        System.out.println(floor(arr,target));


    }
    static int floor(int[] arr,int target){
        int start=0;
        int end=arr.length-1;

        while (start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]>target){
                end=mid-1;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else if(arr[mid]==target){
                return arr[mid];
            }
        }
        return arr[end];
    }
}
