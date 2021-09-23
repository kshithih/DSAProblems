import java.util.Scanner;

public class displayarrayrecursively {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        int idx = 0;
        displayArr(arr, idx);
    }

    public static void displayArr(int[] arr, int idx) {
        int n = arr.length;
        if (n == idx) {
            return;
        }
        System.out.println(arr[idx]);
        displayArr(arr, idx + 1);
    }

}

