// You are given a string SS consisting of NN lowercase letters of the English alphabet. Count the number of adjacent pairs of vowels.
// In this problem, we consider there are 55 letters that represent vowels: a, e, i, o and u.
// Standard input
// The first line contains a single integer NN.
// The second line contains the string SS.

// Standard output
// Print the answer on the first line.


import java.util.HashSet;
import java.util.Scanner;

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
