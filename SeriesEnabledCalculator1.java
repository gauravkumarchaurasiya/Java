// demo/example/calculator/SeriesEnabledCalculator1.java
import demo.example.ScienticficCalculator;
import demo.example.Calculator;
import java.util.Arrays;
public class SeriesEnabledCalculator1 extends ScienticficCalculator  {
    public SeriesEnabledCalculator1() {
        System.out.println("SeriesEnabledCalculator1 constructor called");
    }

    
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
        // ScienticficCalculator scientificCalculator = new ScienticficCalculator();

        SeriesEnabledCalculator1 seriesEnabledCalculator1 = new SeriesEnabledCalculator1();
        // int n=6;
        // int result[] = seriesEnabledCalculator1.fibonacci(n);
        // System.out.println("Result: " + Arrays.toString(result));
    }
}
