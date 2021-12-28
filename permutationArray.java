/*A permutation can be specified by an array P, where P[i] represents the location of the element at i in the permutation. For example, [2, 1, 0] represents the permutation where elements at the index 0 and 2 are swapped.
Given an array and a permutation, apply the permutation to the array. For example, given the array ["a", "b", "c"] and the permutation [2, 1, 0], return ["c", "b", "a"].*/

import java.util.Scanner;

public class permutationArray {
    public static void main ( String[] args ) {
        Scanner scan = new Scanner ( System.in );
        int number_of_elements = scan.nextInt ( );
        char[] arr = new char[ number_of_elements ];
        for ( int i = 0 ; i < number_of_elements ; i++ ) {
            arr[ i ] = scan.next ( ).charAt ( 0 );
        }

        int[] parr = new int[ number_of_elements ];
        for ( int i = 0 ; i < number_of_elements ; i++ ) {
            parr[ i ] = scan.nextInt ( );
        }
        char[] ans = new char[ 3 ];
        ans = collatzSequence ( arr , parr );
        for ( int i = 0 ; i < ans.length ; i++ ) {
            System.out.print ( ans[ i ] + "\t" );
        }

    }

    public static char[] collatzSequence ( char[] a , int[] p ) {
        char[] res = new char[ a.length ];
        for ( int i = 0 ; i < p.length ; i++ ) {
            res[ i ] = a[ p[ i ] ];
        }
        return res;
    }
}


