// Make an Interface InterfaceCalculator and 
// implement the interface in Calcualtor to make sure all 
// the functions given in the design InterfaceCalculator 
// has been followed during implementation.


interface InterfaceCalculator{
    int addition(int a, int b);
    int subtraction(int a, int b);
    int multiplication(int a, int b);
    int division(int a, int b);
}

class Calculator implements InterfaceCalculator{
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
}
        public class Lab6q11 {
            public static void main(String args[]){
                Calculator calObj = new Calculator();
                System.out.println(calObj.addition(5, 5));
                System.out.println(calObj.subtraction(10, 5));
                System.out.println(calObj.multiplication(5, 5));
                System.out.println(calObj.division(4, 2));
            }
            
        }