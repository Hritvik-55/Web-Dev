package BinarySearch;

public class DistanceToGasStations {
    public static void main(String[] args) {
        int[] arr={4,6,10};
        System.out.println(minimizeMaxDistance(arr,4));
        System.out.println(3/2);
    }

    public static int NumberOfGasStations(int[] arr,double dist){
        int cnt=0;
        for(int i=1;i<arr.length;i++){
            int numberInBetween = (int) ((arr[i]-arr[i-1])/dist);
            if((arr[i]-arr[i-1])/dist==numberInBetween*dist){
                numberInBetween--;
            }
            cnt+=numberInBetween;

        }
        return cnt;
    }

    public static double minimizeMaxDistance(int[] arr,int k){
        int n=arr.length;
        double low=0;
        double high=0;
        for (int i = 0; i <n-1; i++) {
            high=Math.max(high,(double)(arr[i+1]-arr[i]));

            
        }
        double diff=1e-6;
        while (high-low>diff){
            double mid=low+(high-low)/2.0;
            int cnt=NumberOfGasStations(arr,mid);
            if(cnt>k){
                low=mid;
            }
            else high=mid;
        }
        return high;
    }
}
