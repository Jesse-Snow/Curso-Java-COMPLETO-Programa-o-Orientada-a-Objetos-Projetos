// Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste 
// círculo com quatro casas decimais conforme exemplos.
// Fórmula da área: area = π . raio2
// Considere o valor de π = 3.14159

import java.util.Scanner; 

public class Exercicio2{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in); 
        final double pi = 3.13159;
        double raio = scn.nextDouble(); ;
        scn.nextLine();
        double area = pi * raio;    
        System.out.println("Area:" + String.format("%.4f",area));   
    }
}