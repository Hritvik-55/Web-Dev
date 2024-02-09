package BinarySearch.Matrix;

import java.util.Arrays;

public class SearchInSortedMatrix {
    public static void main(String[] args) {
        int[][] matrix={
                {1},
                {3}

        };
        System.out.println(Arrays.toString(Search(matrix,9)));

    }
    public static int[] BS(int[][] matrix,int row,int cStart,int cEnd,int target){
        while (cStart<=cEnd){
            int mid=cStart+(cEnd-cStart)/2;
            if(matrix[row][mid]==target){
                return new int[] {row,mid};
            }
            if(matrix[row][mid]>target){
                cEnd=mid-1;
            }
            else {
                cStart=mid+1;
            }
        }
        return new int[] {-1,-1};
    }
    public static int[] Search(int[][] matrix,int target){
        int rows=matrix.length;
        int cols=matrix[0].length;
        if(cols==0){
            return new int[] {-1,-1};
        }
        if(rows==1){
            return BS(matrix,0,0,cols-1,target);
        }
        int rStart=0;
        int rEnd=rows-1;
        int cMid=cols/2;
        while (rStart<(rEnd-1)){
            int mid=rStart+(rEnd-rStart)/2;
            if(matrix[mid][cMid]==target){
                return new int[] {mid,cMid};
            }
            if(matrix[mid][cMid]<target){
                rStart=mid;
            }
            else {
                rEnd=mid;
            }
        }
        if(matrix[rStart][cMid]==target){
            return new int[] {rStart,cMid};
        }
        if(matrix[rStart+1][cMid]==target){
            return new int[] {rStart+1,cMid};

        }
        if(target<=matrix[rStart][cMid-1] ){
            return BS(matrix,rStart,0,cMid-1,target);
        }
        if(target>=matrix[rStart][cMid+1] && target<=matrix[rStart][cols-1]){
            return BS(matrix,rStart,cMid+1,cols-1,target);
        }
        if(target<=matrix[rStart+1][cMid-1]){
            return BS(matrix,rStart+1,0,cMid-1,target);
        }
        else{
            return BS(matrix,rStart+1,cMid+1,cols-1,target);
        }

    }
}
