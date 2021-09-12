import java.util.ArrayList;
import java.util.Scanner;

public class twosum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number_of_elements = scan.nextInt();
        int[] array = new int[number_of_elements];
        for (int i = 0; i < number_of_elements; i++) {
            array[i] = scan.nextInt();
        }
        ArrayList<Integer> ans = new ArrayList<>();
        System.out.println("Enter sum ");
        int sum = scan.nextInt();
        int low = 0;
        int high = array.length - 1;
        while (low < high) {
            int cursum = array[low] + array[high];
            if (cursum == sum) {
                System.out.println(low);
                System.out.println(high);
                break;
            } else if (cursum < sum) {
                low++;
            } else {
                high--;
            }
        }

    }
}
