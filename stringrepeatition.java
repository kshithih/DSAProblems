/* Repition of letters in a string*/

import java.util.*;
public class stringrepeatition{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String question = scan.next();
        String result = "";
        for (int i = 0; i < question.length() - 1; i++) {
            if (question.charAt(i) != question.charAt(i + 1)) {
                result += question.charAt(i);
            }

        }
        result += question.charAt(question.length() - 1);
        System.out.println(result);

    }
}

/*
Input : giiithhhubb
Output: github
*/
