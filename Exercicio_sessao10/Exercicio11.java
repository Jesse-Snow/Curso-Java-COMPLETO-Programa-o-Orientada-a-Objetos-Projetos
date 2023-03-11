// Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
// tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
// bem como os nomes dessas pessoas caso houver.

package Exercicio_sessao10;

import java.util.Scanner;

import Exercicio_sessao10.Entidades.Pessoas;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Quantas pessoas serão digitadas?");
        int n = scn.nextInt();
        Pessoas[] novasPessoas = new Pessoas[n];

        // Registrando Pessoas por Input
        for (int i = 0; i < novasPessoas.length; i++) {
            int numeroPessoa = i + 1;
            System.out.println("Altura da " + numeroPessoa + "a Pessoa:");
            novasPessoas[i] = new Pessoas();
            novasPessoas[i].setAltura(scn.nextDouble());
            System.out.println("Genero da " + numeroPessoa + "a Pessoa:");
            novasPessoas[i].setSexo(scn.next());
        }
        // Menor altura
        double menorAltura = novasPessoas[0].getAltura();
        for (int i = 0; i < novasPessoas.length; i++) {
            if (novasPessoas[i].getAltura() < menorAltura) {
                menorAltura = novasPessoas[i].getAltura();
            }
        }
        System.out.println("Maior altura:" + menorAltura);

        // Maior altura
        double maiorAltura = 0.0;
        for (int i = 0; i < novasPessoas.length; i++) {
            if (novasPessoas[i].getAltura() > maiorAltura) {
                maiorAltura = novasPessoas[i].getAltura();
            }
        }
        System.out.println("Maior altura:" + maiorAltura);

        // Media altura mulheres e totalHomens
        int totalMulheres = 0;
        int totalHomens = 0;
        double totalALturaMulheres = 0;
        for (int i = 0; i < novasPessoas.length; i++) {
            if (novasPessoas[i].getSexo().equals("F")) {
                totalMulheres += 1;
                totalALturaMulheres += novasPessoas[i].getAltura();
            } else if (novasPessoas[i].getSexo().equals("M")) {
                totalHomens += 1;
            }
        }
        double mediaAltura = totalALturaMulheres / totalMulheres;
        System.out.println("Média das Alturas das Mulheres = " + String.format("%.2f", mediaAltura));

        // Total de homens:
        System.out.println("Numero de homens = " + totalHomens);

    }
}
