import java.util.Arrays;

public class KokoBanana {

    public static void main(String[] args) {
        int[] piles={805306368,805306368,805306368};
        System.out.println((44/22));

        System.out.println(minEatingSpeed(piles,1000000000));
    }

    public static int minEatingSpeed(int[] piles, int h) {
        int start=1;
        int end= piles[piles.length-1];
        for(int i:piles){
            end=Math.max(i,end);
        }
        while(start<=end){
            int mid=start+(end-start)/2;
            if(bananaCount(piles,h,mid)){
                end=mid-1;
            }
            else start=mid+1;


        }
        return start;



    }
    public static boolean bananaCount(int[] piles,int h,int k){
        int cnt=0;
        for(int pile:piles){
            int currH=pile%k==0?pile/k:pile/k+1;
            cnt+=currH;
            if (cnt>h){
                return false;
            }
        }

        return true;
    }
    }

