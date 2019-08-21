package Encapsulamento;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        ArrayList <ContaCorrente> array = new ArrayList<ContaCorrente>();
        int resp;
        int i=0;

        ContaCorrente conta = new ContaCorrente();
        conta.setNumeroConta(i);
        array.add( conta);

        do {
            System.out.println("1 - Criar nova conta\n"+
                    "2- Consultar Saldo\n"+
                    "3- Deposito\n"+
                    "4- Saque\n"+
                    "5- Transferência\n"+
                    "6- Listar\n"+
                    "0- Sair");
            resp = read.nextInt();

            switch (resp){
                case 1:
                    ContaCorrente conta2 = new ContaCorrente();
                    i +=1;
                    array.add( conta2);
                    conta2.setNumeroConta(i);
                    break;
                case 2:
                    System.out.println("Numero da conta:");
                    int numeroConta = read.nextInt();
                    read.nextLine();
                    System.out.println("Senha:");
                    String senhaSaldo = read.nextLine();
                    for (int cont =0; cont<=i;cont++){
                        if(numeroConta == array.get(cont).getNumeroConta() && senhaSaldo.equals(array.get(cont).getSenha())) {
                           double saldo = array.get(cont).mostraSaldo();
                            System.out.println("Seu saldo é R$:"+ saldo);

                        }else{
                            System.out.println("Conta inválida!");
                        }
                    }
                    break;
                case 3:
                    System.out.println("Valor a ser deposito:");
                    int valor = read.nextInt();
                    conta.depositar(valor);
                    break;
                case 4:
                    System.out.println("Numero da conta:");
                    int aux = read.nextInt();
                    read.nextLine();
                    System.out.println("Senha:");
                    String senhaSaque = read.nextLine();
                    for (int cont =0; cont<=i;cont++){
                        if(aux == array.get(cont).getNumeroConta() && senhaSaque.equals(array.get(cont).getSenha())){
                            System.out.println("Valor do saque:");
                            int valorSaque = read.nextInt();
                            array.get(cont).sacar(valorSaque);
                            break;
                        }else{
                            System.out.println("Conta invalida!");
                        }
                    }
                    break;
                case 5:
                    System.out.println("Numero da conta:");
                    int auxx = read.nextInt();
                    read.nextLine();
                    System.out.println("Senha:");
                    String senhaTransf = read.nextLine();
                    for(int cont=0; cont<=i; cont++){
                        if(auxx == array.get(cont).getNumeroConta() && senhaTransf.equals(array.get(cont).getSenha())){
                            System.out.println("Numero da conta do destinatário:");
                            int des = read.nextInt();
                            for(int j =0; j<i;j++){
                                if( des == array.get(j).getNumeroConta() ){
                                    conta = array.get(j);
                                    System.out.println("valor:");
                                    int valorTrans = read.nextInt();
                                    array.get(cont).transferir(valorTrans, conta);
                                }else{
                                    System.out.println("Conta inválida!");
                            }
                        }

                    }else{
                            System.out.println("Número da conta e senha não conferem!");
                        }
                }
                break;
                case 6:
                    for (int a= 0; a<=i; a++){
                         conta = array.get(a);
                        conta.tostring();
                    }


            }
        }while(resp != 0);

    }


}
