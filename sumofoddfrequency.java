// Finding the Sum of all Odd Frequency Elements in an Array
// An array of integers is given as input and the sum of elements having odd frequency is found and produced as output. 
// This means elements which repeat an odd number of times in the given array will be identified and the sum of these will be the expected output.
// For example, consider an array arr = {1, 2, 4, 5, 6, 3, 1, 2, 3, 3}
// Here, elements 1 and 2 repeats twice (even), whereas elements 4, 5, 6 are present only once (odd) and element 3 occurs thrice (odd). Hence,
// Elements having odd frequency : {4, 5, 6, 3, 3, 3}
// Sum of elements having odd frequency: 24


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
