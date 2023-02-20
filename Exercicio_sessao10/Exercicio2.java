// Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
// - Imprimir todos os elementos do vetor
// - Mostrar na tela a soma e a média dos elementos do vetor

package Exercicio_sessao10;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Quantos números você vai digitar?");
        int n = scn.nextInt();
        Double[] myArray = new Double[n];
        Double total = 0.0;

        // Input numbers
        for(int i = 0; i < myArray.length; i++){
                myArray[i] = scn.nextDouble();
        }
        System.out.println("");

        // Sum and output numbers
        System.out.print("Valores: ");
        for(int i = 0; i < myArray.length; i++){
            total += myArray[i];
            System.out.print(myArray[i] + " ");
        }
        System.out.println("");
        System.out.println("SOMA = " + total);
        System.out.println("MEDIA = " + total / myArray.length);
    }
}
