package src;

import java.util.Locale;

public class ConversaoTemperaturas {
    private String temperatura;

    private double valorFahrenheit;
    private double valorCelsius;
    private double valorKelvin;

    public ConversaoTemperaturas(String temp, double valor) {
        this.temperatura = temp.toLowerCase(Locale.ROOT);

        switch (this.temperatura) {
            case "celsius":
                this.valorFahrenheit = valor * 1.8 + 32;
                this.valorCelsius = valor;
                this.valorKelvin = valor + 273.15;
            break;
            case "fahrenheit":
                this.valorKelvin = (valor - 32) / 1.8 + 273.15;
                this.valorCelsius = (valor -32) / 1.8;
                this.valorFahrenheit = valor;
            break;
            case "kelvin":
                this.valorFahrenheit = 1.8 * (valor - 273.15) + 32;
                this.valorCelsius = valor - 273.15;
                this.valorKelvin = valor;
            break;
        }

    }

    public String getTemperatura() {
        return temperatura;
    }

    public double getValorFahrenheit() {
        return valorFahrenheit;
    }

    public double getValorCelsius() {
        return valorCelsius;
    }

    public double getValorKelvin() {
        return valorKelvin;
    }
}
