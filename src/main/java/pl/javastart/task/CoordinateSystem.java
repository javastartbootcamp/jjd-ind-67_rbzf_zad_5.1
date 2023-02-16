package pl.javastart.task;

import java.util.Scanner;

public class CoordinateSystem {

    // uzupełnij metodę. Używaj scannera przekazanego w parametrze.
    void run(Scanner scanner) {
        System.out.println("Podaj wspolrzedna x:");
        int x = scanner.nextInt();
        System.out.println("Podaj wspolrzedna y:");
        int y = scanner.nextInt();
        System.out.println("Punkt (" + x + ", " + y + ")" + checkQuarter(x, y));

    }

    private String checkQuarter(int x, int y) {
        if (x > 0 && y > 0) {
            return " lezy w I cwiartce ukladu wspolrzednych.";
        }
        if (x < 0 && y > 0) {
            return " lezy w II cwiartce ukladu wspolrzednych.";
        }
        if (x < 0 && y < 0) {
            return " lezy w III cwiartce ukladu wspolrzednych.";
        }
        if (x > 0 && y < 0) {
            return " lezy w IV cwiartce ukladu wspolrzednych.";
        }
        if (x == 0 && y == 0) {
            return " lezy w srodku ukladu wspolrzednych.";
        }
        if (x != 0 && y == 0) {
            return " lezy na osi X ukladu wspolrzednych.";
        }
        if (x == 0 && y != 0) {
            return " lezy na osi Y ukladu wspolrzednych.";
        }
        return null;
    }
}