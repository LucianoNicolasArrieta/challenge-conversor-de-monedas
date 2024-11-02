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
            Conversion conversion = new Conversion();

            switch (opcion){
                case "1":
                    conversion.setMonedaOrigen("USD");
                    conversion.setMonedaDestino("ARS");
                    conversion.setValor();
                    conversion.convertir();
                    System.out.println(conversion);
                    System.out.println("\nPresione Enter para continuar: ");
                    scanner.nextLine();
                    break;
                case "2":
                    conversion.setMonedaOrigen("ARS");
                    conversion.setMonedaDestino("USD");
                    conversion.setValor();
                    conversion.convertir();
                    System.out.println(conversion);
                    System.out.println("\nPresione Enter para continuar: ");
                    scanner.nextLine();
                    break;
                case "3":
                    conversion.setMonedaOrigen("USD");
                    conversion.setMonedaDestino("BRL");
                    conversion.setValor();
                    conversion.convertir();
                    System.out.println(conversion);
                    System.out.println("\nPresione Enter para continuar: ");
                    scanner.nextLine();
                    break;
                case "4":
                    conversion.setMonedaOrigen("BRL");
                    conversion.setMonedaDestino("USD");
                    conversion.setValor();
                    conversion.convertir();
                    System.out.println(conversion);
                    System.out.println("\nPresione Enter para continuar: ");
                    scanner.nextLine();
                    break;
                case "5":
                    conversion.setMonedaOrigen("USD");
                    conversion.setMonedaDestino("COP");
                    conversion.setValor();
                    conversion.convertir();
                    System.out.println(conversion);
                    System.out.println("\nPresione Enter para continuar: ");
                    scanner.nextLine();
                    break;
                case "6":
                    conversion.setMonedaOrigen("COP");
                    conversion.setMonedaDestino("USD");
                    conversion.setValor();
                    conversion.convertir();
                    System.out.println(conversion);
                    System.out.println("\nPresione Enter para continuar: ");
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