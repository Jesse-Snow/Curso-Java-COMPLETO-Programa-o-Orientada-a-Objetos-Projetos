// Fazer um programa para ler os valores da largura e altura
// de um retângulo. Em seguida, mostrar na tela o valor de
// sua área, perímetro e diagonal. Usar uma classe como
// mostrado no projeto ao lado.
package Exercicio_sessao8.Parte_1;

import Exercicio_sessao8.Parte_1.Entities.Triangle;

public class Exercicio1 {
    public static void main(String[] args) {
        Triangle myTriangle = new Triangle();
        myTriangle.largura = 3.00;
        myTriangle.altura = 4.00;

        myTriangle.area();
        myTriangle.perimetro();
        myTriangle.diagonal();
    }
}
