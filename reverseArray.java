import java.util.*;
import java.lang.*;

class reverseArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number_of_elements = scan.nextInt();
        int[] array = new int[number_of_elements];
        for (int i = 0; i < number_of_elements; i++) {
            array[i] = scan.nextInt();
        }
        Solution s = new Solution();
        s.reverseArray(array);
        for (int val: array) {
            System.out.print(val + " ");
        }
    }
}
class Solution {
    public void reverseArray(int arr[]) {
        int begin = 0;
        int end = arr.length - 1;
        while (begin < end) {
            int temp = arr[begin];
            arr[begin] = arr[end];
            arr[end] = temp;
            begin++;
            end--;

        }
    }
}
