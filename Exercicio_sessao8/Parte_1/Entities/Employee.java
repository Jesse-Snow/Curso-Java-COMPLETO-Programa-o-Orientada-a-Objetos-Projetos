package Exercicio_sessao8.Parte_1.Entities;

public class Employee{
    public String name;
    public Double rawSalary;
    public Double tax;
    public Double rise;
    private String id;

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
    public Double increaseSalary(Double taxAmount){
            taxAmount = this.rise;
            Double raiseTotal = (rawSalary / 100) * taxAmount;
            this.rawSalary += raiseTotal;
            return raiseTotal;
    }
    
    public String getId(){
        return this.id;
    }
    public void setId(String id){
        this.id = id;
    }
}