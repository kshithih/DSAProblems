// Don't place your source in a package

import java.util.HashSet;
import java.util.Scanner;

// Please name your class Main
class adjacentVowels {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int i = 0;
        String s = in.next();
        System.out.print(adjacentvowels(s));
    }

    public static int adjacentvowels(String s) {
        int count = 0;
        HashSet<Character> hs = new HashSet<>();
        hs.add('a');
        hs.add('e');
        hs.add('i');
        hs.add('o');
        hs.add('u');
        for (int i = 0; i < s.length() - 1; i++) {
            if ((hs.contains(s.charAt(i))) && (hs.contains(s.charAt(i + 1)))) {
                count++;
            }
        }
        return count;
    }

}
