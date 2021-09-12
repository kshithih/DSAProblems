import java.util.ArrayList;
import java.util.Scanner;

public class sortzerontwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number_of_elements = sc.nextInt();
        int[] array = new int[number_of_elements];
        for (int i = 0; i < number_of_elements; i++) {
            array[i] = sc.nextInt();
        }
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < number_of_elements; i++) {
            if (array[i] == 0) {
                count0++;
            } else if (array[i] == 1) {
                count1++;
            } else {
                count2++;
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        int i = 0;
        while (i < count0) {
            ans.add(0);
            i++;
        }
        i = 0;
        while (i < count1) {
            ans.add(1);
            i++;
        }
        i = 0;
        while (i < count2) {
            ans.add(2);
            i++;
        }
        System.out.println(ans);
    }
}
}
