package String;

public class ReverseWords {
    public static void main(String[] args) {
        String s="  hello world  ";

        System.out.println(reverseWords(s));
    }
    public static String reverseWords(String s) {
        String ans="";
        int i=s.length()-1;
        while (i>=0){
            while (i>=0 && s.charAt(i)==' '){
                i--;
            }
            int j=i;
            if(i<0)break;
            while (i>=0 && s.charAt(i)!=' ') {
                i--;
            }
            if(ans.isEmpty()){
                ans=ans.concat(s.substring(i+1,j+1));
            }
            else {
                ans=ans.concat(" "+s.substring(i+1,j+1));
            }
        }
        return ans;


    }
}
