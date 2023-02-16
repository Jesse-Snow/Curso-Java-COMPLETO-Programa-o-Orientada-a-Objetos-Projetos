package Exercicio_sessao9;

import java.util.Scanner;

import Exercicio_sessao9.Entities.Account;

public class Exercicio {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Account newAccount = null;
    
        System.out.println("Enter the account number:");
        int accountNumber = scn.nextInt();
        scn.nextLine();
        System.out.println("Enter the account holder:");
        String accountOwner = scn.nextLine();
        System.out.println("Is there a initial deposit (y/n)?");
        String awser = scn.nextLine();

        if(awser.equals("y") || awser.equals("Y")){
            System.out.println("Enter inintial deposit value:");
            Double initialDeposit = scn.nextDouble();
            newAccount = new Account(accountNumber,accountOwner, initialDeposit);
            newAccount.showAccount();

            System.out.println("Enter a deposit value:");
            newAccount.depositMoney(scn.nextDouble());
            System.out.println("Enter a withdraw value:");
            newAccount.withdrawMoney(scn.nextDouble());

        }else if(awser.equals("n") || awser.equals("N")){
            newAccount = new Account(accountNumber,accountOwner);  
            newAccount.showAccount();

            System.out.println("Enter a deposit value:");
            newAccount.depositMoney(scn.nextDouble());
            System.out.println("Enter a withdraw value:");
            newAccount.withdrawMoney(scn.nextDouble());
        }else { 
            System.out.println("Invalid character, please use y or n");
        }
    }
    
}
