package Exercicio_sessao9.Entities;

public class Account {
    private int accountNumber; 
    private String ownerName;
    private Double accountBalance; 

    public Account(int accountNumber,String ownerName){
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.accountBalance = 0.0;
    }

    public Account(int accountNumber, String ownerName, Double accountBalance){
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.accountBalance = accountBalance;
    }

    public int getAccountNumber(){
        return this.accountNumber;
    }

    public String getOwnerName(){
        return this.ownerName;
    }
    public void setOwnerName(String ownerName){
        this.ownerName = ownerName;
    }

    public Double getAccountBalance(){
        return this.accountBalance;
    }
    public void setAccountBalance(Double accountBalance){
        this.accountBalance = accountBalance;
    }
    public void depositMoney(Double amount){
        Double result = getAccountBalance() + amount;
        setAccountBalance(result);
        this.showAccount();
    }
    public void withdrawMoney(Double amount){
        Double resultWithTax = getAccountBalance() - amount - 5;
        setAccountBalance(resultWithTax);
        this.showAccount();
    }
    public void showAccount(){
        System.out.println("Account Data:");
            System.out.println(
                "Account " 
                + this.getAccountNumber() 
                + ", Holder: " 
                + this.getOwnerName()
                + ", Balance: "
                + this.getAccountBalance()
                );
    }
}
