import java.util.*;
import java.lang.*;
import java.io.*;

class findsum {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();
        while (t > 0) {
            int n = scan.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scan.nextInt();
            }

            t--;
            Solutions s = new Solutions();
            System.out.println(s.findsumans(arr, n) == true ? "Yes" : "No");
        }
    }
}

class Solutions {
    static boolean findsumans(int arr[], int n) {
        int sum = 0;
        HashSet<Integer> hs = new HashSet<Integer>();
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                return true;
            }
            sum += arr[i];
            if (sum == 0) {
                return true;
            }
            if (hs.contains(sum)) {
                return true;
            }
            hs.add(sum);
        }
        return false;
    }
}

// Test case:
// 5
// 4 2 0 1 6
// Yes
