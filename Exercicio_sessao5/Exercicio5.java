// Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
// seguir, calcule e mostre o valor da conta a pagar.

public class Exercicio5{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        System.out.println("Digite o código do Item:");
        int cdItem = 3; //scn.nextInt();
        //scn.nextLine();
       System.out.println("Digita a quantidade desejada para o Item:");
        int qtItem = 2; //scn.nextInt();
        //scn.nextLine();

        System.out.println("Digite o Código do Item:");
        cdItem =3; //scn.nextDouble();
        //scn.nextLine();
        
        double vlItem = 0;
        String nmItem = "";
        if(cdItem == 1){
            vlItem = 4.00;
            nmItem = "Cachorro Quente";
        }else if(cdItem == 2){
            vlItem = 4.50;
            nmItem = "X-Salada";
        }else if(cdItem == 3){
            vlItem = 5.00;
            nmItem = "X-Bacon";
        }else if(cdItem == 4){
            vlItem = 2.00;
            nmItem = "Torrada Simples";
        }else if(cdItem == 5){
            vlItem = 1.50;
            nmItem = "Refrigerante";
        }



        double totalPagamento = ( qtItem * vlItem);

        System.out.println("Total a pagar por:" + nmItem + " " + String.format("%.2f",totalPagamento));
    }
}