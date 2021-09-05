/* 
Given an array of integers nums, return the number of good pairs.
A pair (i, j) is called good if nums[i] == nums[j] and i < j.
*/

import java.util.*;
class numberofgoodpairs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number_of_elements = scan.nextInt();
        int[] array = new int[number_of_elements];
        for (int i = 0; i < number_of_elements; i++) {
            array[i] = scan.nextInt();
        }
        Solution s = new Solution();
        int count = s.numIdenticalPairs(array);
        System.out.println(count);
    }
}
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int c = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (i != j) {
                    if (nums[i] == nums[j]) {
                        c++;
                    }
                }
            }
        }
        return c;
    }
}
/*
Input: nums = [1,2,3,1,1,3]
Output: 4

Input: nums = [1,1,1,1]
Output: 6
*/
