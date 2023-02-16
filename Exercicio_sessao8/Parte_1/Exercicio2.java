package Exercicio_sessao8.Parte_1;

import java.util.Scanner;

import Exercicio_sessao8.Parte_1.Entities.Employee;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Employee newEmployee = new Employee();
        newEmployee.name = scn.nextLine();
        newEmployee.rawSalary = scn.nextDouble();
        newEmployee.tax = scn.nextDouble();
        System.out.println("Name: " + newEmployee.name);
        System.out.println("Salary: " + newEmployee.rawSalary);
        System.out.println("Tax:  " + newEmployee.tax);

        System.out.println("Employee: " + newEmployee.name + ", " + newEmployee.netSalary());

        System.out.print("Which percentage to increse the salary? ");
        newEmployee.rise = scn.nextDouble();
        System.out.println("Updated data: " + newEmployee.name + ", " + newEmployee.increaseSalary() );
    }
}
