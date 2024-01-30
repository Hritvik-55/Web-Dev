public class test {
    public static void main(String[] args) {
        System.out.println(ans(16,30));
        System.out.println(17/30);
        System.out.println(3/4);
        int[] arr={3,4,7,11};
        int start=arr[0];
        int max=arr[arr.length-1];
        for(int i:arr){

            start=Math.min(i,start);
        };
        System.out.println(start);
        for(int i:arr){
            max=Math.max(i,max);
        }
        System.out.println(max);


    }
    static int ans(int start,int end){
        return start+(end-start)/2;
    }

}
