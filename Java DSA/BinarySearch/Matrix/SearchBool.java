package BinarySearch.Matrix;

public class SearchBool {
    public static void main(String[] args) {
        int[][] matrix={{2,5},{2,8},{7,9},{7,11},{9,11}};
        System.out.println(search(matrix,7));

    }
    static boolean search(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length; // be cautious, matrix may be empty
        if (cols == 0){
            return false;
        }
        if (rows == 1) {
            return binarySearch(matrix,0, 0, cols-1, target);
        }

        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = cols / 2;

        // run the loop till 2 rows are remaining
        while (rStart < (rEnd - 1)) { // while this is true it will have more than 2 rows
            int mid = rStart + (rEnd - rStart) / 2;
            if (matrix[mid][cMid] == target) {
                return true;
            }
            if (matrix[mid][cMid] < target) {
                rStart = mid;
            } else {
                rEnd = mid;
            }
        }

        // now we have two rows
        // check whether the target is in the col of 2 rows
        if (matrix[rStart][cMid] == target) {
            return true;
        }
        if (matrix[rStart + 1][cMid] == target) {
            return true;
        }

        // search in 1st half
        if (target <= matrix[rStart][cMid]) {
            return binarySearch(matrix, rStart, 0, cMid-1, target);
        }
        // search in 2nd half
        if (target >= matrix[rStart][cMid] && target <= matrix[rStart][cols - 1]) {
            return binarySearch(matrix, rStart, cMid + 1, cols - 1, target);
        }
        // search in 3rd half
        if (target <= matrix[rStart + 1][cMid]) {
            return binarySearch(matrix, rStart + 1, 0, cMid-1, target);
        } else {
            return binarySearch(matrix, rStart + 1, cMid + 1, cols - 1, target);
        }
    }
    public static boolean binarySearch(int[][] matrix,int row,int cStart,int cEnd,int target){
        while(cStart<=cEnd){
            int cMid=cStart+(cEnd-cStart)/2;
            if(matrix[row][cMid]==target){
                return true;
            }
            if(matrix[row][cMid]<target){
                cStart=cMid+1;
            }
            else cEnd=cMid-1;
        }
        return false;
    }
}
