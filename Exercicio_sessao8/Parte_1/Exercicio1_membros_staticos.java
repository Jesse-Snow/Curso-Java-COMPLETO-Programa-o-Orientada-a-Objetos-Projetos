// Faça um programa para ler a cotação do dólar, e depois um valor em dólares a ser comprado por
// uma pessoa em reais. Informar quantos reais a pessoa vai pagar pelos dólares, considerando ainda
// que a pessoa terá que pagar 6% de IOF sobre o valor em dólar. Criar uma classe CurrencyConverter
// para ser responsável pelos cálculos.
package Exercicio_sessao8.Parte_1;

import java.util.Scanner;

import Exercicio_sessao8.Parte_1.Entities.CurrencyConverter;

public class Exercicio1_membros_staticos {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("What is the dollar price?");
        Double dollarPrice = scn.nextDouble();
        System.out.println("How many dollars will be bought");
        Double dollarToBuyWithReais = scn.nextDouble();
        System.out.println("Amound to be paid in reais = " + String.format("%.2f",CurrencyConverter.result(dollarToBuyWithReais,dollarPrice)));

    }                                                   
}
