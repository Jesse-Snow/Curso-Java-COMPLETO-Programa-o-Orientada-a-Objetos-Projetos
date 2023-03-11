// Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida,
// mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos
// os elementos do vetor que estejam abaixo da média, com uma casa decimal cada.
package Exercicio_sessao10;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Quantos números você vai digitar para o vetor?");
        int n = scn.nextInt();
        Double[] vetor = new Double[n];
        Double resultado = 0.0;

        
        for(int i = 0; i < vetor.length; i++){
            System.out.print("Digite os valores do vetor: ");
            vetor[i] = scn.nextDouble();
        }
        
        for(int i = 0; i < vetor.length; i++){
            resultado +=  vetor[i];
        }
        Double mediaTotal = resultado / n;
        System.out.println("MÉDIA DO VETOR:" + (mediaTotal));
        System.out.println("ELEMENTOS ABAIXO DA MÉDIA:");
        for(int i = 0; i < vetor.length;i++){
            if(vetor[i] < mediaTotal){
                System.out.println(vetor[i]); 
            }
        }
    }
}
