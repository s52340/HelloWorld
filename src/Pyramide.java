import java.util.Scanner;

public class Pyramide {
    public static void main(String[] args) {

        int zahl;
        int ergebnis;


        System.out.println(" Bitte geben Sie eine Zahl ein: ");
        Scanner scanner = new Scanner(System.in);
        zahl = scanner.nextInt();

        ergebnis = zahl * 2;
        System.out.println(zahl + " * " + 2 + " = " + ergebnis );

        // warum unten rot?? verschiebbar :/
        zahl = ergebnis;
        ergebnis = zahl * 3;
        System.out.println( zahl + " * " + 3 + " = " + ergebnis);

        zahl = ergebnis;
        ergebnis = zahl * 4;
        System.out.println(zahl + " * 4 = " + ergebnis);

        zahl = ergebnis;
        ergebnis = zahl * 5;
        System.out.println(zahl + " * 5 = " + ergebnis);

    }
        }



