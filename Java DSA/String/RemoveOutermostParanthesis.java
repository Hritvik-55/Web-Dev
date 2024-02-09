package String;

public class RemoveOutermostParanthesis {
    public String removeOuterParentheses(String s) {
        int open=0;
        String res="";
        char[] charArray = s.toCharArray();

        for(int i=0;i<charArray.length;i++){
            if(charArray[i]=='(' && open==0){
                open++;
            }
            else if(charArray[i]=='(' && open>=1){
                res+='(';
                open++;
            }
            else if(charArray[i]==')' && open>1){
                res+=')';
                open--;
            }
            else if(charArray[i]==')' && open==1){
                open--;
            }
        }
        return res;

    }
}
