package com.lna.util;

public class Menu {
    static public void printMenu(){
        System.out.println("""
            \n*************************************************************
            Bienvenido al conversor de moneda!
            
            1. Dólar --> Peso argentino
            2. Peso argentino --> Dólar
            3. Dólar --> Real brasileño
            4. Real brasileño --> Dólar
            5. Dólar --> Peso colombiano
            6. Peso colombiano --> Dólar
            7. Dólar --> Euro
            8. Euro --> Dólar
            9. Ver historial de conversiones
            0. Salir
            
            Elija una opción válida: 
            *************************************************************
            """);
    }
}
