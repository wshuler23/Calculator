package Shuler.Willie.Calculator;

/**
 * Created by willieshuler on 9/11/16.
 */
public class MathMethods {

    double number;
    double sum= 0;
    double result;

    public double add(double number, double sum) {
        result = (sum + number);
        return result;
    }

    public double subtract(double sum, double number) {
        result = (sum - number);
        return result;
    }

    public double division(double number, double sum) {
        result = (number/sum);
        return result;
    }

    public double multiplication(double number, double sum) {
        result = (sum * number);
        return result;
    }
}
