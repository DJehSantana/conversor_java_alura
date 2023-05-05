package src;

import java.util.Objects;

public class ConversorMoeda {
    private double valorMoedaOriginal, valorMoedaConvertido;
    private CotacaoMoedas moedaOrigem, moedaDestino;
    public ConversorMoeda() {

    }
    public CotacaoMoedas realizarCotacao (String moedaOrigem) {
        CotacaoMoedas cotacao = new CotacaoMoedas(moedaOrigem);
        return cotacao;
    }
    public double converter (String origem, String destino, double valor) {
        this.moedaOrigem = realizarCotacao(origem);
        this.valorMoedaOriginal = valor;

        switch (origem) {
            case "Real": valorMoedaConvertido = destino.equals("Dolar") ? valorMoedaOriginal * this.moedaOrigem.getCotacaoDolar()
                    : destino.equals("Euro") ? valorMoedaOriginal * this.moedaOrigem.getCotacaoEuro()
                    : valorMoedaOriginal;
            break;
            case "Euro": valorMoedaConvertido = destino.equals("Real") ? valorMoedaOriginal * this.moedaOrigem.getCotacaoReal()
                    : destino.equals("Dolar") ? valorMoedaOriginal * this.moedaOrigem.getCotacaoDolar()
                    : valorMoedaOriginal;
            break;
            case "Dolar": valorMoedaConvertido = destino.equals("Real") ? valorMoedaOriginal * this.moedaOrigem.getCotacaoReal()
                    : destino.equals("Euro") ? valorMoedaOriginal * this.moedaOrigem.getCotacaoEuro()
                    : valorMoedaOriginal;
        }
        return valorMoedaConvertido;
    }
 }
