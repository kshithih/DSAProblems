import java.util.Scanner;

public class matrixSearch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[][] matrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }
        int k = scan.nextInt();
        System.out.println(ans(matrix, k));

    }

    public static boolean ans(int[][] matrix, int key) {
        int n = matrix.length;
        int m = matrix[0].length;
        int i = 0;
        int j = m - 1;
        while ((i < n) && (j >= 0)) {
            if (matrix[i][j] == key) {
                return true;
            } else if (matrix[i][j] > key) {
                j--;
            } else {
                i++;
                j = m - 1;
            }
        }
        return false;

    }
}
