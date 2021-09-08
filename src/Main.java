import first.ConstantMessages;
import second.MyCalculator;

public class Main {
    public static void main(String[] args) {
        MyCalculator myCalculator = new MyCalculator();
        System.out.println("2+2= " + myCalculator.plus(2, 2));
        System.out.println("2.15+2.45= " + myCalculator.plus(2.15, 2.45));
        System.out.println("2+2.37= " + myCalculator.plus(2, 2.37));
        System.out.println("2.37+2= " + myCalculator.plus(2.37, 2));
        System.out.println("2-2= " + myCalculator.minus(2, 2));
        System.out.println("2.15-2.45= " + myCalculator.minus(2.15, 2.45));
        System.out.println("2-2.37= " + myCalculator.minus(2, 2.37));
        System.out.println("2.37-2= " + myCalculator.minus(2.37, 2));
        System.out.println("2*2= " + myCalculator.multiply(2, 2));
        System.out.println("2.15*2.45= " + myCalculator.multiply(2.15, 2.45));
        System.out.println("2*2.37= " + myCalculator.multiply(2, 2.37));
        System.out.println("2.37*2= " + myCalculator.multiply(2.37, 2));
        System.out.println("2/0= " + myCalculator.divide(2, 0));
        System.out.println("2.15/2.45= " + myCalculator.divide(2.15, 2.45));
        System.out.println("2/2.37= " + myCalculator.divide(2, 2.37));
        System.out.println("2.37/2= " + myCalculator.divide(2.37, 2));


    }

}
