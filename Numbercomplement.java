/*The complement of an integer is the integer you get when you flip all the 0's to 1's and all the 1's to 0's in its binary representation.
For example, The integer 5 is "101" in binary and its complement is "010" which is the integer 2.
Given an integer num, return its complement.

Examples:
Input: num = 5
Output: 2

Input: num = 1
Output: 0

*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Numbercomplement{
    public static void main (String[] args) {
        //code
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt ( );
        System.out.println (toBinary ( number ));
    }
public static int toBinary(int number){
        String ans = "";
        while(number>0){
            ans += number%2;
            number = number/2;
        }
        StringBuilder str = new StringBuilder ( ans );
        str.reverse ();
        for ( int i=0;i<str.length ();i++ ){
            if(str.charAt ( i )=='0') {
                str.setCharAt ( i , '1');
            }
            else if(str.charAt ( i )=='1'){
                str.setCharAt ( i , '0');
            }
        }
        String res = str.toString ();
        int sum = 0;
        int j=0;
        for(int i=res.length ()-1;i>=0;i--){
            int a = res.charAt ( i )-'0';
            sum = sum + a* (int)Math.pow ( 2,j );
            j++;
        }
        return sum;


    }

}