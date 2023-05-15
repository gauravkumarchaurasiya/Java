// 6. Make the parameterized and default Constructors for Fibonacci and DisplaySeries and display the use of static block with it.

import java.util.Scanner;

class Fibonacci{
    int Fibonacci(int n){
        if(n<=1){
            return n;
        }
        else{
            return Fibonacci(n-1) + Fibonacci(n-2);
        }
    }
}
class DisplaySeries extends Fibonacci{
    void printSeries(int n){
        for(int i=0;i<n;i++){
            System.out.print(Fibonacci(i) + " ");
        }
    }
}
public class Lab3q6 {
    static{
        System.out.println("Fibonacci Program with Paramatrized and Default constructors and static block");
        System.out.println("Copyright Reserved @GauravKC");

    }
    public static void main(String []args) {
        int size;
        Scanner inputObj= new Scanner(System.in);
        DisplaySeries displayObj = new DisplaySeries();
        System.out.println("Enter size of Fibonacci length : ");
        size = inputObj.nextInt();
        displayObj.printSeries(size);
    }
}