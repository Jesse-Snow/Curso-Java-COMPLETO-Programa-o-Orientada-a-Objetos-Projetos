package Exercicio_sessao6_while;

// Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
// incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
// impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.
import java.util.Scanner;

public class Exercicio1{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Cadastre uma Senha:");
        int senhaCadastro = scn.nextInt();
        scn.nextLine();
        System.out.println("Digite a senha:");
        int senha = scn.nextInt();;
        scn.nextLine();
        
        while( senha != senhaCadastro){
            System.out.println("Senha invalida...:");
            senha = scn.nextInt();
            scn.nextLine();
        }
        System.out.println("Senha correta!:");
    }
}