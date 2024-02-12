package String;

import java.util.Arrays;

public class Anagrams {
    public static void main(String[] args) {
        String Str1 = "rat";
        String Str2 = "car";
        System.out.println(Anagram(Str1, Str2));
    }

    //Appproach #1
    public boolean isAnagram(String s, String t) {
        int n1=s.length();
        int n2=t.length();
        if(n1!=n2){
            return false;
        }
        s=sort(s);
        t=sort(t);


        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=t.charAt(i)){
                return false;
            }
        }
        return true;

    }
    public  String sort(String s){
        char[] ch=s.toCharArray();
        Arrays.sort(ch);
        return Arrays.toString(ch);

    }
    //Approach#2
    public static boolean Anagram(String s,String t){
        int n1=s.length();
        int n2=t.length();
        if(n1!=n2) return false;
        int[] arr=new int[26];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'A']++;
        }
        for(int i=0;i<t.length();i++){
            arr[t.charAt(i)-'A']--;
        }
        for(int i=0;i<26;i++){
        if(arr[i]!=0){
            return false;
        }
        }

        return true;

    }
}
