package BinarySearch;

import java.util.ArrayList;

public class PaintersPartition {
    public static int findLargestMinDistance(ArrayList<Integer> boards, int k)
    {
        int start=-1;
        int end=0;
        for(int i=0;i<boards.size();i++){
            start=Math.max(boards.get(i),start);
            end+=boards.get(i);
        }
        while(start<=end){
            int mid=start+(end-start)/2;
            if(Paint(boards,mid)>k){
                start=mid+1;

            }
            else end=mid-1;
        }
        return start;
        //    Write your code here.
    }
    static int Paint(ArrayList<Integer> arr, int boardLen){
        int currLen=0;
        int painter=1;
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)+currLen<=boardLen){
                currLen+=arr.get(i);
            }
            else{
                painter+=1;
                currLen=arr.get(i);
            }
        }
        return painter;
    }
}
