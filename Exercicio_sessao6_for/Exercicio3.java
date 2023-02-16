// Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
// de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
// conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
// peso 5

package Exercicio_sessao6_for;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Digite a quantidade de casos de teste:");
        int n = scn.nextInt();

        for(int i = 0; i < n; i++){
            double v1 = scn.nextDouble();
            scn.nextLine();
            double v2 = scn.nextDouble();
            scn.nextLine();
            double v3 = scn.nextDouble();
            scn.nextLine();
            double media = (v1 * 2 + v2 * 3 + v3 * 5) / (2 + 3 + 5);
            System.out.printf("Média:%.1f%n",media);
        }
        
    }
}
