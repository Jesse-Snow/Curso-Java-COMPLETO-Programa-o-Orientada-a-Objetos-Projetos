// Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
// Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
// essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).

package Exercicio_sessao6_for;
import java.util.Scanner;
public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Digite a quantidade de numures a serem digitados:");
        int n = scn.nextInt();
        scn.nextLine();
        int x = 0;

        int in = 0;
        int out = 0;

        System.out.println("Digite os numeros para checar os que estão ou não no intervalo:");
        for(int i = 0; i < n; i++){
            x = scn.nextInt();
            if(x >= 10 &&x <= 20){
                in++;
            }else{
                out++;
            }
        }
        System.out.println("In:" + in);
        System.out.println("Out:" + out);
    }
}
