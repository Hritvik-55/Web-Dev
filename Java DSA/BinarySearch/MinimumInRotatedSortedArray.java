package BinarySearch;

public class MinimumInRotatedSortedArray {
    public int findMin(int[] nums) {
        int pivot=pivot(nums);
        return nums[pivot+1];

    }

    int pivot(int[] nums){
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid<end && nums[mid]>nums[mid+1]){
                return mid;
            }
            else if(mid>start && nums[mid]<nums[mid-1]){
                return mid-1;
            }
            if(nums[start]<=nums[mid]){
                start=mid+1;

            }
            else end=mid-1;
        }
        return -1;
    }
}
