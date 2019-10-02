package assignment3;

import java.util.*;

public class Assignment3 {
    public static void main(String[] args) {

    }
    //Q5
    public static String countAndSay(int n){
        String say = "1";
        while (--n > 0) {
            int count = 1;
            StringBuilder sb = new StringBuilder();
            for (int i = 1; i < say.length(); i++)
                if (say.charAt(i) == say.charAt(i - 1)) count++;
                else {
                    sb.append(count).append(say.charAt(i - 1));
                    count = 1;
                }
            say = sb.append(count).append(say.charAt(say.length() - 1)).toString();
        }
        return say;
    }

    //Q6
    public static String reverseString(String s3){
        String[] split = s3.split(" ");
        StringBuilder s4 = new StringBuilder();//
        for(int i = split.length-1; i>=0; i--){
            if(i == 0){
                s4.append(split[i]);
            }else{
                s4.append(split[i]+" ");
            }
        }
        return s4.toString();
    }

    //Q7
    public static int[] spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int row = matrix.length, col = matrix[0].length;
        int top =0, left = 0, right = col - 1, bottom = row - 1;

        while(res.size() < row * col) {
            for(int c = left; c <= right; c++)
                res.add(matrix[top][c]);
            top++;
            if(res.size() < row * col) {
                for(int r = top; r <= bottom; r++)
                    res.add(matrix[r][right]);
                right--;
            }
            if(res.size() < row * col) {
                for(int c = right; c >= left; c--)
                    res.add(matrix[bottom][c]);
                bottom--;
            }
            if(res.size() < row * col) {
                for(int r = bottom; r >= top; r--)
                    res.add(matrix[r][left]);
                left++;
            }
        }
        int[] temp = new int[res.size()];
        for(int i = 0;i<res.size();i++){
            temp[i] = res.get(i);
        }
        return temp;
    }

    //Q8
    public static String zigZagString(String s4, int rowNum){
        if(s4 == null || s4.length() == 0 || rowNum <= 1){
            return s4;
        }
        StringBuilder zString = new StringBuilder();
        int zig = 2 * rowNum - 2;
        for(int i = 0; i < rowNum; i++){
            for(int j = i; j < s4.length(); j += zig){
                zString.append(s4.charAt(j));
                if(i > 0 && i < rowNum - 1){
                    int k = j + zig - 2 * i;
                    if(k < s4.length()){
                        zString.append(s4.charAt(k));
                    }
                }
            }
        }
        return zString.toString();
    }

    //Q9. Explain Encapsulation with an example. (Write at least 30-40 words).
    /*
    Encapsulation refers to the method that packages and hides the implementation details of the abstract function
    interface, which can prevent code and data of the class from being randomly accessed by the code that is defined
    by external classes. Proper encapsulation makes the code easier to understand and maintain, and it also enhances
    the security of the code.

    For example:
    public class Apple{
        private int amount;
        private double price;
    ​
        public int getAmount(){
            return weight;
        }
    ​
        public double getPrice(){
            return price;
        }
    ​
        public void setAmount(int amount){
            this.amount = amount;
        }
        public void setPrice(int price){
            this.price = price;
        }
    }

    public class Test{
       public static void main(String args[]){
          Test a = new Test();
          a.setAmount(3);
          a.setPrice(1.99);
          System.out.print("Amount : " + a.getAmount()+ " Price : "+ a.getPrice());
        }
    }

    In this example, I encapsulated Apple class, so there is no specific implementation of functions in Test class.
    */


    //Q10. What is the difference between Encapsulation and Abstraction
    /*
    Abstraction:
    Abstraction is the method that ignores some parts of a problem that are not related to the current goal, and in
    this way programmers can pay more attention to the parts related to the current goal. Abstraction does not intend to
    acknowledge the whole problem, but only the selected parts. Abstraction includes two aspects: Process abstraction
    and data abstraction.

    Encapsulation:
    It is the method that packages and hides the implementation details of the abstract function interface, so if users
    want to access to the data, they can only do it by the defined interface.

    In a word, abstraction makes people dealing with the details of different perspectives, and then people
    implement abstraction by encapsulation.
    */
}

