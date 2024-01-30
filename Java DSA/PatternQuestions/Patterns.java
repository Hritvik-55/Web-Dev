package PatternQuestions;

public class Patterns {
    public static void main(String[] args) {
        pattern21(4);

    }
    static void pattern3(int n){
        for(int row=1;row<=n;row++){
            for(int col=n;col>=row;col--){
                System.out.print(" * ");

            }
            System.out.println();
        }

    }
    static void pattern4(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print(col);
            }
            System.out.println();
        }
    }
    static void pattern5(int n){
        for(int row=0;row<n*2;row++){
            int totalCols=row>n?2*n-row:row;
            for(int col=0;col<totalCols;col++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    static void pattern28(int n){
        for(int row=0;row<n*2;row++){
            int totalCols=row>n?2*n-row:row;
            for(int col=0;col<totalCols;col++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    static void pattern7(int n){
        for(int row=1;row<=n;row++){
            //spaces
            for(int j=0;j<n-row;j++){
                System.out.print(" ");
            }
            //stars
            for(int j=0;j<2*row-1;j++){
                System.out.print("*");
            }

            //spaces
            for(int j=0;j<n-row;j++){
                System.out.print(" ");
            }
            System.out.println();
        }

    }
    static void pattern8(int n){
        for(int row=0;row<n;row++){
            //spaces
            for(int j=0;j<row;j++){
                System.out.print(" ");
            }
            //stars
            for(int j=0;j<n*2-row*2-1;j++){
                System.out.print("*");

            }
            //spaces
            for(int j=0;j<row;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    static void pattern10(int n){
        for(int row=0;row<2*n-1;row++){
            if(row>=n){
                for(int j=0;j<2*n-row-1;j++){
                    System.out.print("*");
                }

            }
            else {
                for (int j = 0; j <= row; j++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
    static void pattern11(int n){
        int space=2*(n-1);
        for(int row=1;row<=n;row++){
            //value
            for(int j=1;j<=row;j++){
                System.out.print(j);
            }
            //space
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            //value
            for(int j=row;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
            space-=2;
        }
    }
    static void pattern19(int n){
        int initialSpaces=0;
        for(int row=0;row<n;row++){

            //value
            for(int j=0;j<n-row;j++){
                System.out.print("*");
            }
            //space

            for(int j=0;j<initialSpaces;j++){
                System.out.print(" ");
            }
            //value
            for(int j=0;j<n-row;j++){
                System.out.print("*");
            }
            System.out.println();
            initialSpaces+=2;
        }

        initialSpaces=2*(n-1);
        for(int row=0;row<n;row++){

            //value
            for(int j=0;j<=row;j++){
                System.out.print("*");
            }
            //space

            for(int j=0;j<initialSpaces;j++){
                System.out.print(" ");
            }
            //value
            for(int j=0;j<=row;j++){
                System.out.print("*");
            }
            System.out.println();
            initialSpaces-=2;
        }

    }
    static void pattern21(int n){
        for(int row=0;row<n;row++){
            for(int j=0;j<n;j++){
                if(row==0 || j==0 || row==n-1 || j==n-1){
                    System.out.print("*");

                }
                else System.out.print(" ");
            }
            System.out.println();
        }
    }

}
