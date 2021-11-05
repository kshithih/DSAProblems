/*You are given an integer N and the task is to reverse the digits of the given integer. Return 0 if the result overflows and does not fit in a 32 bit signed integer
Look at the example for clarification.
Problem Constraints
N belongs to the Integer limits.

Input Format
Input an Integer.

Output Format
Return a single integer denoting the reverse of the given integer.

Example Input
Input 1:
 x = 123
Input 2:
 x = -123
Example Output
Output 1:
 321
Ouput 2:
 -321
*/


import java.util.Scanner;

class reverseInteger{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.println(reverse(a));
    }

    public static int reverse(int A) {
        int sign = 0;
        if (A < 0) {
            A *= -1;
            sign = -1;
        }
        StringBuilder str = new StringBuilder(String.valueOf(A));
        str.reverse();
        long ans = Long.parseLong(str.toString());

        return (ans >= Integer.MAX_VALUE) ? 0 : ((sign == -1) ? (int) ans * -1 : (int) ans);

    }
}






