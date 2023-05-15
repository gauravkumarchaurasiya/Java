// 8. Working on the similar lines, further upgrade 
// ScientificCalcualtor to SeriesEnabledCalculator by 
// adding Fibonnacci series functionality

import java.util.Arrays;  
import demo.example.*;
public class Lab4q8 {
    public static void main(String[] args) {
        ScientificCalculator scientificCalculatorObj = new ScientificCalculator();
        int sub = scientificCalculatorObj.subtraction(6,5);
        System.out.println(sub);

        SeriesEnabledCalculator seriesEnableObj = new SeriesEnabledCalculator();
        int[] fibonacciSeries = seriesEnableObj.fibonacci(10); 
        System.out.println(Arrays.toString(fibonacciSeries));
    }
}
 class SeriesEnabledCalculator extends ScientificCalculator {
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
}



