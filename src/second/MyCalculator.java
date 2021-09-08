package second;

import first.ConstantMessages;
import first.Numerable;

public class MyCalculator implements Numerable {
    @Override
    public double divide(int x, int y) throws ArithmeticException {
        double result = 0;
        try {
            result = x / y;
        } catch (ArithmeticException e) {
            System.out.println(ConstantMessages.errorDividingByZero);

        }
        return result;
    }

    @Override
    public double divide(double x, double y) throws ArithmeticException {
        double result = 0;
        try {
            result = x / y;
        } catch (ArithmeticException e) {
            System.out.println(ConstantMessages.errorDividingByZero);

        }
        return result;
    }

    @Override
    public double divide(int x, double y) throws ArithmeticException {
        double result = 0;
        try {
            result = x / y;
        } catch (ArithmeticException e) {
            System.out.println(ConstantMessages.errorDividingByZero);

        }
        return result;
    }

    @Override
    public double divide(double x, int y) throws ArithmeticException {
        double result = 0;
        try {
            result = x / y;
        } catch (ArithmeticException e) {
            System.out.println(ConstantMessages.errorDividingByZero);

        }
        return result;
    }

    @Override
    public int minus(int x, int y) {
        return x - y;
    }

    @Override
    public double minus(double x, double y) {
        return x - y;
    }

    @Override
    public double minus(int x, double y) {
        return x - y;
    }

    @Override
    public double minus(double x, int y) {
        return x - y;
    }

    @Override
    public int multiply(int x, int y) {
        return x * y;
    }

    @Override
    public double multiply(double x, double y) {
        return x * y;
    }

    @Override
    public double multiply(int x, double y) {
        return x * y;
    }

    @Override
    public double multiply(double x, int y) {
        return x * y;
    }

    @Override
    public int plus(int x, int y) {
        return x + y;
    }

    @Override
    public double plus(double x, double y) {
        return x + y;
    }

    @Override
    public double plus(int x, double y) {
        return x + y;
    }

    @Override
    public double plus(double x, int y) {
        return x + y;
    }
}
