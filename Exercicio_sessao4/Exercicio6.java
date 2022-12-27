// Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C.
// Em seguida, calcule e mostre:
// a) a área do triângulo retângulo que tem A por base e C por altura.
// b) a área do círculo de raio C. (pi = 3.14159)
// c) a área do trapézio que tem A e B por bases e C por altura.
// d) a área do quadrado que tem lado B.
// e) a área do retângulo que tem lados A e B.

import java.util.Scanner;

public class Exercicio6{
    public static void main(String[] args){
        double A = scn.nextDouble();
        scn.nextLine();
        double B = scn.nextDouble();
        scn.nextLine();
        double C = scn.nextDouble();
        scn.nextLine();
        
        double baseTriangulo = A * C / 2;
        System.out.println("Base do Triângulo:" + baseTriangulo);
        double areaCirculo = 3.14159 * C;
        System.out.println("Área do Círculo:" + areaCirculo);
        double areaQuadrado = B * B;
        System.out.println("Área do Quadrado:" + areaQuadrado);
        double areaRetangulo = A * B;
        System.out.println("Área do Retangulo:" + areaRetangulo);
    }
}