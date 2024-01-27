public class MinNumberInArray {
    public static void main(String[] args) {
        int[] arr={-1,-33,-3478,3473,7584,-233};
        System.out.println(min(arr));
    }
    static int min(int[] arr){
        int minimun=arr[0];
        for (int i=0;i<arr.length;i++){
            if (arr[i]<minimun){
                minimun=arr[i];
            }

        }
        return minimun;
    }

}
