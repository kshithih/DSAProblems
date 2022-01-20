/*
Given a string s, reverse only all the vowels in the string and return it.
The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both cases.

Example 1:
Input: s = "hello"
Output: "holle"

Example 2:
Input: s = "leetcode"
Output: "leotcede"
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class ReversevowelsofString {
    public static void main ( String[] args ) {
        Scanner scan = new Scanner ( System.in );
        String question = scan.next ( );
        System.out.println ( reverseVowels ( question ) );
    }

    public static String reverseVowels ( String s ) {
        ArrayList<Character> ans = new ArrayList<> ( );
        ans.add ( 'a' );
        ans.add ( 'e' );
        ans.add ( 'i' );
        ans.add ( 'o' );
        ans.add ( 'u' );
        ans.add ( 'A' );
        ans.add ( 'E' );
        ans.add ( 'I' );
        ans.add ( 'O' );
        ans.add ( 'U' );

        StringBuilder vowels = new StringBuilder ( );
        for ( int i = 0 ; i < s.length ( ) ; i++ ) {
            if (ans.contains ( s.charAt ( i ) )) {
                vowels.append ( s.charAt ( i ) );
            }
        }
        vowels.reverse ( );
        int k = 0;
        StringBuilder setting = new StringBuilder ( s );
        for ( int i = 0 ; i < setting.length ( ) ; i++ ) {
            if (ans.contains ( s.charAt ( i ) )) {
                setting.setCharAt ( i , vowels.charAt ( k) );
                k++;
            }
        }
        return  setting.toString ();
    }
}