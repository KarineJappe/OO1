package Códigos;

import java.util.Scanner;

public class Livro {
    Scanner read = new Scanner(System.in);

    String nome;
    String autor;
    String descricao;
    String editora;
    int anoPublicacao;
    int valor;

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", autor='" + autor + '\'' +
                ", descricao='" + descricao + '\'' +
                ", editora='" + editora + '\'' +
                ", anoPublicacao=" + anoPublicacao +
                ", valor=" + valor +
                '}';
    }

    public void mostrar(){
        System.out.println("Nome:" + this.nome);
        System.out.println("Autor:" + this.autor);
        System.out.println("Descrção:"+ this.descricao);
        System.out.println("Editora:"+ this.editora);
    }

    public void ler(){
        System.out.println("Indira um nome:");
        this.nome = read.next();
        System.out.println("Indira um autor:");
        this.autor = read.next();
        System.out.println("Indira uma descrição:");
        this.descricao = read.next();
    }

    public void aplicarDesconto(double percentual){
        this.valor -= this.valor*percentual/100;
    }

    public double retornarDesconto( double percentual){
        double desconto = this.valor;
        aplicarDesconto(percentual);
        desconto-= this.valor;
        return desconto;
    }
}
