package Recursion.Arrays;

public class MinMaxArray {
    public static void main(String[] args) {
        int[] arr={1,4,3,-5,-4,8,6};
        System.out.println(max(arr,arr.length));

    }

    private static int min(int[] arr,int n) {
        if(n==1){
            return arr[0];
        }
        return Math.min(arr[n-1],min(arr,n-1));

    }
    private static int max(int[] arr,int n) {
        if(n==1){
            return arr[0];
        }
        return Math.max(arr[n-1],max(arr,n-1));

    }


}
