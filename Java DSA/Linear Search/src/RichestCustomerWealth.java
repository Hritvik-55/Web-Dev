public class RichestCustomerWealth {

    public static void main(String[] args) {
        int[][] accounts={{2,8,7},{7,3,1}};
        System.out.println(maximumwealth(accounts));

    }

    private static int maximumwealth(int[][] accounts) {
        int max_wealth=-1;
        for(int row=0;row<accounts.length;row++){
            int wealth=0;
            for(int col=0;col<accounts[row].length;col++){

                wealth+=accounts[row][col];
            }
            if(wealth>max_wealth){
                max_wealth=wealth;
            }


        }
        return max_wealth;

    }

}
