// Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
// tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
// bem como os nomes dessas pessoas caso houver.

package Exercicio_sessao10;

import java.util.Scanner;

import Exercicio_sessao10.Entidades.Pessoas;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Double totalAltura = 0.0;
        int totalMenores = 0;
        System.out.print("Quantas pessoas serão digitadas?");
        int n = scn.nextInt();
        Pessoas[] novasPessoas = new Pessoas[n]; 
        double qntPessoas = (double) novasPessoas.length;
        String[] pessoasMenores = new String[n];

        // Registrando Pessoas por Input
        for(int i = 0; i < novasPessoas.length; i++){
            int numeroPessoa = i + 1;
            System.out.println("Dados da " + numeroPessoa + "a Pessoa:");
            System.out.print("Primeiro Nome: ");
            novasPessoas[i] = new Pessoas(scn.next());
            System.out.print("Idade: ");
            novasPessoas[i].setIdade(scn.nextInt());
            System.out.print("Altura: ");
            novasPessoas[i].setAltura(scn.nextDouble());
        }



        // Total de Menores e Total de Altura
        double porcentagemMenores = 0.0;
        for(int i = 0; i < qntPessoas; i++){
            // Menores
            if(novasPessoas[i].getIdade() < 16){
                totalMenores++;
                pessoasMenores[i] = novasPessoas[i].getNome();  
            }
            // Altura
            totalAltura += novasPessoas[i].getAltura();
        }
        Double alturaMedia = totalAltura / qntPessoas;
        System.out.println("");
        System.out.println("Altura média: " + String.format("%.2f",alturaMedia));        
        System.out.println("Pessoas com menos de 16 anos: " + (totalMenores/qntPessoas) * 100 + "%");

        for( int i = 0; i < pessoasMenores.length; i++){
            if(pessoasMenores[i] != null){
                System.out.println(pessoasMenores[i]);
            }
        }
    }
}
