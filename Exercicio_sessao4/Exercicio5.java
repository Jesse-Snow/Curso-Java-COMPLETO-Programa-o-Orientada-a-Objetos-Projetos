// Fazer um programa para ler o código de uma peça 1,
// o número de peças 1, o valor unitário de cada peça 1,
// o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2.
// Calcule e mostre o valor a ser pago.

import java.util.Scanner;

public class Exercicio5{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        System.out.println("Digita a quantidade desejada para Peça 1:");
        int qtPeca1 = scn.nextInt();
        scn.nextLine();

        System.out.println("Digite o valor da Peça 1:");
        double vlPeca1 = scn.nextDouble();
        scn.nextLine();

        System.out.println("Digita a quantidade desejada para Peça 2:");
        int qtPeca2 = scn.nextInt();
        scn.nextLine();

        System.out.println("Digite o valor da Peça 2:");
        double vlPeca2 = scn.nextDouble();
        scn.nextLine();

        double totalPagamento = ( vlPeca1 * qtPeca1 + vlPeca2 * qtPeca2);

        System.out.println("Total a pagar:" + String.format("%.2f",totalPagamento));
    }
}