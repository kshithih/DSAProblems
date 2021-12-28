/* Determine whether there exists a one-to-one character mapping from one string s1 to another s2.
For example, given s1 = abc and s2 = bcd, return true since we can map a to b, b to c, and c to d.
Given s1 = foo and s2 = bar, return false since the o cannot map to two characters.*/

import java.util.HashMap;
import java.util.Scanner;

public class isomorphicStrings {
    public static void main ( String[] args )  throws Exception {
        Scanner scan = new Scanner ( System.in );
         String a = scan.next ( );
         String b = scan.next ( );
        System.out.println ( maponetoone ( a,b ));
    }
    public static  boolean maponetoone(String a ,String b) {
        HashMap<Character, Integer> hm = new HashMap<> ( );
        for ( int i = 0 ; i < a.length ( ) ; i++ ) {
            if (hm.containsKey ( a.charAt ( i ) )) {
                int c = hm.get ( a.charAt ( i ) );
                hm.put ( a.charAt ( i ) , c + 1 );
            } else {
                hm.put ( a.charAt ( i ) , 1 );
            }
        }
        HashMap<Character, Integer> hm2 = new HashMap<> ( );
        for ( int i = 0 ; i < b.length ( ) ; i++ ) {
            if (hm2.containsKey ( b.charAt ( i ) )) {
                int c = hm2.get ( b.charAt ( i ) );
                hm2.put ( b.charAt ( i ) , c + 1 );
            } else {
                hm2.put ( b.charAt ( i ) , 1 );
            }
        }
        for ( int i = 0 ; i < a.length ( ) ; i++ ) {
            if (hm.containsKey ( a.charAt ( i ) )) {
                int c = hm.get ( a.charAt ( i ) );
                if (!(hm2.containsValue ( c ))) {
                    return false;
                }
            }

        }
        return true;
    }

}



