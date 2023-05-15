package demo.example;
public class ScienticficCalculator extends Calculator{
        
    public ScienticficCalculator() {
        System.out.println("ScienticficCalculator constructor called");
    }
        double exponent(double a,double b){
            return Math.pow(a, b);
        }
        double logarithm(int a){
             return Math.log(a);
    }

}

