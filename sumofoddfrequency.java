import java.util.HashMap;
import java.util.Scanner;

public class sumofoddfrequency {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number_of_elements = scan.nextInt();
        int[] array = new int[number_of_elements];
        for (int i = 0; i < number_of_elements; i++) {
            array[i] = scan.nextInt();
        }
        System.out.println(sumofoddfrequency(array, number_of_elements));
    }

    public static int sumofoddfrequency(int[] arr, int n) {
        int sum = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int c = 1;
            if (hm.containsKey(arr[i])) {
                int ch = hm.get(arr[i]);
                hm.put(arr[i], ch + 1);
            } else {
                hm.put(arr[i], c);
            }
        }
        for (int i = 0; i < n; i++) {
            if ((hm.get(arr[i]) % 2) != 0) {
                sum = sum + arr[i];
            }
        }
        return sum;
    }
}
