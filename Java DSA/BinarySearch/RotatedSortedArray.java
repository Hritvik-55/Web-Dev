package BinarySearch;

public class RotatedSortedArray {
    public static void main(String[] args) {
        int[] arr={1};
        int target=0;
        System.out.println(solution(arr,target));



    }
    static int solution(int[] nums,int target){
        int pivot=pivot(nums);
        if(nums[pivot]==target){
            return pivot;
        }
        else if(target>nums[0]){
           return  RBS(nums,target,0,pivot-1);

        }
        else if (target<nums[0]){
            return RBS(nums,target,pivot+1,nums.length-1);
        }
        else return -1;
    }
    static int RBS(int[] arr,int target,int start,int end){

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
    static int pivot(int[] arr){
        int start=0;
        int end=arr.length-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            else if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            else if(arr[start]<=arr[mid]){
                start=mid+1;
            }
            else {
                end=mid-1;
            }

        }
        return -1;
    }


}
