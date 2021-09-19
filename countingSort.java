//Sorting elements based on counting sort algorithm

import java.util.Scanner;

public class countingSort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number_of_elements = scan.nextInt();
        int[] array = new int[number_of_elements];
        for(int i=0;i<number_of_elements;i++){
            array[i]= scan.nextInt();
        }
        int maximum =array[0];
        for(int i=0;i<number_of_elements;i++){
            maximum = Math.max(maximum,array[i]);
        }
        int[] count = new int[maximum+1];

        for(int i=0;i<number_of_elements;i++){
            count[array[i]]++;
        }
        count[0]=0;
        for(int i=1;i<maximum+1;i++){
            count[i] += count[i-1];
        }
        int[] ans = new int[number_of_elements];
        for(int i=array.length-1;i>=0;i--){
           ans[--count[array[i]]]= array[i];
        }
        for (int i=0;i<number_of_elements;i++){
            System.out.print(ans[i]+"\t");
        }

    }
}
