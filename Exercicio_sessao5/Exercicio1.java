// Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.

import java.util.Scanner;

public class Exercicio1{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int numero = scn.nextInt();
        if(numero > 0){
            System.out.println("POSITIVO");
        }else if(numero < 0 ){
            System.out.println("NEGATIVO");
        }else {
       	    System.out.println("IGUAL A ZERO");
        }
    }
}