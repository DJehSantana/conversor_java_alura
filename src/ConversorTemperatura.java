package src;

import java.util.Locale;

public class ConversorTemperatura {
    private double valorTemperaturaOriginal, valorTemperaturaConvertida;
    private String temperaturaOrigem, temperaturaDestino;
    public ConversorTemperatura() {

    }
    public ConversaoTemperaturas realizarConversao (String temperatura, double valor) {
        this.valorTemperaturaOriginal = valor;
        ConversaoTemperaturas conversao = new ConversaoTemperaturas(temperatura, valorTemperaturaOriginal);
        return conversao;
    }
    public double converter (String origem, String destino, double valor) {
        temperaturaOrigem = origem.toLowerCase(Locale.ROOT);
        temperaturaDestino = destino.toLowerCase(Locale.ROOT);

        ConversaoTemperaturas conversor = this.realizarConversao(temperaturaOrigem, valor);
        System.out.println(conversor);

        switch (temperaturaDestino) {
            case "celsius": valorTemperaturaConvertida = conversor.getValorCelsius();
            break;
            case "fahrenheit": valorTemperaturaConvertida = conversor.getValorFahrenheit();
            break;
            case "kelvin": valorTemperaturaConvertida = conversor.getValorKelvin();
        }
        System.out.println("Temperatura origem " + temperaturaOrigem + " " + temperaturaDestino + " " +  valor);

        return valorTemperaturaConvertida;
    }

}
