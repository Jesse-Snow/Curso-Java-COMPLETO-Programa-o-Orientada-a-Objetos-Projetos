// Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um
// terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima
// o vetor C gerado

package Exercicio_sessao10;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Quantos números você vai digitar para o vetor A e B?");
        int n = scn.nextInt();
        int[] vetorA = new int[n];
        int[] vetorB = new int[n];
        int[] vetorC = new int[n];

        System.out.print("Digite os valaor do vetor A: ");
        for(int i = 0; i < vetorA.length; i++){
            vetorA[i] = scn.nextInt();
        }
        System.out.print("Digite os valaor do vetor B: ");
        for(int i = 0; i < vetorB.length; i++){
            vetorB[i] = scn.nextInt();
        }

        System.out.println("VETOR RESULTANTE:");
        for(int i = 0; i < vetorC.length; i++){
            vetorC[i] = vetorA[i] + vetorB[i];
            System.out.println(vetorC[i]);
        }
    }
}
