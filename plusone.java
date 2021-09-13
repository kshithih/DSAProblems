import java.util.Scanner;

public class plusone {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number_of_elements = scan.nextInt();
        int[] digits = new int[number_of_elements];
        for (int i = 0; i < number_of_elements; i++) {
            digits[i] = scan.nextInt();
        }
        int j = digits.length - 1;
        int[] ans = new int[digits.length];
        int carry = 1;
        int m = ans.length - 1;
        while (j >= 0) {
            int s = carry + digits[j];
            ans[m] = s % 10;
            s = s / 10;
            carry = s;
            j--;
            m--;
        }
        int n = digits.length;

        if (carry != 0) {
            n++;
        }
        int finalans[] = new int[n];
        int i = 0;
        if (carry != 0) {
            finalans[i] = carry;
            i++;
        }

        for (int k = 0; i < n; i++, k++) {
            finalans[i] = ans[k];
        }
        for (int k = 0; k < n; k++) {
            System.out.print(finalans[k] + "\t");
        }
    }
}

