package dev.personal.java.imc.view;

import java.util.Scanner;

public class View {

    Scanner scanner = new Scanner(System.in); 

    public double askHeight () {
        System.out.println("Ingrese su altura en metros: ");
        return scanner.nextDouble();
    }

    public double askWeight () {
        System.out.println("Ingrese su peso en kilogramos: ");
        return scanner.nextDouble();
    }

    public void showResults (double bmi, String catergory) {
        System.out.printf("Tu IMC es: %.2f%n%n", bmi);
        System.out.println("Tu IMC es: " + catergory);
    }

    public void closeScanner () {
        scanner.close();
    }
}
