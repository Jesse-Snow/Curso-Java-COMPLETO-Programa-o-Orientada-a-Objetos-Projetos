// Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
// tela todos os números pares, e também a quantidade de números pares.

package Exercicio_sessao10;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Quantos números você vai digitar? ( Menor que 10 )");
        int n = scn.nextInt();
        int[] numeros = new int[n];
        int totalPares = 0;

        for(int i = 0; i < numeros.length; i++){
            System.out.print("Digite um número: ");
            numeros[i] = scn.nextInt();
        }

        System.out.println("NUMEROS PARES:");
        for(int i = 0; i < numeros.length; i++){
            if(numeros[i]%2 == 0){
                System.out.print(numeros[i] + " ");
                totalPares++;
            }
        }
        System.out.println("");
        System.out.println("QUANTIDADE DE PARES = " + totalPares);
    }
}
