// Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
// e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos

package Exercicio_sessao10;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Quantos números você vai digitar? ( Menor que 10 )");
        int n = scn.nextInt();
        int[] myArray = new int[n];

        // Input numbers
        if ( n < 10 ){
            for(int i = 0; i < myArray.length; i++){
                myArray[i] = scn.nextInt();
            }
        }else { 
            System.out.println("Digite um número menor.");
        }
        System.out.println("");
        // Output numbers
        for(int i = 0; i < myArray.length; i++){
            if(myArray[i] < 0){
                System.out.println(myArray[i]);
            }
        }
    }
}
