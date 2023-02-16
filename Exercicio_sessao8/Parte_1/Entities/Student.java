package Exercicio_sessao8.Parte_1.Entities;

public class Student {
    public String name;
    public int firstScore;
    public int secondScore;
    public int thirdScore;

    public void finalScore(){
        int result = this.firstScore + this.secondScore + this.thirdScore;
        if( result > 60){
            System.out.println("FINAL GRADE = " + result);
            System.out.println("PASS");
        }else if(result < 60){
            System.out.println("FINAL GRADE = " + result);
            System.out.println("FAILED");
            System.out.println("MISSING " + (60 - result) + " POINTS");
        }
    }
}
