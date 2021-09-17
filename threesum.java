import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class threesum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] A = new int[n];
        for(int i=0;i<n;i++){
            A[i]= scan.nextInt();
        }
        int k = scan.nextInt();
        int c = 0;
        for(int i=0;i<A.length;i++){
            int low = i;
            int high = A.length-1;
            while(low<high){
                if(Math.abs(A[low] - A[high]) == k){
                    c++;
                    low++;
                    high--;
                }
                else if(Math.abs(A[low] - A[high]) > k){
                    high--;
                }
                else{
                    low++;
                }
            }

        }
        System.out.println(c);

    }
}
