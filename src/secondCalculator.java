public class secondCalculator {
    public static void main(String[] args) {
        int numberOne = 0;
        numberOne = 5;

        int numberTwo = 0;
        numberTwo = 3;

        int summe = numberOne + numberTwo;
        System.out.println(numberOne + " + " + numberTwo + " = " + summe);

        int ergebnisSubtrahieren = numberOne - numberTwo;
        System.out.println(numberOne + " - " + numberTwo + " = " + ergebnisSubtrahieren);

        int ergebnisMultiplizieren = numberOne * numberTwo;
        System.out.println( numberOne + " * " + numberTwo + " = " + ergebnisMultiplizieren);

        int ergebnisdivision = numberOne / numberTwo;
        System.out.println(numberOne + " / " + numberTwo + " = " + ergebnisdivision);

        double numberdoubleTwo = numberTwo;
        double ergebnisDivision = numberOne / numberdoubleTwo;
        System.out.println(numberOne + " / " + numberTwo + " = " + ergebnisDivision);

        // warum double numberdoubleTwo = numberTwo???

        int ergebnisProzent = numberOne % numberTwo;
        System.out.println(numberOne + " % " + numberTwo + " = " + ergebnisProzent);
     }
}
