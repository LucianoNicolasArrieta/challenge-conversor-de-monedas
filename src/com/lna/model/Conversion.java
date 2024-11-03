package com.lna.model;

import com.lna.exchange.ExchangeRateApi;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Conversion {
    private String monedaOrigen;
    private String monedaDestino;
    private Double valor;
    private Double valorConvertido;
    private Double tasa_conversion;
    private LocalDateTime horaConversion;

    public Conversion(String monedaOrigen, String monedaDestino) {
        this.monedaOrigen = monedaOrigen;
        this.monedaDestino = monedaDestino;
        ExchangeRateApi api = new ExchangeRateApi();
        this.tasa_conversion = api.getTasa(monedaOrigen, monedaDestino);
        this.horaConversion = LocalDateTime.now();
    }

    public String getMonedaOrigen() {
        return monedaOrigen;
    }

    public String getMonedaDestino() {
        return monedaDestino;
    }

    public double getValor() {
        return valor;
    }

    public double getValorConvertido() {
        return valorConvertido;
    }

    public LocalDateTime getHoraConversion() {
        return horaConversion;
    }

    public void setValor() {
        System.out.println("Ingrese la cantidad a convertir: ");
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextDouble()) {
            System.out.println("Ingrese una cantidad válida: ");
            scanner = new Scanner(System.in);
        }
        this.valor = scanner.nextDouble();
        this.valorConvertido = valor * tasa_conversion;
    }

    @Override
    public String toString() {
        return valor + " " + monedaOrigen + " equivalen a: " + valorConvertido + " " + monedaDestino;
    }
}
