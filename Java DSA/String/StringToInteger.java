package String;

public class StringToInteger {
    public static void main(String[] args) {
        String s = "-91283472332";
        System.out.println(myAtoi(s));
//        System.out.println(s.charAt(0));
    }

    public static int myAtoi(String s) {
        int lowRange = Integer.MIN_VALUE;
        int highRange = Integer.MAX_VALUE;
        int start = 0;
        int result = 0;
        boolean isPositive = true;
        for (; start < s.length(); start++) {
            if (s.charAt(start) == ' ') {
                continue;
            } else break;

        }
        if (s.charAt(start) == '-') {
            isPositive = false;
            start++;
        } else if (s.charAt(start) == '+') {
            start++;
        }
        if(!Character.isDigit(s.charAt(start))){
            return result;

        }
        for (; start < s.length(); start++) {
            if (!(s.charAt(start) > 0)) {
                return result;
            } else break;
        }
        for (int i = start; i < s.length(); i++) {
            if ((Character.isDigit(s.charAt(i)))) {
                int digit = s.charAt(i) - '0';
                result = (result * 10) + digit;
            }
            if (result > highRange) {
                return highRange;
            }
            if (result < lowRange) {
                return lowRange;
            }

        }
        if (!isPositive) {
            result = result * -1;
        }

        return result;


    }
}
