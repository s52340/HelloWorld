public class FirstCalculator {
    //psvm
    public static void main(String[] args) {
       int number1 = 9;
       int number2 = 0;

        System.out.println("Zahl 1: " + number1);
        number2 = 5;
        System.out.println("Zahl 2: " + number2);

        int summe = number1 + number2;
        System.out.println(number1 + " + " + number2 + " = " + summe);

        int resultSubtraktion = number1 - number2;
        System.out.println(number1 + " - " + number2 + " = " + resultSubtraktion);

        double numberDouble2 = number2;
        double resultDivision = number1 / numberDouble2;
        System.out.println(number1 + " / " + number2 + " = " + resultDivision);

        int resultMultiplikation = number1 * number2;
        System.out.println(number1 + " * " + number2 + " = " + resultMultiplikation);

        int resultModulo = number1 % number2;
        System.out.println(number1 + " % " + number2 + " = " + resultModulo);
    }
}
