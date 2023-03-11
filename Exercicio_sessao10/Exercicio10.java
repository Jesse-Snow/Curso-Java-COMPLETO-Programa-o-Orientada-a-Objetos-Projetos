// Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram
// no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir
// os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou
// igual a 6.0 (seis).

package Exercicio_sessao10;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Quantas pessoas serão digitadas?");
        int n = scn.nextInt();
        String[] alunos = new String[n]; 
        double[] notaUm = new double[n];
        double[] notaDois = new double[n];
        int numeroAluno = 0;

        // Registrando Alunos e NOtas por Input
        for(int i = 0; i < alunos.length; i++){
            System.out.println("Digite nome, primeira e segunda nota do " + (numeroAluno+1) + "o aluno:");
            alunos[i] = scn.next();
            notaUm[i] = scn.nextDouble();
            notaDois[i] = scn.nextDouble();
        }

        System.out.println("Alunos aprovados:");
        for(int i = 0; i < alunos.length;i++){
            if((notaUm[i] + notaDois[i]) / 2 >= 6){
                System.out.println(alunos[i]);
            }
        }
    }
}
