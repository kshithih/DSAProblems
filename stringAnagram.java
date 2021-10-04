// Program to check if two strings are anagrams or not is discussed here. 
// Two strings are given as input and those strings have to be checked if they are anagrams or not.
// Anagram means that both strings contain the same character set, only their order is different. 
// Therefore, in both strings, the frequency of each letter must be the same. For example, strings "act" and "cat" are anagrams.



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
