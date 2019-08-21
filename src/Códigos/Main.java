package Códigos;

public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro(); // criação de um espeço na memória onde vai ser alocado um objeto chamado livro
        Livro livro2 = new Livro();           //uma claase pode ser acessado atraves do . (ponot)
        Livro livro3 = new Livro();

        livro.nome = "God Killer";
        livro.anoPublicacao = 2010;
        livro.autor = "slah";
        livro.valor= 52;

        livro2.nome = "Susurro";
        livro2.anoPublicacao = 2010;
        livro2.autor = "slah";
        livro2.valor= 100;

        System.out.println("Nome do livro:" + livro.nome);
        System.out.println(livro.autor);
        System.out.println(livro.toString());

        livro3.ler();
        livro3.mostrar();

        livro3.valor -= 0.1;

        livro2.aplicarDesconto(10);

        System.out.println(livro2.valor);

        System.out.println(livro3.valor);

    }

}
