
import java.util.*;
class searchinsortedmatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter no of rows and columns");
        int rows = scan.nextInt();
        int column = scan.nextInt();
        int key = scan.nextInt();
        int[][] matrix = new int[rows][column];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }
        int i = 0;
        int j = column - 1;
        int flag = 0;
        while ((i < rows) && (j >= 0)) {
            if (matrix[i][j] == key) {
                flag = 1;
                System.out.println(i + " " + j);
                break;
            } else if (matrix[i][j] > key) {
                j--;
            } else {
                i++;
            }
        }
        if (flag == 0) {
            System.out.println("Not found");
        }
    }
}

/*
Time Complexity : O(n^2)
Space Complexity : O(n^2)
*/
