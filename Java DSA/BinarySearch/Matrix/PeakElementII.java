package BinarySearch.Matrix;

import java.util.Arrays;

public class PeakElementII {
    public static void main(String[] args) {
        int[][] matrix={{1,4},{3,2}};
        String ans= Arrays.toString(findPeakGrid(matrix));
        System.out.println(ans);
        String s="gigu";
        s.toCharArray();


    }
    public static int[] findPeakGrid(int[][] mat) {
        int rows=mat.length;
        int cols=mat[0].length;
        int low=0;
        int high=cols-1;
        while (low<=high){
            int mid=low+(high-low)/2;
            int maxRowIndex=maxElement(mat,rows,cols,mid);
            int left=mid-1>=0?mat[maxRowIndex][mid-1]:-1;
            int right=mid+1<cols?mat[maxRowIndex][mid+1]:-1;
            if(mat[maxRowIndex][mid]>left && mat[maxRowIndex][mid]>right){
                return new int[] {maxRowIndex,mid};

            }
            else if(mat[maxRowIndex][mid]<left){
                high=mid-1;
            }
            else low=mid+1;
        }


        return new int[]{-1, -1};

    }
    public static int maxElement(int[][] matrix,int n,int m,int col){
        int maxValue=-1;
        int index=-1;
        for (int i = 0; i < n; i++) {
            if(matrix[i][col]>maxValue){
                maxValue=matrix[i][col];
                index=i;
            }
            
        }
        return index;
    }

}
