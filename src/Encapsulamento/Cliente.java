package Encapsulamento;

import java.util.Scanner;

public class Cliente {
    private Scanner read = new Scanner(System.in);
    private String cpf;
    private String nome;
    private int idade;

    Cliente(){
        System.out.println("Nome:");
        nome = read.nextLine().toUpperCase();
        System.out.println("Cpf");
        cpf = read.nextLine();
        System.out.println("Idade");
        idade = read.nextInt();
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "read=" + read +
                ", cpf='" + cpf + '\'' +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }

    public Scanner getRead() {
        return read;
    }

    public void setRead(Scanner read) {
        this.read = read;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
