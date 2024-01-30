package Maths;

import java.util.ArrayList;

public class Factors {
    public static void main(String[] args) {
        int n=20;
        factor2(n);
        
    }

    //Time and Space Complexity O(sqrt(n))
    private static void factor2(int n) {
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 1; i <=Math.sqrt(n) ; i++) {
            if(n%i==0){
                if(n/i==i){
                    System.out.print(i+" ");
                }
                else {
                    System.out.print(i+" ");
                    list.add(n/i);
                }
            }
            
        }
        for (int i = list.size()-1; i >=0 ; i--) {
            System.out.print(list.get(i)+" ");

        }
    }

    // Time Complexity O(srt(n))
    private static void factor1(int n) {
        for (int i = 1; i <=Math.sqrt(n); i++) {
            if(n%i==0){
                if(n/i==i){
                    System.out.println(i+ " ");
                }
                else {
                    System.out.println(i+ " "+n/i+" ");
                }
            }
            
        }
    }
    

}
