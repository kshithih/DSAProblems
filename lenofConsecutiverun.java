/*This problem was asked by Stripe.
Given an integer n, return the length of the longest consecutive run of 1s in its binary representation.
For example, given 156, you should return 3.*/

import java.util.*;
import java.lang.*;
import java.io.*;

class lenofConsecutiverun{
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
        String res = str.toString ();
        int count = 0;
        int maxi = Integer.MIN_VALUE;
        for ( int i=0;i<res.length ();i++){
            char p = res.charAt ( i );
            int po = p-'0';
            if(po==1){
                count++;
                maxi = Math.max ( count,maxi );
            }else {
                count=0;
            }
        }
        return maxi;
    }

}