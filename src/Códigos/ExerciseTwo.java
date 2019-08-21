package Códigos;

import java.util.Scanner;

public class ExerciseTwo {

/*2- Escreva uma classe chamada Data, com os seguintes atributos inteiros: dia, mês e ano. Permita a entrada
 destes atributos verificando a consistência dessas datas, por exemplo não aceitar 31, caso o mês seja 02.
  Crie uma classe para testar.
*/
    Scanner read = new Scanner(System.in);
    String data;
    int dia, mes, ano;

    public void lerData() {
        System.out.println("Dia:");
        dia = read.nextInt();
        System.out.println("Mes:");
        mes = read.nextInt();
        System.out.println("Ano:");
        ano = read.nextInt();

    }
    public void validarData(){
        lerData();
        if (ano<=2018){
            if(dia>31 && mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10) {
                System.out.println("Data inválida:");
                lerData();
            }
            if (dia>30 && mes == 4 || mes == 6 || mes ==9 || mes == 11){
                System.out.println("Data inválida:");
                lerData();
            }
            if ( dia>28 && mes ==2){
                System.out.println("Data inválida:");
                lerData();
            }
        }else{
            System.out.println("ano inválida:");
            lerData();
        }
    }
}
