import java.util.Scanner;

class reverseInteger{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
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






