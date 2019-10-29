package Q4;
import java.util.HashMap;
import java.util.Map;

public class UniqueOccurrences {
    public static boolean uniqueOccurrences(int[] arr) {
        if(arr.length > 1000 || arr.length < 1) {
            throw new IllegalArgumentException();
        }
        for(int s:arr) {
            if(s < -1000||s > 1000) {
                throw new IllegalArgumentException();
            }
        }

        Map<Integer, Integer> ar = new HashMap<Integer, Integer>();
        Map<Integer, Integer> count = new HashMap<Integer, Integer>();
        boolean p = true;
        for(int i = 0; i < arr.length; i++) {
            if (ar.get(arr[i]) != null){
                ar.put(arr[i], ar.get(arr[i]) + 1);
            }
            else if(ar.get(arr[i]) == null)
                ar.put(arr[i], 1);
            }
        for(Map.Entry<Integer, Integer> entry:ar.entrySet()) {
            int i = 0;
            if(count.containsValue(entry.getValue()))
                p = false;
            count.put(i, entry.getValue());
            i++;
        }
        return p;
    }

    public static void main(String[] args) throws Exception {
        int[] arr = {1,2,2,1,1,3};
        System.out.println(uniqueOccurrences(arr));

    }
}
