// Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média
// aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for
// digitado, mostrar a mensagem "NENHUM NUMERO PAR"
package Exercicio_sessao10;

import java.util.Scanner;

public class Exercicio8{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Quantos números você vai digitar para o vetor?");
        int n = scn.nextInt();
        Double[] vetor = new Double[n];
        Double resultado = 0.0;
        int pares = 0;

        
        for(int i = 0; i < vetor.length; i++){
            System.out.print("Digite os valores do vetor: ");
            vetor[i] = scn.nextDouble();
        }
        
        for(int i = 0; i < vetor.length; i++){
            if(vetor[i] % 2 == 0 ){
                resultado +=  vetor[i];
                pares++;
            }
        }
        Double mediaTotal = resultado / pares;
        if(resultado > 0 ){
            System.out.println("MÉDIA DOS PARES:" + String.format("%.1f",mediaTotal));
        }
        else { 
            System.out.println("NENHUM NÚMERO PAR");
        }
    }
}
