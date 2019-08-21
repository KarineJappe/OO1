package Códigos;

import java.util.Scanner;

public class ExerciseOne {

/* 1 - Gere uma classe que lerá as informações de base e altura de triângulos, a classe deve possuir métodos de leitura
 de dados, de exibição de das informações e um método para calcular sua Área. Crie uma classe para testar.
*/

    /// area = base.altura/2;
    Scanner read = new Scanner(System.in);

    int base, altura, area;

    public void ler(){
        System.out.println("Informe a base do triângulo: ");
        this.base = read.nextInt();
        System.out.println("Informe a altura do triângulo: ");
        this.altura = read.nextInt();
    }

    @Override
    public String toString() {
        return "ExerciseOne{" +
                " base=" + this.base +
                ",altura=" + this.altura +
                ",area=" + this.area +
                '}';
    }

    public int calcularArea(){
        this.area = base*altura/2;
        return area;
    }
}
