import java.util.Scanner;

public class powerec {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int pow = scan.nextInt();
        System.out.println(power(number, pow));

    }

    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int xnminusone = power(x, n - 1);
        int xn = xnminusone * x;
        return xn;
    }

}

