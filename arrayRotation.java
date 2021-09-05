import java.util.*;

class arrayRotation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number_of_elements = scan.nextInt();
        int[] array = new int[number_of_elements];
         int k = scan.nextInt();
        for (int i = 0; i < number_of_elements; i++) {
            array[i] = scan.nextInt();
        }
       
        Solution s = new Solution();
        s.rotate(array,k);
        for (int val: array) {
            System.out.print(val + " ");
        }
    }
}
class Solution {
         public static void rotate(int[] a, int k){
            for(int i=0;i<k;i++)
            {
              rotateArr( a);
            }
         }
            public static  void rotateArr(int[] a)
            {
                int temp = a[0];
                for(int i=0;i<a.length-1;i++)
                {
                  a[i]=a[i+1];
                }
                a[a.length-1]=temp;
            }
         }
