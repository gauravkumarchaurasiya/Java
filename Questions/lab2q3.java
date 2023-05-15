// 3. WAP to make a an object of Class Fibonacci in the another class DisplaySeries and print the Fibonacci Series till n.

public class lab2q3 {
    public class Fibonacci {
        public static int fibo(int n) {
            if (n <= 1) {
                return n;
            } else {
                return fibo(n - 1) + fibo(n - 2);
            }
        }}
        
    class DisplaySeries{
        static void printSeries(int n){
        for (int i = 0; i <= n; i++) {
            int fibonacciNumber = Fibonacci.fibo(i);
            System.out.print(fibonacciNumber + " ");
        }
    }}
    
        public static void main(String[] args) {
            int n = 10; 
            DisplaySeries.printSeries(n);
        
        }}
