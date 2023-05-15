// Redesign the Class Fibonacci and class DisplaySeries with the appropriate access modifiers and getter and setter functions, along with getting the length of series from the user input.  



// import java.util.Scanner;
// public class Lab3q5 {
//     public  class Fibonacci{
//         private int size;
//         public  int fibo(int size){
//             if(size>0){
//                 return size;
//             }else{
//                 return fibo(size-1) + fibo(size-2);
//             }
//         }

//         public  int getter(int userInput){
//             // int userInput=0;
//             // userInput=inputObj.nextInt();
//             // // this.size=userInput;
//             return userInput;
//         }
//         public  void setter(int n){
//             this.size=n;
//         }
//     }
//     public class DisplaySeries{
//         static void printSeries(int size){
//             // Fibonacci fiboObject = new Fibonacci();
//             for (int i = 0; i <= size; i++) {
//                 int fibonacciNumber = Fibonacci.fibo(i);
//                 System.out.print(fibonacciNumber + " ");
//             }
//     }}

//     public static void main(String []args){
//         Scanner inputObj= new Scanner(System.in);
//         // Fibonacci Fibonacci = new Fibonacci();
//         int userInput=inputObj.nextInt();
//         int n = Fibonacci.getter(userInput);
//         Fibonacci.setter(n);
//         DisplaySeries.printSeries(userInput);
//         // System.out.println(Fibonacci.getter());
//     }
// }


import java.util.Scanner;

public class Lab3q5 {

    public static class Fibonacci {
        private int size;

        public int fibo(int size) {
            if (size <= 1) {
                return size;
            } else {
                return fibo(size - 1) + fibo(size - 2);
            }
        }

        public int getSize() {
            return size;
        }

        public void setSize(int n) {
            this.size = n;
        }
    }

    public static class DisplaySeries {
        public static void printSeries(int size) {
            Fibonacci fiboObject = new Fibonacci();
            fiboObject.setSize(size);
            for (int i = 0; i < fiboObject.getSize(); i++) {
                int fibonacciNumber = fiboObject.fibo(i);
                System.out.print(fibonacciNumber + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner inputObj = new Scanner(System.in);
        System.out.print("Enter the length of Fibonacci series: ");
        int userInput = inputObj.nextInt();
        DisplaySeries.printSeries(userInput);
        
    }
}
