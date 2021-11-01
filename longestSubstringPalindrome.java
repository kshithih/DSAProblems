

import java.util.*;
class longestSubstringPalindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        System.out.println(longestPalindromicSubstring(s));
    }
    public static  String longestPalindromicSubstring(String A) {
        String ans = "";
        String res = "";
        if(A.length() == 1){
            return A;
        }
        int max = Integer.MIN_VALUE;
        for (int i=0;i<A.length();i++){
            for (int j=i+1;j<=A.length();j++){
                String n = A.substring(i,j);
            if(isPalindrome(n  , i , j )){
                    ans =  A.substring(i,j);
                    if(ans.length() > max){
                        max = ans.length();
                        res = ans;
                    }

                }
            }
        }
        return res;
    }
    public static boolean isPalindrome(String a , int i , int j){
        int k = 0;
        int l = a.length()-1;
        while(k<l){
            if(a.charAt(k) == a.charAt(l)){
                k++;
                l--;
            }else {
                return false;
            }
        }
        return true;

    }
}