// Fazer um programa para ler os dados de um funcionário (nome, salário bruto, raise). Em
// seguida, mostrar os dados do funcionário (nome e salário). Em seguida, aumentar o
// salário do funcionário com base em uma porcentagem dada (somente o salário bruto é
// afetado pela porcentagem) e no ID, mostrar novamente os dados do funcionário. Use a classe
// projetada abaixo.
package Exercicio_sessao10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import Exercicio_sessao8.Parte_1.Entities.Employee;

public class Exercicio12_Lists {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        List<Employee> allEmployees = new ArrayList();
        int numberOfEmployees = 0;
        System.out.println("How many employees will be registered?");
        numberOfEmployees = scn.nextInt();

        for(int i = 0; i < numberOfEmployees; i++){
            Employee newEmployee = new Employee();
            System.out.println("The ID:");
            String id = scn.next();
            newEmployee.setId(id);
            System.out.println("The Name:");
            newEmployee.name = scn.next();
            System.out.println("The Salary:");
            newEmployee.rawSalary = scn.nextDouble();
    
            System.out.println("Employee: " + newEmployee.name + ", ID:" + newEmployee.getId());
            allEmployees.add(newEmployee);
        }
        

        System.out.print("Enter the Employee ID that will have salary increase: ");
        String idToBeRaised = scn.next();
        List<Employee> EmployeeToBeRaised = allEmployees.stream().filter( employee -> employee.getId().equals(idToBeRaised)).collect(Collectors.toList());
        if(EmployeeToBeRaised.size() > 0){
            for( Employee result : EmployeeToBeRaised){
                // Colocar sysout para o raise
                System.out.println("How amount to be raised?");
                result.rise = scn.nextDouble();
                // Criar overload para função increaseSalary sem o netSalary
                System.out.println("Updated data: " + result.name + ", " + result.increaseSalary(result.rise) );
            }
        }else { 
             System.out.println("ID not found...");   
        }
        
        System.out.println("");
        
        for( Employee result : allEmployees){
            System.out.println("ID: " + result.getId());
            System.out.println("Name: " + result.name);
            System.out.println("Salary: " + result.rawSalary);
        }
        




    }
}
