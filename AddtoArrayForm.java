/*Given a collection of numbers, nums, that might contain duplicates, return all possible unique permutations in any order.

Example 1:
Input: nums = [1,1,2]
Output:
[[1,1,2],
 [1,2,1],
 [2,1,1]]
 
Example 2:
Input: nums = [1,2,3]
Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
 
Constraints:

1 <= nums.length <= 8
-10 <= nums[i] <= 10

*/

import java.util.ArrayList;
import java.util.Scanner;

class AddtoArrayForm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number_of_elements = scanner.nextInt();
        int[] array = new int[number_of_elements];
        for (int i = 0; i < number_of_elements; i++) {
            array[i] = scanner.nextInt();
        }
        int k = scanner.nextInt();

        int[] result = addToarray(array, k);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
    public static int[] addToarray(int[] array, int k) {
        ArrayList < Integer > arl = new ArrayList < > ();
        int sum = 0;
        int carry = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            sum = array[i] + (k % 10) + carry;
            arl.add(sum % 10);
            k /= 10;
            carry = sum > 10 ? sum / 10 : 0;
            if (sum == 10) {
                carry = 1;
            }
        }
        if (carry != 0) {
            arl.add(carry);
        }
        int[] ans = new int[arl.size()];
        int j = arl.size() - 1;
        for (int i = 0; i < ans.length; i++) {
            ans[i] = arl.get(j);
            j--;
        }

        return ans;


    }
}
