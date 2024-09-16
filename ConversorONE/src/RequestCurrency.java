import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class RequestCurrency {
    private final String BASE_URI = "https://v6.exchangerate-api.com/v6/";
    private final String API_KEY = System.getenv("API_KEY");
    private final String API_URI = BASE_URI + API_KEY;
    private final String LATEST = API_URI + "/latest/";
    private final String PAIR = API_URI + "/pair/";


    public Currency getCurrency(String code){
        URI address = URI.create(LATEST + code);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(address)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Currency.class);
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public PairCurrencies getConversion(String base_code, String target_code, double amount) {
        URI address = URI.create(String.format("%s%s/%s/%f", PAIR,
                base_code.toLowerCase(),
                target_code.toLowerCase(),
                amount
        ));
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(address)
                .build();
        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), PairCurrencies.class);
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
