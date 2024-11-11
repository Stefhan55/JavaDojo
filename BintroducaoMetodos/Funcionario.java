package javacore.BintroducaoMetodos.dominio;

public class Funcionario {

    private  String nome;
    private int idade;
    private double []salarios;
    private  double media;

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        for (double salario: salarios ){
            System.out.print(salario + "");
        }

    }
    public void imprimeMediaSalario(){
        double media = 0;
        for (double salario: salarios){
            media += salario;

        }

        media /= salarios.length;
        System.out.println("\nMédia Salarial"+ media);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }



    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public double getMedia() {
        return media;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public int getIdade() {
        return idade;
    }

}
