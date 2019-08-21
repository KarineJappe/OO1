package Encapsulamento;

import java.util.Scanner;

public class ContaCorrente {
/*
    Elabore uma classe Conta Corrente, com os seguintes atributos, saldo, numero da conta, senha e titular.
    Titular é um atributo composto de uma classe Cliente, os atributos de uma classe cliente é cpf, nome e idade.
    Crie métodos que possibilite efetuar um saque, efetuar um depósito e transferir valores de uma conta para outra.
*/
    Scanner read = new Scanner(System.in);

    private double saldo;
    private int numeroConta=0;
    private String senha;
    private Cliente titular;
    private double limite=200;

    ContaCorrente(){
        Cliente cliente = new Cliente();
        if (cliente.getIdade()>60){
            limite = 300;
        }
        System.out.println("senha:");
        senha = read.nextLine();
        System.out.println("Deseja fazer um depósito inicial(s/n)");
        String resp = read.next();
        if (resp.equals("s")){
            System.out.println("Valor:");
            int valor = read.nextInt();
            depositar(valor);
        }
        titular=cliente;
    }

    ContaCorrente (Cliente titular){
        
    }

    public void sacar(int valor){
        if( saldo <=0 || valor > saldo){
            System.out.println("Saldo insuficiente!");
        }else {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso");
        }
    }
    public void depositar(int valor){
        saldo += valor;
    }
    public void transferir(int valor, ContaCorrente conta){
        if(this.saldo >= valor);
            saldo -= valor;
            conta.saldo = valor;
    }
    public double mostraSaldo(){
        return getSaldo();
    }

    public boolean equals(Object obj) {
        if (obj instanceof ContaCorrente) {
            ContaCorrente qualquer = (ContaCorrente) obj;
            return this.titular.getCpf().equals(qualquer.titular.getCpf()) || this.titular.getNome().equals(qualquer.titular.getNome());
        }else {
            return false;
        }
    }


    public void tostring() {
        System.out.println("ContaCorrente{" +
                "saldo=" + getSaldo() +
                ", numeroConta=" + getNumeroConta() +
                ", senha='" + getSenha() +
                ", titular=" + getTitular().getNome()+
                ", limite=" + getLimite() +
                '}');
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }


}
