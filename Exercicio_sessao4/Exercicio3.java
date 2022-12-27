/* 
    Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir,
    calcule e mostre a diferença do produto de A e B pelo produto de C e D segundo
    a fórmula: DIFERENCA = (A * B - C * D).
*/

import java.util.Scanner; 

public class Exercicio3{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int A = scn.nextInt();
        scn.nextLine();
        int B = scn.nextInt();
        scn.nextLine();
        int C = scn.nextInt();
        scn.nextLine();
        int D = scn.nextInt();
        scn.nextLine();
        
        int diferenca = ( A * B - C * D);
        System.out.println(diferenca);  
    }
}