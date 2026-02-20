import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class ConversorMoedas {
    public static void main(String[] args) {
        // Criando cliente HTTP//
        HttpClient client = HttpClient.newHttpClient();

        // Criando a requisição
        HttpRequest requisicao = HttpRequest.newBuilder()
                .uri(URI.create("https://v6.exchangerate-api.com/v6/5c2f1d4ca78dcc982ab77093/latest/BRL"))
                .GET()
                .build();

        try { // Enviando requisição e recebendo resposta
            HttpResponse<String> resposta =
                    client.send(requisicao, HttpResponse.BodyHandlers.ofString());
            // Conversão para JSON
            JsonElement elemento = JsonParser.parseString(resposta.body());
            JsonObject objectRoot = elemento.getAsJsonObject();
            //Pegando o objeto conversion_rates
            JsonObject taxas = objectRoot.getAsJsonObject("conversion_rates");

            //Pegando moedas específicas (Filtro)
            double usd = taxas.get("USD").getAsDouble();
            double ars = taxas.get("ARS").getAsDouble();
            double bob = taxas.get("BOB").getAsDouble();
            double clp = taxas.get("CLP").getAsDouble();
            double cop = taxas.get("COP").getAsDouble();
            double brl = taxas.get("BRL").getAsDouble();
            double eur = taxas.get("EUR").getAsDouble();

            System.out.println("USD: " + usd);
            System.out.println("ARS: " + ars);
            System.out.println("BOB: " + bob);
            System.out.println("CLP: " + clp);
            System.out.println("COP: " + cop);
            System.out.println("BRL: " + brl);
            System.out.println("EUR: " + eur);

            //Adicionando menu simples
            Scanner leitura = new Scanner(System.in);
            System.out.println("=== CONVERSOR DE MOEDAS ===");
            System.out.println("1 - BRL para USD");
            System.out.println("2 - BRL para ARS");
            System.out.println("3 - BRL para BOB");
            System.out.println("4 - BRL para CLP");
            System.out.println("5 - BRL para COP");
            System.out.println("6 - BRL para EUR");
            System.out.println("Escolha uma opção: ");

            int opcao = leitura.nextInt();

            System.out.println("Digite o valor em BRL: ");
            double valor = leitura.nextDouble();

            double resultado = 0;

            switch (opcao) {
                case 1:
                    resultado = valor * usd;
                    System.out.printf("Convertido para USD: %.2f%n",resultado);
                    break;
                case 2:
                    resultado = valor * ars;
                    System.out.printf("Convertido para ARS: %.2f%n", resultado);
                    break;
                case 3:
                    resultado = valor * bob;
                    System.out.printf("Convertido para BOB: %.2f%n", resultado);
                    break;
                case 4:
                    resultado = valor * clp;
                    System.out.printf("Convertido para CLP: %.2f%n", resultado);
                    break;
                case 5:
                    resultado = valor * cop;
                    System.out.printf("Convertido para COP: %.2f%n",resultado);
                    break;
                case 6:
                    resultado = valor * eur;
                    System.out.printf("Convertido para EUR: %.2f%n", resultado);
                    break;
                default:
                    System.out.printf("Opção inválida.");
            }


        } catch (Exception e) {
            System.out.println("Erro na requisição.");
            e.printStackTrace();

        }
    }
}
