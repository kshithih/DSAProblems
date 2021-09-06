/* Rotate matrix by 90 degree*/
    

package com.company;
import java.util.*;
public class rotatematrix {
    public static  void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter rows");
        int rows = scan.nextInt();
        int column = scan.nextInt();
        int[][] matrix = new int[rows][column];
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<column;j++)
            {
                matrix[i][j]= scan.nextInt();
            }
        }
        for(int i=0;i<rows;i++) {
            for (int j = i+1; j < column; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        int low = 0;
        int high = column-1;

        while(low<high)
        {
            for(int i=0;i<rows;i++)
            {
                int temp = matrix[i][high];
                matrix[i][high] = matrix[i][low] ;
                matrix[i][low] =temp;


            }
            low++;
            high--;
        }


        for(int i=0;i<rows;i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
        }
    }
}

/*
Time Complexity : O(n^2)
Space Complexity : O(n^2)
*/
