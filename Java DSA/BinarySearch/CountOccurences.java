package BinarySearch;

public class CountOccurences {
    public static void main(String[] args) {
        int [] arr={1, 1, 2, 2, 2, 2, 2, 3};
        System.out.println(occurences(arr,3));

    }
    static int occurences(int[] arr,int target){
        int start=BS(arr,target,true);
        int end=BS(arr,target,false);
        if(start==-1 && end==-1){
            return -1;
        }
        return end-start+1;


    }
    static int BS(int[] arr,int target,boolean isFirstStart){
        int start=0;
        int end=arr.length-1;
        int ans=-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]>target){
                end=mid-1;
            }
            if(arr[mid]<target){
                start=mid+1;
            }
            if(arr[mid]==target){
                ans=mid;
                if(isFirstStart){
                    end=mid-1;
                }
                else start=mid+1;


            }


        }
        return ans;

    }
}
