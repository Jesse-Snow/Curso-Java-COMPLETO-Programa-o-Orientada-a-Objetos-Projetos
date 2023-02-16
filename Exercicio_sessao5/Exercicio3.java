// Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
// Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
// ordem crescente ou decrescente.

import java.util.Scanner;

public class Exercicio3{
    public static void main(String[] args){
  		int A = 6;
        int B = 5;
        if(A%B == 0 || B%A == 0 ){
           System.out.println("São Mútiplos"); 
        }else {
           System.out.println("Não são Mútiplos"); 
        }
    }
}