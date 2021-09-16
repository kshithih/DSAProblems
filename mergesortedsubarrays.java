//Merging two sorted aubarrays arrayone and arraytwo

import java.util.Scanner;

public class mergesortedsubarrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();               //number of elements for array one
        int[] A = new int[n];                 //arrayone
        for (int i = 0; i < n; i++) {
            A[i] = scan.nextInt();
        }
        int m = scan.nextInt();              //number of elements for array two
        int[] B = new int[m];                //arraytwo
        for (int i = 0; i < m; i++) {
            B[i] = scan.nextInt();
        }
        int i = 0;
        int j = 0;
        int[] ans = new int[A.length + B.length]; //output array
        int k = 0;
        while (i < A.length && j < B.length) {
            if (A[i] < B[j]) {
                ans[k] = A[i];
                k = k + 1;
                i = i + 1;
            } else if (A[i] > B[j]) {
                ans[k] = B[j];
                k = k + 1;
                j = j + 1;
            } else {
                ans[k] = B[j];
                k = k + 1;
                ans[k] = A[i];
                j = j + 1;
                k = k + 1;
                i = i + 1;
            }
        }
        while (i < A.length) {
            ans[k] = A[i];
            k = k + 1;
            i++;
        }
        while (j < B.length) {
            ans[k] = B[j];
            k = k + 1;
            j++;
        }
        for (i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + "\t");
        }
    }
}


