/*A Collatz sequence in mathematics can be defined as follows. Starting with any positive integer:

if n is even, the next number in the sequence is n / 2
if n is odd, the next number in the sequence is 3n + 1
It is conjectured that every such sequence eventually reaches the number 1. Test this conjecture.*/

import java.util.*;

public class collatzSequence{
    public static void main (String[] args) {
        Scanner scan = new Scanner (System.in);
        int a = scan.nextInt ();
        sequence(a);

    }

    public static void sequence(int a) {
        int j=0;
        while (a >= 1) {
            System.out.print (a + "\t");
            if (a == 1) {
                break;
            }
            if (a % 2 == 0) {
                a = a / 2;
            } else {
                a = 3 * a + 1;
            }
        }

    }
}


