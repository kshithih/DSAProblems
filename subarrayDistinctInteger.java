import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class subarrayDistinctInteger {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number_of_elements = scan.nextInt();
        int[] array = new int[number_of_elements];
        for (int i=0;i<number_of_elements;i++){
            array[i] = scan.nextInt();
        }
        int c = scan.nextInt();
        System.out.println(solutionApproach(array,number_of_elements,c));
    }
    public static int solutionApproach(int[] a , int number_of_elements , int c){
        int count = 0;
        HashSet<Integer> hs =new HashSet<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i=0;i<number_of_elements;i++) {
            for (int j = 0; j < number_of_elements; j++) {
                for (int k = i; k <= j; k++) {
                    ans.add(a[k]);
                    hs.add(a[k]);
                }
                if (hs.size() == c) {
                    count++;
                }
                ans.clear();
                hs.clear();
            }
        }
        return count;
    }
}
