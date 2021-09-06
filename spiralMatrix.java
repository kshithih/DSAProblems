/*
Print matrix spirally.
 */
import java.util.*;
public class spiralMatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nr = scan.nextInt();
        int mc = scan.nextInt();
        int[][] matrix = new int[nr][mc];
        for (int i = 0; i < nr; i++) {
            for (int j = 0; j < mc; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }
        int dir = 0;
        int left = 0;
        int top = 0;
        int right = mc - 1;
        int down = nr - 1;
        int total_count = nr * mc;
        int count = 0;
        while (top <= down && left <= right && count <= total_count) {
            if (dir == 0) {
                for (int i = left; i <= right; i++) {
                    System.out.print(matrix[top][i] + "\t");
                }
                count++;
                top++;
            }
            if (dir == 1) {
                for (int i = top; i <= down; i++) {
                    System.out.print(matrix[i][right] + "\t");
                }
                count++;
                right--;
            }
            if (dir == 2) {
                for (int i = right; i >= left; i--) {
                    System.out.print(matrix[down][i] + "\t");
                }
                count++;
                down--;
            }
            if (dir == 3) {
                for (int i = down; i >= top; i--) {
                    System.out.print(matrix[i][left] + "\t");
                }
                left++;
                count++;
            }
            dir = (dir + 1) % 4;
        }

    }
}
/*
Time Complexity: O(n^2)
Space Complexity : O(n^2)
 */