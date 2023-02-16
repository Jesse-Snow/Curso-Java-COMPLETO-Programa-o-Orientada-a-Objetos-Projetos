package Exercicio_sessao8.Parte_1.Entities;

public class Triangle {
    public double largura;
    public double altura;

    public void area(){
        System.out.println( (this.largura * this.altura));
    }
    public void perimetro(){
        System.out.println( (this.altura + this.largura) * 2);
    }
    public void diagonal(){
        System.out.println( Math.sqrt(Math.pow(this.altura, 2) + Math.pow(this.largura, 2)));
    }
}
