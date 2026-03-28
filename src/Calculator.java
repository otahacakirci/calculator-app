public class Calculator {

    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if(b == 0) {
            throw new ArithmeticException("Divide by zero error");
        }
        return a / b;
    }

    public double power(double a, double b) {
        return Math.pow(a, b);
    }

    public double squareRoot(double number) {
        if(number < 0) {
            throw new ArithmeticException("Square root by negative number error");
        }
        return Math.sqrt(number);
    }
}
