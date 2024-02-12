package String;

public class RomanToInteger {
    public static void main(String[] args) {
        String s="LVIII";
        System.out.println(romanToInt(s));
    }
    public static int romanToInt(String s) {
        int ans=0;
        char[] ch=s.toCharArray();
        for(int i=0;i<ch.length;i++){
            switch(ch[i]){
                case 'I' : ch[i]=1;
                    break;
                case 'V' : ch[i]=5;
                    break;
                case 'X' : ch[i]=10;
                    break;
                case 'L' : ch[i]=50;
                    break;
                case 'C' : ch[i]=100;
                    break;
                case 'D' : ch[i]=500;
                    break;
                case 'M' : ch[i]=1000;
                    break;

            }
        }
        for(int i=0;i<ch.length;i++){
            if(i+1<ch.length && ch[i]<ch[i+1]){
                ans-=ch[i];
            }
            else ans+=ch[i];

        }
        return ans;


    }
}
