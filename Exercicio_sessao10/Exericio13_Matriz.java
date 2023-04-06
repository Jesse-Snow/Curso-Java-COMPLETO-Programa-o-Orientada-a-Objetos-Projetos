// Fazer um programa para ler dois números M e N, e depois ler M linhas e N colunas
// contendo números inteiros podendo haver repetições. 
// Em seguida ler um número inteiro X que pertence à matriz. Para cada ocorrência de X,
// mostrar os valores acima, a esquerda, a direita e em baixo, quando houver.

package Exercicio_sessao10;

import java.util.Scanner;

public class Exericio13_Matriz {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Value of M (Row)");
        int m = scn.nextInt();
        System.out.println("Value of N (Column)");
        int n = scn.nextInt();
        int mat[][] = new int[m][n];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = scn.nextInt();
            }
        }
        System.out.println("Number to compare:");
        int numberToCompare = scn.nextInt();

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == numberToCompare) {
                    System.out.println("Position: " + i + ", " + j);
                    // Condicional para não ultrapassar tamanho da matriz
                    int left = j - 1;
                    int right = j + 1;
                    int up = i - 1;
                    int down = i + 1;
                    if ( up < mat.length && up >= 0) {
                        System.out.println("Up: " + mat[up][j]);
                    }
                    if (left < mat[i].length && left >= 0) {
                        System.out.println("Left:" + mat[i][left]);
                    }
                    if (right < mat[i].length && right >= 0) {
                        System.out.println("Right:" + mat[i][right]);
                    }
                    if (down < mat.length && down >= 0) {
                        System.out.println("Down: " + mat[down][j]);
                    }
                }
            }
        }
    }
}
