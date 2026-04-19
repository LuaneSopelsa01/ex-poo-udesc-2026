package exercicio1oo.classes;

import java.util.Scanner;

class TesteRetangulo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Retangulo um = new Retangulo();

        System.out.print("Altura: ");
        um.altura = leitor.nextDouble();

        System.out.print("Largura: ");
        um.largura = leitor.nextDouble();

        System.out.println("Dados do Retangulo");
        System.out.println("               ");
        System.out.println("Altura:    " + um.altura);
        System.out.println("Largura:   " + um.largura);

    }
}
