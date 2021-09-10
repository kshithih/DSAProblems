import java.util.Scanner;

public class reversearrayingroup {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scan.nextInt();
        }
        int k = scan.nextInt();
        solving(array, k);
    }

    public static void solving(int[] arr, int k) {

        for (int i = 0; i < arr.length; i = i + k) {
            int low = i;
            int high = Math.min(i + k - 1, arr.length - 1);
            while (low < high) {
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
                low++;
                high--;
            }
        }
        display(arr);
    }

    public static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
