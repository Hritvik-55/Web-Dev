package BinarySearch;

public class Median2SortedArrays {
    public static void main(String[] args) {
        int[] a={1,3};
        int[] b={2};
        System.out.println(findMedianSortedArrays(a,b));

    }
    static double findMedianSortedArrays(int[] a,int[] b){
        int n1= a.length;
        int n2= b.length;
        if(n1>n2) return findMedianSortedArrays(b,a);
        int n=n1+n2;
        int left=(n1+n2+1)/2;
        int start=0;
        int end=n1;
        while (start<=end){
            int mid1=start+(end-start)/2;
            int mid2=left-mid1;
            int l1=Integer.MIN_VALUE;
            int l2=Integer.MIN_VALUE;
            int r1=Integer.MAX_VALUE;
            int r2=Integer.MAX_VALUE;
            if(mid1<n1) r1=a[mid1];
            if(mid2<n2) r2=b[mid2];
            if(mid1-1>=0) l1=a[mid1-1];
            if(mid2-1>=0) l2=b[mid2-1];
            if(l1<=r2 && l2<=r1){
                if(n%2==1) return Math.max(l1,l2);
                return ((double) (Math.max(l1,l2)+Math.min(r1,r2))/2.0);
            } else if (l1>r2)  {
                end=mid1-1;

            }
            else start=mid1+1;
        }
        return 0;
    }
}
