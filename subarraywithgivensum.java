// { Driver Code Starts

import java.util.ArrayList;
import java.util.Scanner;

class subarraywithgivensum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements");
        int n = sc.nextInt();
        System.out.println("Enter sum");
        int s = sc.nextInt();

        int[] m = new int[n];
        System.out.println("Enter array elements");
        for (int j = 0; j < n; j++) {
            m[j] = sc.nextInt();
        }

        Solution obj = new Solution();
        ArrayList<Integer> res = obj.subarraySum(m, n, s);
        for (int ii = 0; ii < res.size(); ii++)
            System.out.print(res.get(ii) + " ");
        System.out.println();
    }
}


class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        // Your code here
        ArrayList<Integer> ans = new ArrayList<Integer>();
        int cursum = 0;
        int start = 0;
        int flag = 0;
        for (int i = 0; i < n; i++) {
            cursum += arr[i];
            while (cursum > s) {
                cursum -= arr[start];
                start++;
            }
            if (cursum == s) {
                flag = 1;
                ans.add(start + 1);
                ans.add(i + 1);
                break;
            }
        }
        if (flag == 1) {
            return ans;
        } else {
            ans.add(-1);
            return ans;
        }

    }
}