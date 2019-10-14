package Q4;
import java.util.Random;

public class MyIndexOutOfBoundException extends RuntimeException {
    int lowerBound, upperBound, index;

    MyIndexOutOfBoundException(){}
    MyIndexOutOfBoundException(int index, int low, int high){
        this.lowerBound = low;
        this.upperBound = high;
        this.index = index;
    }
    public String toString(){
        return "Error Message: Index: " + index + ", but lower bound: " + this.lowerBound + ", upper bound: " + this.upperBound;
    }
    public static void main(String[] args){
        final int S = 10;
        int[] s = new int[S];

        Random random = new Random();

        System.out.println("Starting random access in an int array size " + S);
        while(true){
            int i = random.nextInt(S + S / 2);
            try {
                System.out.println("Try to access the number of index: " + i);
                if (i >= S)
                    throw new MyIndexOutOfBoundException(i, 0, S - 1);
                else
                    s[i] = random.nextInt(S);
            } catch (Exception ex) {
                System.out.println(ex);
                return;
            }
        }
    }
}
