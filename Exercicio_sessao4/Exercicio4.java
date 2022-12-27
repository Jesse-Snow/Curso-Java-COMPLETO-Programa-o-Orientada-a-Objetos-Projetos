// Fazer um programa que leia o número de um funcionário, 
// seu número de horas trabalhadas, 
// o valor que recebe por hora e calcula o salário desse funcionário. 
// A seguir, mostre o número e o salário do funcionário, com duas casas decimais.

import java.util.Scanner; 

public class Exercicio4{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int horasTrabalhadas = scn.nextInt();
        scn.nextLine();
        double valorHoras = scn.nextDouble();
        scn.nextLine();
        double salario = (horasTrabalhadas * valorHoras);
        System.out.println("Salário" + String.format("%.2f",salario));
    }
}