/* Aula: Sintaxe Opicional - Operadores de Atribuição Cumulativa
 * a = a + b pode ser a += b
 * 
 */
import java.util.Scanner;

public class SO_OperadoresDeAtribuicaoCumulativa {
    public static void main(String[] args) {
        double conta = 50.00;
        int minuto = 102;

        if ( minuto > 100){
            // conta = conta + ( 100 - minuto) * 2.00;
            conta += (minuto - 100) * 2.00;
        }
        System.out.printf("R$ %.2f%n",conta);
    }
}
