import java.util.Scanner;

public class TemperatureCalculator {
    public static void main(String[] args) {

        partOne();

        double valueInFahrenheit;
        double valueInCelsius;
        valueInCelsius = readValue();

//        printHeader (); ODER:
//        Allgemeine Information
//        System.out.println("Welcome to `Fancy IWI 22 Celsius to Fahrenheit Calculator`");
//        System.out.println("Please provide a value in Celsius: ");             -- printHeader ist besser!


        // Wert einlesen
        Scanner scanner = new Scanner(System.in);

        valueInCelsius = scanner.nextDouble();

        // Formel von Google (17 C * 9/5) + 32 = 62,6 F  / (62 F - 32) * 5/9 = 17 C

        // Wert nach Fahrenheit umrechnen und ausgeben
         valueInFahrenheit = (valueInCelsius * 9/5) + 32;
        System.out.println("Celsius in Fahrenheit: " + valueInFahrenheit);

        // Wert nach Celsius umrechnen und ausgeben
        valueInCelsius = (valueInFahrenheit - 32) * 5/9.0;
        System.out.println("Fahrenheit in Celsius: " + valueInCelsius);
    }

    public static void partOne() {
        //Allgemeine Information
        System.out.println("Welcome to `Fancy IWI 22 Celsius to Fahrenheit Calculator`");
        System.out.println("Please provide a value in Celsius: ");

    }

    public static double readValue(){
        // Wert einlesen
        Scanner scanner = new Scanner(System.in);
        double valueInCelsius;
        valueInCelsius = scanner.nextDouble();
        return valueInCelsius;

    }

}

