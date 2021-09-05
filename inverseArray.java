import java.util.*;

class inverseArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number_of_elements = scan.nextInt();
        int[] array = new int[number_of_elements];
        for (int i = 0; i < number_of_elements; i++) {
            array[i] = scan.nextInt();
        }

        Solution s = new Solution();
        s.inversefunction(array);

    }
}
class Solution {
    public static void inversefunction(int[] a) {
        int[] ans = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            int v = a[i];
            ans[v] = i;
        }
        for (int val: ans) {
            System.out.print(val + " ");
        }
    }
}
