package bitwise;

public class findUnique {
    public static void main(String[] args) {
        int[] arr={2,3,3,4,2,6,6};
        System.out.println(unique(arr));
    }

    private static int unique(int[] arr) {
        int unique=0;
        for(int num:arr){
            unique^=num;

        }
        return unique;
    }
}
