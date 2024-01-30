package BinarySearch;

public class CeilingofaNumber {

    public static void main(String[] args) {
        int[] arr={2,4,8,10,12,16};
        int target=9;
        System.out.println(ceiling(arr,target));


    }
    static int ceiling(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target>arr[mid]){
                start=mid+1;
            }
            else if(target<arr[mid]){
                end=mid-1;
            }
            else if(target==arr[mid]){
                return arr[mid];
            }
        }
        return arr[end];
    }
}
