package Q5;
import java.util.Arrays;

public class Q5 {
    public static int[] findPermutation(String s) {
        int n = s.length(), i = 0, d = s.length();
        int[] result = new int[n + 1];
        int index = 0;
        int sum = 0;
        for (int j = 0; j < n; j++) {
            char c = s.charAt(j);
            if (c == 'I') {
                sum += i;
                result[index++] = i++;
            } else {
                sum += d;
                result[index++] = d--;
            }
        }
        result[n] = (n + 1) * n / 2 - sum;
        return result;
    }

        public static void main(String[] args)
        {
            int[] a = findPermutation("IDID");
            System.out.println(Arrays.toString(a));
            int[] b = findPermutation("III");
            System.out.println(Arrays.toString(b));
            int[] c = findPermutation("DDI");
            System.out.println(Arrays.toString(c));
        }

}


