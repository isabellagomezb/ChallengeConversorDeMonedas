import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultarMonedas {

    public Moneda convertirMoneda(String monedaBase,
                                  String monedaConvertida,
                                  double cantidad) {
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/e363ed13a0656db1d7c4344a/latest/" + monedaBase);
        //monedaBase+"/"+monedaConvertida+"/"+cantidad);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Moneda.class);

        } catch (Exception e) {
            throw new RuntimeException("No se encontrós la Moneda solicitada");
        }
    }
}

