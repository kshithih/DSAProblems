import java.util.Scanner;

public class rearrane {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        rearrange.re(a, n);
    }
}

class rearrange {
    public static void re(int[] A, int n) {
        int[] nums = new int[n];
        int low = 0;
        int high = n - 1;
        int k = 0;
        // Your code here
        int i = 0;
        int j = n - 1;

        while (j > i) {
            nums[k++] = A[j];
            nums[k++] = A[i];
            i = i + 1;
            j = j - 1;
        }

        for (i = 0; i < n; i++) {
            System.out.print(nums[i] + "\t");
        }
    }
}
/*
Time Complexity: O(n)
Space Complexity : O(n)
 */
