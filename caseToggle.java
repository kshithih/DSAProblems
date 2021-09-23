import java.util.Scanner;

public class caseToggle {

    public static String toggleCase(String str) {
        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);
            if (sb.charAt(i) >= 'A' && sb.charAt(i) <= 'Z') {
                char a = (char) (ch - 'a' + 'A');
                sb.setCharAt(i, a);

            } else {

                char a = (char) (ch + 'a' - 'A');
                sb.setCharAt(i, a);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(toggleCase(str));
    }

}

// Input: GithuB
// Output: gITHUb


