// Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
// segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".

package Exercicio_sessao6_for;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Digite a quantidade de divisôes:");
        int n = scn.nextInt();
        scn.nextLine();

        for(int i = 0; i < n; i++){
            System.out.println("Digite os 2 números para realizar divisão:");
            double x = scn.nextDouble();
            double y = scn.nextDouble();
            if( y == 0 ){
                System.out.println("Divisão impossível");
            }else {
                System.out.println("Resultado:" + x / y);
            }
        }
    }    
}
