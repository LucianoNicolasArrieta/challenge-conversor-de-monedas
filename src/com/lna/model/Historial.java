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
            StringBuilder string = new StringBuilder("********************* HISTORIAL *********************\n");
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy kk:mm");
            for (Conversion conversion:conversiones) {
                string.append("\n")
                    .append(conversion.getHoraConversion().format(formatter)).append("  -  ")
                    .append(conversion.getValor()).append(conversion.getMonedaOrigen())
                    .append(" --> ")
                    .append(conversion.getValorConvertido()).append(conversion.getMonedaDestino());
            }
            return string.toString();
        }
    }
}
