package com.lna.model;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Historial {
    ArrayList<Conversion> conversiones = new ArrayList<>();

    public void agregarConversion(Conversion conversion) {
        conversiones.add(conversion);
    }

    @Override
    public String toString() {
        if (conversiones.isEmpty()) {
            return "El historial está vacío. Todavía no se han realizado conversiones.";
        } else {
            String string = "";
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy kk:mm");
            for (Conversion conversion:conversiones) {
                System.out.println(string + "\n" +
                    conversion.getHoraConversion().format(formatter) + "  -  " +
                    conversion.getValor() + conversion.getMonedaOrigen() +
                    " --> " +
                    conversion.getValorConvertido() + conversion.getMonedaDestino());
            }
            return string;
        }
    }
}
