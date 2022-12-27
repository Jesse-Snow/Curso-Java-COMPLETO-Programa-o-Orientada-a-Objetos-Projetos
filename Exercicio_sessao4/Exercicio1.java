// Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
// mensagem explicativa, conforme exemplos.

import java.util.Scanner; 


public class Exercicio1{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in); 
        int x = scn.nextInt();
        scn.nextLine();
        int y = scn.nextInt();
        scn.nextLine();
        scn.close();

        System.out.printf("ValorX:%d %n ValorY:%d",x,y);
    }
}