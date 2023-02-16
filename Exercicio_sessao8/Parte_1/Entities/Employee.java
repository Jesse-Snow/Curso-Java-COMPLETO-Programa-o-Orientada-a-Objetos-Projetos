package Exercicio_sessao8.Parte_1.Entities;

public class Employee{
    public String name;
    public Double rawSalary;
    public Double tax;
    public Double rise;

    public Double netSalary(){
        Double result = this.rawSalary - this.tax;
        if(result > 0){
            return result;
        }else {
            return 0.0;
        }
    }

    public Double increaseSalary(){
        Double raiseTotal = (rawSalary / 100) * this.rise;
        return netSalary() + raiseTotal ;
    }
    
}