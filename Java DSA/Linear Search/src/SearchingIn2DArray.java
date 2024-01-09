import java.util.Arrays;

public class SearchingIn2DArray {
    public static void main(String[] args) {
        int[][] arr={
                {1,2,3,4},
                {3,4,556,-12},
                {-93,34,24,2345,556}
        };
        int target=556;
        int[] ans=search(arr,target);
        System.out.println(Arrays.toString(ans));

    }
    static int[] search(int[][] arr, int target){
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]==target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
