// Ler um número inteiro N e calcular todos os seus divisores
package Exercicio_sessao6_for;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();  

        for( int i = 1; i <= n; i++){
            if( n % i == 0){
                System.out.println( n / i);
            } 
        }
    }
}
