import java.util.*;
public class pickfrom {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] array = new int[n];
        for(int i=0;i<n;++i)
        {
            array[i] = scan.nextInt();
        }
        int b = scan.nextInt();
        ans(array,b);
    }
    public  static void ans(int[] A , int B)
    {
        int currsum = 0;
        for(int i = 0;i<B;++i)
        {
            currsum += A[i];
        }
        int including = A.length-1;
        int excluding = B-1;
        int maxsum = currsum;
        while(including>=0 && excluding>=0)
        {
            currsum += A[including];
            currsum -= A[excluding];
            including--;
            excluding--;
            maxsum = Math.max(maxsum , currsum);
        }
        System.out.println(maxsum);
    }
}
