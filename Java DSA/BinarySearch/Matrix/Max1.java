package BinarySearch.Matrix;
import java.util.ArrayList;


public class Max1 {

    public static int maximumOnesRow(ArrayList<ArrayList<Integer>> matrix, int n, int m)
    {

        ArrayList<Integer> arr=new ArrayList<>();
        //	  Write your code here.
        for (int row=0;row<n;row++){
            int noOfOne=0;

            for(int col=0;col<m;col++){
                if(matrix.get(row).get(col)==1){
                    noOfOne++;

                }
                else continue;
            }
            arr.add(noOfOne);
        }
        int ans=-1;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)>max){
                ans=i;
                max=arr.get(i);
            }

        }
        if(max==0){
            return -1;
        }
        return ans;
    }
}
