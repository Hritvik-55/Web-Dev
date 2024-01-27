public class FindNumberswithEvenNumberofDigits {
    public static void main(String[] args) {
        int[] arr={12,345,2,6,7896,-66386482};
        System.out.println(findNumbers(arr));

    }
    static int findNumbers(int[] nums){
        int count=0;
        for (int num : nums) {
            if (isEven(num)) {
                count++;
            }
        }
        return count;

    }
    static boolean isEven(int count){
        int number0fdigits=digits(count);
        return number0fdigits % 2 == 0;
    }
    static int digits(int num){
        if(num<0){
            num=num*-1;
        }
        if(num==0){
            return 1;
        }
        int count=0;
        while(num>0){
            count++;
            num=num/10;

        }
        return count;
    }
}
