package com.lna.exchange;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ExchangeRateApi {
    private final String API_KEY = "38d7ffbb1c2b817fb59758b3";
    private final String url = "https://v6.exchangerate-api.com/v6/";

    public PairDto pair(String origen, String destino) {
        String direccion = url + API_KEY + "/pair/" + origen + "/" + destino;
        Gson gson = new GsonBuilder()
            .create();

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(direccion))
                .build();

            HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();
            PairDto pair = gson.fromJson(json, PairDto.class);

            return pair;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
