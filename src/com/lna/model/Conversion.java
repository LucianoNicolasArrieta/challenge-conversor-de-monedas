package com.lna.model;

import com.lna.exchange.ExchangeRateApi;
import com.lna.exchange.PairDto;
import java.util.Scanner;

public class Conversion {
    private String monedaOrigen;
    private String monedaDestino;
    private double valor;
    private double valorConvertido;

    public String getMonedaOrigen() {
        return monedaOrigen;
    }

    public void setMonedaOrigen(String monedaOrigen) {
        this.monedaOrigen = monedaOrigen;
    }

    public String getMonedaDestino() {
        return monedaDestino;
    }

    public void setMonedaDestino(String monedaDestino) {
        this.monedaDestino = monedaDestino;
    }

    public double getValor() {
        return valor;
    }

    public void setValor() {
        System.out.println("Ingrese la cantidad a convertir: ");
        Scanner scanner = new Scanner(System.in);
        this.valor = scanner.nextDouble();

    }

    public double getValorConvertido() {
        return valorConvertido;
    }

    public void setValorConvertido(double valorConvertido) {
        this.valorConvertido = valorConvertido;
    }

    public void convertir() {
        ExchangeRateApi api = new ExchangeRateApi();
        PairDto pair = api.pair(this.monedaOrigen, this.monedaDestino);

        this.valorConvertido = pair.conversion_rate() * this.valor;
    }

    @Override
    public String toString() {
        return valor + " " + monedaOrigen + " equivalen a: " + valorConvertido + " " + monedaDestino;
    }
}
