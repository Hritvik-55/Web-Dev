package String;

public class MaxNestingDepthofParanthesis {
    public static void main(String[] args) {
        String s= "(1)+((2))+(((3)))";
        System.out.println(maxDepth(s));
    }
    public static int maxDepth(String s) {
        int open=0;
        int brackets=0;
        int depth=0;
        int maxDepth=Integer.MIN_VALUE;
        if(s==""){
            return 0;
        }
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i)==')'){
                brackets++;

            }
        }
        if(brackets==0){
            return 0;
        }
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='('){
                open++;
                depth++;
            }
            if(s.charAt(i)==')'){
                maxDepth=Math.max(depth,maxDepth);
                depth--;
                open--;
            }

        }
        return maxDepth;

    }
}
