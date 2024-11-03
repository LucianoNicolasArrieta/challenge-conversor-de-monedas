package com.lna.model;

import com.lna.exchange.ExchangeRateApi;
import com.lna.exchange.TasaDto;
import java.util.Scanner;

public class Conversion {
    private String monedaOrigen;
    private String monedaDestino;
    private double valor;
    private double valorConvertido;
    private double tasa_conversion;

    public Conversion(String monedaOrigen, String monedaDestino) {
        this.monedaOrigen = monedaOrigen;
        this.monedaDestino = monedaDestino;
        ExchangeRateApi api = new ExchangeRateApi();
        this.tasa_conversion = api.getTasa(monedaOrigen, monedaDestino);
    }

    public void setValor() {
        System.out.println("Ingrese la cantidad a convertir: ");
        Scanner scanner = new Scanner(System.in);
        this.valor = scanner.nextDouble();
        this.valorConvertido = valor * tasa_conversion;
    }

    @Override
    public String toString() {
        return valor + " " + monedaOrigen + " equivalen a: " + valorConvertido + " " + monedaDestino;
    }
}
