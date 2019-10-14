package Q2;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Number {
    public static void main(String[] args){
        int quo = count();
        System.out.println("The quotient of two numbers is: " + quo);

    }
    public static int count(){
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Please enter the first number: ");
            int num1 = input.nextInt();
            System.out.print("Please enter the second number: ");
            int num2 = input.nextInt();
            return num1 / num2;
        } catch (InputMismatchException e1) {
            System.out.println("Exception 1: The input is not a number");
            return 0;
        } catch (ArithmeticException e2) {
            System.out.println("Exception 2: The divisor can't be zero");
            return 0;
        } catch (Exception e4) {
            System.out.println("Other exceptions: " + e4.getMessage());
            return 0;
        } finally {
            System.out.println("The last content needed to be executed");
        }
    }
}
