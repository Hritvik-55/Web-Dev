package BinarySearch;

public class NoofRotationsinRotatedArray {
    public static void main(String[] args) {
        int[] arr={15,18,2,3,6,12};
        System.out.println(getMinimum(arr));

    }
    static int getMinimum(int[] arr){
        if(arr.length==0){
            return -1;
        }
        int start=0;
        int end=arr.length-1;
        if(arr[start]==arr[end]){
            return -1;
        }
        while (start<=end){
            int mid=start+(end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid+1;
            }
            else if(mid>start && arr[mid]<arr[mid-1]){
                return mid;
            }
            else if(arr[mid]>arr[end]){
                start=mid+1;
            }
            else end=mid-1;


        }
        return start;
    }
}
