package exercicio1oo.classes;

import java.util.Scanner;

class TesteLivro {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Livro um = new Livro();

        System.out.print("Titulo: ");
        um.titulo = leitor.nextLine();

        System.out.print("Autor: ");
        um.autor = leitor.nextLine();

        System.out.print("Genero: ");
        um.genero = leitor.nextLine();

        System.out.print("Emprestado: ");
        um.emprestado = leitor.nextBoolean();

        System.out.println("Dados do Livro  :");
        System.out.println("               ");
        System.out.println("Titulo:      " + um.titulo);
        System.out.println("Autor:       " + um.autor);
        System.out.println("Genero:         " + um.genero);
        System.out.println("Emprestado:  " + um.emprestado);
    }
}
