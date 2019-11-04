package Q4;
import java.util.Random;
import java.util.Arrays;

public class SumValue {
    /*generate array of random numbers*/
    public static void generateRandomArray(int[] arr) {
        final Random RAND = new Random();
        for(int i = 0; i < arr.length; i++) {
            arr[i] = RAND.nextInt();
        }
    }

    /*get sum of an array using 4 threads*/
    public static long sum(int[] arr) {
        int[] a1 = Arrays.copyOfRange(arr, 0, arr.length / 4);
        int[] a2 = Arrays.copyOfRange(arr, arr.length / 4, arr.length / 2);
        int[] a3 = Arrays.copyOfRange(arr, arr.length / 2, arr.length / 4 * 3);
        int[] a4 = Arrays.copyOfRange(arr, arr.length / 4 * 3, arr.length);
        long ans;
        Thread thread1 = new Thread(() -> add(a1));
        Thread thread2 = new Thread(() -> add(a2));
        Thread thread3 = new Thread(() -> add(a3));
        Thread thread4 = new Thread(() -> add(a4));
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        return sum;
    }

    public  static long sum = 0;
    public static long add (int[] arr){
        long add = 0;
        for(int n:arr){
            add += n;
            sum += add;
        }
        return add;
    }
    public static void main(String[] args){
        int[] arr = new int[4000000];
        generateRandomArray(arr);
        long sum = sum(arr);
        System.out.println("Sum: " + sum);
    }
}
