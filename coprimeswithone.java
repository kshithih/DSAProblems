// Count the number of co-prime pairs in an array. (Any two numbers whose GCD is 1 are be called as co-prime)
// Input:
// The first line contains an integer T, total number of elements. Then follow T elements.
// Output:
// Count the number of co-prime pairs in an array.


import java.util.Scanner;

public class coprimeswithone {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println(getsolnu(arr, n));
    }

    public static int getsolnu(int[] arr, int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int a = gcd(arr[i], arr[j]);
                if (a == 1) {
                    count++;
                }
            }
        }
        return count;
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
