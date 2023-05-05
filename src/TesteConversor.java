package src;

public class TesteConversor {
    public static void main(String[] args) {
        //ConversorMoeda conversor = new ConversorMoeda();

       // double valorConvertido = conversor.converter("Euro", "Dolar", 125.5);
        //System.out.println(valorConvertido);

        ConversorTemperatura conversorTemp = new ConversorTemperatura();

        double temperaturaConvertida = conversorTemp.converter("Celsius", "Kelvin", 89);
        System.out.println(temperaturaConvertida);
    }
}
