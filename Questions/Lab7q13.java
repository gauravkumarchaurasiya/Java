// Make a class to catch an exception created by 
// division by zero along with finally block.
import java.util.Scanner;

public class Lab7q13 {
    public static void main(String args[]) {
        Scanner inputInt = new Scanner(System.in);
        int i = 0;
        
        while (i < 2) {
            try {
                System.out.println("Enter a and b: ");
                int a = inputInt.nextInt();
                int b = inputInt.nextInt();
                System.out.println(a / b);
            } catch (ArithmeticException e) {
                System.out.println("Can't be divisible by Zero!");
            } finally {
                System.out.println("Finally block executed.");
            }
            i = i + 1;
        }
    }
}
