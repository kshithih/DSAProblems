import java.util.Arrays;
import java.util.Scanner;

public class sumofPrime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(isPrimenumber(n));
 
    }

    static int isPrimenumber(int a) {
        boolean[] valid = new boolean[a + 1];
        Arrays.fill(valid, true);
        int sum = 0;
        for (int i = 2; i * i <= a; i++) {
            for (int p = i * 2; p <= a; p = p + i) {

                valid[p] = false;

            }
        }
        for (int i = 2; i <= a; i++) {

            if ((valid[i] == true) && (a % i == 0)) {
                sum += i;
            }

        }
        return sum;
    }
}
