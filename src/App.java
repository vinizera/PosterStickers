import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.*;

public class App {

    public static void main(String[] args) throws Exception {

        // fazer uma conexão HTTP e buscar os top 250 filmes

        // estabelecer a url utilizando o  link contendo os dados da API em JSON
        String url = "https://api.mocki.io/v2/549a5d8b";

        // gerar uma URI para associar URL
        URI address = URI.create(url);

        // criação de client
        HttpClient client = HttpClient.newHttpClient();

        // criação de request
        HttpRequest request = HttpRequest.newBuilder(address).GET().build();

        // criação de response para receber o body do request em string
        HttpResponse<String> response = client.send(request, BodyHandlers.ofString());

        // guardar o body numa string
        String body = response.body();

        System.out.println(body);

        // extrair só os dados que interessam (título, poster, nota)


        // exibir e manipular os dados

    }

}
