
package demo.example;
public class Calculator {
    public Calculator() {
        System.out.println("Calculator constructor called");
    }
        int addition(int a,int b){
            return a+b;
        }
        int subtraction(int a,int b){
            return a-b;
        }
        int division(int a,int b){
            if(b==0){
                System.out.println("NOt divisible by zero ");
            }
            return a/b;
        }
        int multiplication(int a,int b){
            return a*b;
        }
    
    }

