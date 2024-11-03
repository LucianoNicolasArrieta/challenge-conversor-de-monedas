package com.lna.principal;

import com.lna.model.Conversion;
import com.lna.util.Menu;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        boolean running = true;
        Scanner scanner = new Scanner(System.in);
        String opcion;

        while (running){
            Menu.printMenu();
            opcion = scanner.nextLine().trim();
            Conversion conversion;
            switch (opcion){
                case "1":
                    conversion = new Conversion("USD", "ARS");
                    conversion.setValor();
                    System.out.println(conversion);
                    System.out.println("\nPresione Enter para continuar...");
                    scanner.nextLine();
                    break;
                case "2":
                    conversion = new Conversion("ARS", "USD");
                    conversion.setValor();
                    System.out.println(conversion);
                    System.out.println("\nPresione Enter para continuar...");
                    scanner.nextLine();
                    break;
                case "3":
                    conversion = new Conversion("USD", "BRL");
                    conversion.setValor();
                    System.out.println(conversion);
                    System.out.println("\nPresione Enter para continuar...");
                    scanner.nextLine();
                    break;
                case "4":
                    conversion = new Conversion("BRL", "USD");
                    conversion.setValor();
                    System.out.println(conversion);
                    System.out.println("\nPresione Enter para continuar...");
                    scanner.nextLine();
                    break;
                case "5":
                    conversion = new Conversion("USD", "COP");
                    conversion.setValor();
                    System.out.println(conversion);
                    System.out.println("\nPresione Enter para continuar...");
                    scanner.nextLine();
                    break;
                case "6":
                    conversion = new Conversion("COP", "USD");
                    conversion.setValor();
                    System.out.println(conversion);
                    System.out.println("\nPresione Enter para continuar...");
                    scanner.nextLine();
                    break;
                case "7":
                    running = false;
                    System.out.println("Hasta pronto!");
                    break;
                default:
                    System.out.println("Por favor, seleccione una opción válida. Inténtelo nuevamente.");
                    break;
            }
        }
    }
}
