package BinarySearch;

import java.util.ArrayList;

public class AllocateBooks {

    public static int findPages(ArrayList<Integer> arr, int n, int m) {
        int start=-1;
        int end =0;
        for(int i=0;i<arr.size();i++){
            start=Math.max(arr.get(i),start);
            end+=arr.get(i);
        }
        while(start<=end){
            int mid=start+(end-start)/2;
            if(Distribution(arr,m,mid)>m){
                start=mid+1;

            }
            else end=mid-1;
        }
        return start;
        // Write your code here.
    }

    public static int Distribution(ArrayList<Integer> arr,int m,int pages){
        int currPgCnt=0;
        int child=1;
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)+currPgCnt<=pages){
                currPgCnt+=arr.get(i);
            }
            else{
                child+=1;
                currPgCnt=arr.get(i);
            }
        }
        return child;
    }
}
