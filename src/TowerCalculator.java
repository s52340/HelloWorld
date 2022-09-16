import java.util.Scanner;

public class TowerCalculator {
    public static void main(String[] args) {

//        long number;
//        long result;
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Bitte die Startzahl eingeben: ");
//        number = scanner.nextInt();

//        result = number * 2;
//        System.out.println(number + " * 2 = " + result);
//
//        number = result;
//        result= number * 3;
//        System.out.println( number + " * 3 = " + result);
//
//        number = result;
//        result= number * 4;
//        System.out.println( number + " * 4 = " + result);
//
//        number = result;
//        result= number * 5;
//        System.out.println( number + " * 5 = " + result);
//
//        number = result;
//        result= number * 6;
//        System.out.println( number + " * 6 = " + result);
//
//
//        number = result;
//        result= number * 7;
//        System.out.println( number + " * 7 = " + result);
//
//        number = result;
//        result= number * 8;
//        System.out.println( number + " * 8 = " + result);
//
//        number = result;
//        result= number * 9;
//        System.out.println( number + " * 9 = " + result);
//
//        number = result;
//        result= number / 2;
//        System.out.println( number + " / 2 = " + result);
//
//        number = result;
//        result= number / 3;
//        System.out.println( number + " / 3 = " + result);
//
//        number = result;
//        result= number / 4;
//        System.out.println( number + " / 4 = " + result);
//
//        number = result;
//        result= number / 5;
//        System.out.println( number + " / 5 = " + result);
//
//        number = result;
//        result= number / 6;
//        System.out.println( number + " / 6 = " + result);
//
//        number = result;
//        result= number / 7;
//        System.out.println( number + " / 7 = " + result);
//
//        number = result;
//        result= number / 8;
//        System.out.println( number + " / 8 = " + result);
//
//        number = result;
//        result= number / 9;
//        System.out.println( number + " / 9 = " + result);

        long number;
        long result;
        int multiplicator;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte die Startzahl eingeben: ");
        number = scanner.nextInt();
        result = number;

        for (multiplicator = 2; multiplicator <= 15; multiplicator++) {
        number = result;
        result = number * multiplicator;
        System.out.println(number + " * " + multiplicator + " = " + result);
        }

        for (multiplicator = 2; multiplicator <= 15; multiplicator++) {
            number = result;
            result = number / multiplicator;
            System.out.println(number + " / " + multiplicator + " = " + result);
        }





        }

        }


