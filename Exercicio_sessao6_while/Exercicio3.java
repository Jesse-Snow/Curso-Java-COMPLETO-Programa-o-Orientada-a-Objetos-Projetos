// Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
// um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
// 4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
// que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
// mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme

package Exercicio_sessao6_while;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        int produto = 0;
        int gasolina = 0;
        int alcool = 0;
        int diesel = 0;

        while( produto != 4){
            System.out.println("Digite o produto:");
            produto = scn.nextInt();
            if(produto == 1){
                alcool++;
            }
            else if(produto == 2){
                gasolina++;
            }
            else if(produto == 3){
                diesel++;
            }
        }
        System.out.println("Muito obrigado!!");
        System.out.println("Alcool:" + alcool);
        System.out.println("Gasolina:" + gasolina);
        System.out.println("Diesel:" + diesel);
    }
}
