// d

package Exercicio_sessao10;

import java.util.Scanner;

import Exercicio_sessao10.Entidades.Pessoas;

public class Exercicio9 {
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
        }



        // Pessoa mais velha
        int maiorIdade = 0;
        String pessoaMaiorIdade = "";
        for(int i = 0; i < qntPessoas; i++){
            if(novasPessoas[i].getIdade() > maiorIdade){
                totalMenores++;
                maiorIdade = novasPessoas[i].getIdade();
                pessoaMaiorIdade = novasPessoas[i].getNome();  
            }
        }

        System.out.println("PESSOA MAIS VELHA:" + pessoaMaiorIdade);        
    }
}
