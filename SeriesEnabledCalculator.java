// demo/example/calculator/SeriesEnabledCalculator.java
import demo.example.ScienticficCalculator;
import demo.example.Calculator;
import java.util.Arrays;
public class SeriesEnabledCalculator extends ScienticficCalculator{
    
    public int[] fibonacci(int n) {
        int[] fibo = new int[n];
        fibo[0] = 0;
        if (n > 1) {
            fibo[1] = 1;
            for (int i = 2; i < n; i++) {
                fibo[i] = fibo[i-1] + fibo[i-2];
            }
        }
        return fibo;
    }

    public static void main(String[] args) {
        Calculator calculatorObj = new Calculator();
        ScienticficCalculator scientificCalculatorObj = new ScienticficCalculator();
        
        SeriesEnabledCalculator seriesEnableObj = new SeriesEnabledCalculator();
        int[] fibonacciSeries = seriesEnableObj.fibonacci(10); 
        System.out.println(Arrays.toString(fibonacciSeries));
    }
}
