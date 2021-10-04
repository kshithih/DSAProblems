import java.util.HashMap;
import java.util.Scanner;

public class stringAnagram{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String s2 = scan.nextLine();
        System.out.println(diamond(s, s2));
    }

    public static boolean diamond(String s, String s2) {
        HashMap<Character, Integer> mp = new HashMap<>();
        int c = 0;
        for (int i = 0; i < s.length(); i++) {
            if (!mp.containsKey(s.charAt(i))) {
                mp.put(s.charAt(i), 1);
            } else {
                c = mp.get(s.charAt(i));
                mp.put(s.charAt(i), c);
            }
        }
        for (int i = 0; i < s2.length(); i++) {
            if (!mp.containsKey(s2.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
