// //Program to find the sum of all numbers present in the string is discussed here. Given a string containing both numbers and alphabets, the task is to find the sum of all numbers present in the string.
// For example, consider the following :
// Input:
// abc45def5ghi32
// Output:
// 82

// Explanation:
// The numbers 45, 5 and 32 are present in the string.
// Sum = 45 + 5 + 32 = 82.

import java.util.Scanner;

public class sumofnumbersinString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        diamond(s);
    }

    public static void diamond(String s) {
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        String a = "0";
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {

                a = a + s.charAt(i);
            } else {
                if (a != null) {
                    sum = sum + Integer.parseInt(a);
                    a = "0";
                }
            }
        }
        sum += Integer.parseInt(a);
        System.out.println(sum);
    }
}
