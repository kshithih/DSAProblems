/*Given an array of integers, return a new array where each element in the new array is the number of smaller elements to the right of that element in the original input array.
For example, given the array [3, 4, 9, 6, 1], return [1, 1, 2, 1, 0], since:
There is 1 smaller element to the right of 3
There is 1 smaller element to the right of 4
There are 2 smaller elements to the right of 9
There is 1 smaller element to the right of 6
There are no smaller elements to the right of 1*/

import java.util.Scanner;

public class smallerElementtoright{
    public static void main ( String[] args ) throws Exception {
        Scanner scan = new Scanner ( System.in );
        int number_of_elements = scan.nextInt ( );
        int[] array = new int[ number_of_elements ];
        for ( int i = 0 ; i < number_of_elements ; i++ ) {
            array[ i ] = scan.nextInt ( );
        }
        maponetoone ( array , number_of_elements );
    }

    public static void smallerElement( int[] arr , int n ) {
        int[] ans = new int[ n ];
        int k = 0;
        for ( int i = 0 ; i < arr.length ; i++ ) {
            int c = 0;
            for ( int j = i + 1 ; j < arr.length ; j++ ) {
                if (arr[ i ] > arr[ j ]) {
                    c++;
                }
            }
            ans[ k++ ] = c;
        }
        for ( int i = 0 ; i < ans.length ; i++ ) {
            System.out.print ( ans[ i ] + "\t" );
        }
    }

}



