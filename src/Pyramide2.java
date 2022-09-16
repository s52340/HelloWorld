import java.util.Scanner;

public class Pyramide2 {

    public static void main(String[] args) {
        int zahl;
        int ergebnis;
        int multiplikator;

        System.out.println("Bitte geben sie eine Zahl ein: ");

        Scanner scanner = new Scanner(System.in);
        zahl = scanner.nextInt();

        ergebnis = zahl;
// Wieso ergebnis = zahl ??

        for (multiplikator = 2; multiplikator <= 9; multiplikator++) {
            zahl = ergebnis;
            ergebnis = zahl * multiplikator;
            System.out.println(zahl + " * " + multiplikator + " = " + ergebnis);}


    }

}

