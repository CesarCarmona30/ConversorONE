import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class RequestCurrency {
    private final String BASE_URI = "https://v6.exchangerate-api.com/v6/";
    private final String API_KEY = System.getenv("API_KEY");
    private final String URI_API = BASE_URI + API_KEY + "/latest/";

    public Currency getCurrency(String code){
        URI address = URI.create(URI_API + code);
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
}
