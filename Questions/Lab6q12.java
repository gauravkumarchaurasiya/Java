// Make a class SeriesEnabledCalculator to 
// implement InterfaceSeriesEnabledCalculator which 
// inherits InterfaceCalculator and 
// InterfaceScientificCalculator
// Define the InterfaceCalculator interface
// import java.math.*;
interface InterfaceCalculator{
    int addition(int a, int b);
    int subtraction(int a, int b);
    int multiplication(int a, int b);
    int division(int a, int b);
}

interface InterfaceScientificCalculator {
    double logarithm(double x);
    double exponent(double x, double y);
}

interface InterfaceSeriesEnabledCalculator extends InterfaceCalculator, InterfaceScientificCalculator {
    int[] fibonacci(int n);
}

class SeriesEnabledCalculator implements InterfaceSeriesEnabledCalculator {
    public int addition(int a, int b){
        return a+b;
    }
    public int subtraction(int a,int b){
        return a-b;
    }
    public int division(int a,int b){
        if(b==0){
            System.out.println("NOt divisible by zero ");
        }
        return a/b;
    }
    public int multiplication(int a,int b){
        return a*b;
    }
    public double logarithm(double x) {
        return Math.log(x);
    }

    public double exponent(double x, double y) {
        return  Math.pow(x, y);
    }

    public int[] fibonacci(int n) {
        int[] fibo = new int[n];
        fibo[0] = 0;
        if (n > 1) {
            fibo[1] = 1;
            for (int i = 2; i < n; i++) {
                fibo[i] = fibo[i - 1] + fibo[i - 2];
            }
        }
        return fibo;
    }
}

public class Lab6q12 {
    public static void main(String[] args) {
        SeriesEnabledCalculator calculatorObj = new SeriesEnabledCalculator();
        int[] fibonacciSeries = calculatorObj.fibonacci(10);
        System.out.println("Exponent of 5 ** 5 is : " + calculatorObj.exponent(5, 5));
        for (int number : fibonacciSeries) {
            System.out.print(number + " ");
        }
    }
}
