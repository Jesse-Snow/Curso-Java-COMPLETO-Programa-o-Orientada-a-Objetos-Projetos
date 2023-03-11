// Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
// o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
// considerando a primeira posição como 0 (zero).

package Exercicio_sessao10;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Quantos números você vai digitar? ( Menor que 10 )");
        int n = scn.nextInt();
        int[] numeros = new int[n];
        double maiorNumero = 0;
        int indiceMaiorNumero = 0;

        for(int i = 0; i < numeros.length; i++){
            System.out.print("Digite um número: ");
            numeros[i] = scn.nextInt();
        }

        for(int i = 0; i < numeros.length; i++){
            if(numeros[i] > maiorNumero){
                maiorNumero = numeros[i];
                indiceMaiorNumero = i;
            }
        }
        System.out.println("MAIOR VALOR = " + maiorNumero);
        System.out.println("POSICAO DO MAIOR VALOR = " + indiceMaiorNumero);
    }
}
