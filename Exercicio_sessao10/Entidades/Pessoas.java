package Exercicio_sessao10.Entidades;

public class Pessoas {
    private String nome;
    private int idade;
    private Double altura;

    public Pessoas(String nome){
        this.nome = nome;
    }

    public Pessoas(String nome, int idade, Double altura){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade(){
        return this.idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }

    public Double getAltura(){
        return this.altura;
    }
    public void setAltura(Double altura){
        this.altura = altura;
    }
}
