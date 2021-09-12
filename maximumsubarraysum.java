import java.util.Scanner;

public class maximumsubarraysum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number_of_elements = scan.nextInt();
        int[] array = new int[number_of_elements];
        for (int i = 0; i < number_of_elements; i++) {
            array[i] = scan.nextInt();
        }
        int maxsum = Integer.MIN_VALUE;
        int cur = 0;
        for (int i = 0; i < number_of_elements; i++) {
            cur += array[i];
            if (cur < 0) {
                cur = 0;
            }
        }
        System.out.println(cur);
    }
}

