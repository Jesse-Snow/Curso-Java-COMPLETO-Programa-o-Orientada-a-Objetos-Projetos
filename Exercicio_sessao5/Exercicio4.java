// Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
// começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.

/*****  Aqui usa formula para calculo de horas gastas *****/
import java.util.Scanner;

public class Exercicio4{
    public static void main(String[] args){
  		int horaInicial = 22;
        int horaFinal = 2;
        int duracao;
        if(horaInicial < horaFinal){
            duracao = horaInicial - horaFinal;
        }
        else {
            duracao = 24 - horaInicial + horaFinal;
        }
        System.out.println("O Jogo durou:"+ duracao + " Horas");
    }
}