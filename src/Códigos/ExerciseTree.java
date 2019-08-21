package Códigos;

import java.util.Scanner;

public class ExerciseTree {

/*
3- Escreva uma classe chamada Hora, com os seguintes atributos inteiros: hora, minutos e segundo. Permita a entrada destes
atributos somente se ele for uma hora válida.Crie uma classe para testar.
*/
    Scanner read = new Scanner(System.in);

    int hora, minutos, segundo;

    public void validarHora(){
        System.out.println("hora:");
        hora = read.nextInt();
        System.out.println("Minutos:");
        minutos = read.nextInt();
        System.out.println("Segundos:");
        segundo = read.nextInt();
        if (hora>24){
            System.out.println("Hora inválida!");
            hora = read.nextInt();
                if (minutos>60){
                    System.out.println("Minutos inválidos!!");
                    minutos = read.nextInt();
                }
                if(segundo>60){
                    System.out.println("Segundos inválidos!!");
                    segundo = read.nextInt();
                }
        }else{
            System.out.println(hora + ":" + minutos + ":" + segundo);
        }


    }
}
