import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Conversao {
    public Moedas converterMoeda(String base_code, String target_code, String valor) {
        URI endereco = URI.create("https://v6.exchangerate-api.com/v6/6413837e1ca6a38bdf35882a/pair/" + base_code + "/" + target_code + "/" + valor);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(String.valueOf(endereco)))
                .build();

        HttpResponse<String> response = null;
        try {
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String json = response.body();


            Moedas moedas = new Gson().fromJson(json, Moedas.class);
            return new Moedas(moedas.base_code(), moedas.target_code(), moedas.conversion_rate(), moedas.conversion_result(), valor);

        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
