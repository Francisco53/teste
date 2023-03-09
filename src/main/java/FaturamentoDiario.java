import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FaturamentoDiario {

    public static void main(String[] args) throws IOException, JSONException {

        String jsonString = new String(Files.readAllBytes(Paths.get("faturamento.json")));
        JSONObject json = new JSONObject(jsonString);
        JSONArray faturamentoDiario = json.getJSONArray("faturamentoDiario");

        // Calculando o menor e o maior faturamento diário
        double menorFaturamento = Double.MAX_VALUE;
        double maiorFaturamento = Double.MIN_VALUE;
        for (int i = 0; i < faturamentoDiario.length(); i++) {
            double faturamento = faturamentoDiario.getDouble(i);
            if (faturamento < menorFaturamento) {
                menorFaturamento = faturamento;
            }
            if (faturamento > maiorFaturamento) {
                maiorFaturamento = faturamento;
            }
        }
        System.out.println("Menor faturamento diário: " + menorFaturamento);
        System.out.println("Maior faturamento diário: " + maiorFaturamento);

        // Calculando a média mensal de faturamento diário, ignorando dias sem faturamento
        double somaFaturamento = 0;
        int numDiasFaturamento = 0;
        for (int i = 0; i < faturamentoDiario.length(); i++) {
            double faturamento = faturamentoDiario.getDouble(i);
            if (faturamento > 0) {
                somaFaturamento += faturamento;
                numDiasFaturamento++;
            }
        }
        double mediaMensal = somaFaturamento / numDiasFaturamento;

        // Calculando o número de dias em que o faturamento diário foi superior à média mensal
        int numDiasAcimaMedia = 0;
        for (int i = 0; i < faturamentoDiario.length(); i++) {
            double faturamento = faturamentoDiario.getDouble(i);
            if (faturamento > mediaMensal) {
                numDiasAcimaMedia++;
            }
        }
        System.out.println("Número de dias com faturamento acima da média mensal: " + numDiasAcimaMedia);


    }
}
