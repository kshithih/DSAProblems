import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        int number_of_elements = scan.nextInt();
        int[] array = new int[number_of_elements];
        for(int i=0;i<number_of_elements;i++)
        {
            array[i]=scan.nextInt();
        }
        for(int i=0;i<number_of_elements;i++){
            int cur_sum = 0;
            for(int j=i;j<number_of_elements;j++)
            {
                cur_sum+=array[j];
                System.out.println(cur_sum);
            }
        }

    }
}