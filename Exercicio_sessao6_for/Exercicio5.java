// Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
// Lembrando que, por definição, fatorial de 0 é 1
package Exercicio_sessao6_for;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
    
        int n = scn.nextInt();
        int resultado = 0;
        int fatorial = n;
        // Necessário fazer com que o n tenha o resultado da ultima formula realizada
        if(n != 0){
            for(int i = 1; i < n; i++)
            {
                fatorial *= ( n - i);
                resultado = fatorial;
            }
        }else {
            resultado = 1;
        }
        System.out.println("Fatorial de " + n + " = " + resultado);
    }
}
