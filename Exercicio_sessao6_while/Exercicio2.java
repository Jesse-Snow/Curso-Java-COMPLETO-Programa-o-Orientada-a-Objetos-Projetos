package Exercicio_sessao6_while;

// Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
// cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
// menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).
import java.util.Scanner;

public class Exercicio2{
    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);
        double x = scn.nextDouble();
        double y = scn.nextDouble(); 

        while( x != 0 && y != 0){
            
            if (x > 0 && y > 0){
                System.out.println("Q1");
            }else if( x > 0 && y < 0){
                System.out.println("Q4");
            }else if(x < 0 && y > 0){
                System.out.println("Q2");
            }else if(x < 0 && y < 0){
                System.out.println("Q3");
            }
            x = scn.nextDouble();
  		    y = scn.nextDouble(); 
        }
   }
}