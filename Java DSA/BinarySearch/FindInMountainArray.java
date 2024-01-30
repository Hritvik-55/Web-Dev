package BinarySearch;

public class FindInMountainArray {
    public static void main(String[] args) {
        int[] arr={0,1,2,4,2,1};
        int target=3;
        System.out.println(Search(arr,target));

    }
    static int Search(int[]nums,int target){
        int peak=findPeak(nums);
        int firstTry=OrderAgnosticBS(nums,target,0,peak);
        if(firstTry!=-1){
            return firstTry;
        }
        return OrderAgnosticBS(nums,target,peak+1,nums.length-1);

    }
    static int findPeak(int[] arr){
        int start=0;
        int end=arr.length-1;
        while (start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end=mid;
            }
            else start=mid+1;
        }
        return start;
    }
    static int OrderAgnosticBS(int[]arr,int target,int start,int end){
        boolean isAsc=arr[start]<arr[end];

            while (start<=end){
                int mid=start+(end-start)/2;
                if (arr[mid]==target){
                    return mid;
                }
                if(isAsc){
                if(arr[mid]>target){
                    end=mid-1;
                }
                else {start=mid+1;}
            }
                else {
                    if (arr[mid]>target){
                        start=mid+1;
                    }
                    else end=mid-1;

                }

            }
            return -1;

    }
}
