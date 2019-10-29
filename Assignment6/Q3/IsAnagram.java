package Q3;
import java.util.Scanner;

public class IsAnagram {
    public static boolean isAnagram(String s, String t) {
        int[] S = new int[26];
        int[] T = new int[26];
        for (int i = 0; i < s.length(); i++){
            S[s.charAt(i) - 'a']++;
            T[t.charAt(i) - 'a']++;
        }
        for(int j = 0; j < 26; j++) {
            if (S[j] != T[j]) {
                return false;
            }
        }
        return true;
    }

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input: s = ");
        String s = scanner.next();
        System.out.println("t = ");
        String t = scanner.next();
        System.out.println("Output: " + isAnagram(s, t));
    }
}
