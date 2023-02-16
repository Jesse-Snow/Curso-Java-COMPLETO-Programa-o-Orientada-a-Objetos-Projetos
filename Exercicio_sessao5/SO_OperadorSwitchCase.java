/* Aula: Sintaxe Opicional - Operadores Switch Case
 * Dias da semana, sendo 1 = Domingo
 * 
 */
import java.util.Scanner;

public class SO_OperadorSwitchCase {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int dia = scn.nextInt();

        switch(dia) {
            case 1:
                System.out.println("Domingo");
                break; 
            case 2:
                System.out.println("Segunda-Feira");
                break; 
            case 3:
                System.out.println("Terça-Feira");
                break; 
            case 4:
                System.out.println("Quarta-Feira");
                break;
            case 5:
                System.out.println("Quinta-Feira");
                break;
            case 6:
                System.out.println("Sexta-Feira");
                break;
            case 7:
                System.out.println("Sabado");
                break;   
            default:
                System.out.println("Valor inválido");
                break;                                        
        }
    }
}
