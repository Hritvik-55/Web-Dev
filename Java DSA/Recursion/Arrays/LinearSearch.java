package Recursion.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,4,5};
        ArrayList<Integer> ans=search2(arr,4,0);
        System.out.println(ans);

    }
    static int search(int[] arr,int index,int target){
        if(index==arr.length){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        return search(arr,index+1,target);
    }
    static ArrayList<Integer> search2(int[] arr, int target, int index){
        ArrayList<Integer> list=new ArrayList<>();
        if(index==arr.length){

            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
        ArrayList<Integer> ans=search2(arr,target,index+1);
        list.addAll(ans);
        return list;
    }
}
