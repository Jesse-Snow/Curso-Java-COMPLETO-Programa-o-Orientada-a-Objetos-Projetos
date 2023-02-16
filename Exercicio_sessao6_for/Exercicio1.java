// Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
// X, se for o caso.

package Exercicio_sessao6_for;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int qntX = scn.nextInt();
        int numImpar = 0;

        if(qntX >= 1 && qntX <= 1000){
            for(int index = 0; index <= qntX; index++){
                if( index % 2 != 0){
                    System.out.println(index);
                }
            }
        }
    }
}
