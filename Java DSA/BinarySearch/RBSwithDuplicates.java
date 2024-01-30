package BinarySearch;

public class RBSwithDuplicates {
    public static void main(String[] args) {
        int[] arr={1,1};
        System.out.println(solution(arr,0));
    }

    static int solution(int[] nums,int target){
        int pivot=PivotWithDuplicates(nums);
        if(pivot==-1){
            return RBS(nums,target,0,nums.length-1);
        }
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
    static int RBS(int[] arr,int target,int start,int end) {

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else return mid;
        }
        return -1;
    }
    static int PivotWithDuplicates(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            //Cases from here
            //Case1
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            //Case2
             if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            //Case3
            if(arr[start]==arr[mid] && arr[mid]==arr[end]){
                if(start<end && arr[start]>arr[start+1]){
                    return start;
                }
                start++;

                if(end>start && arr[end]<arr[end-1]){
                    return end-1;
                }
                end--;
            }
            //Case4
            else if(arr[start]<arr[mid] || arr[start]==arr[mid] && arr[mid]>arr[end]){
                start=mid+1;
            }
            else end=mid-1;
        }
        return -1;
    }
}
