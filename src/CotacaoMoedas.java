package src;

import java.util.Locale;

class CotacaoMoedas {
    private String nome;
    private double cotacaoReal;
    private double cotacaoDolar;
    private double cotacaoEuro;

    //utilizados os valores da cotação de 23/03/2023
    public CotacaoMoedas(String nome) {
        this.nome = nome.toLowerCase(Locale.ROOT);

        switch (this.nome) {
            case "real":
                this.cotacaoDolar = 5.27;
                this.cotacaoEuro = 5.74;
                this.cotacaoReal = 1;
            break;
            case "dolar":
                this.cotacaoDolar = 1;
                this.cotacaoEuro = 0.92;
                this.cotacaoReal = 5.27;
            break;
            case "euro":
                this.cotacaoDolar = 1.09;
                this.cotacaoEuro = 1;
                this.cotacaoReal = 5.74;
            break;
        }
    }

    public String getNome() {
        return nome;
    }

    public double getCotacaoReal() {
        return cotacaoReal;
    }

    public double getCotacaoDolar() {
        return cotacaoDolar;
    }

    public double getCotacaoEuro() {
        return cotacaoEuro;
    }
}
