package Exercicio_sessao8.Parte_1.Entities;

public class CurrencyConverter {
    public static final int IOF = 6; 

    public static Double result(Double dolarToBuyWithReais, Double dolarPrice){
        Double total = dolarToBuyWithReais * dolarPrice;
        Double tax = (total / 100) * IOF;
        return total + tax;
    }
}
