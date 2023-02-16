// Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas,
// começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme
// exemplo.
package Exercicio_sessao6_for;

import java.util.Scanner;

public class Exercicio7 {   
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("");
        int n = scn.nextInt();

        if( n > 0){
            for( int i = 1; i <= n; i++ ){
               // System.out.println(i + " " + Math.pow(i, 2) + " " + Math.pow(i, 3));
               System.out.printf("%d %.0f %.0f \n", i,Math.pow(i, 2),Math.pow(i, 3));
            }
        }
    }
}
