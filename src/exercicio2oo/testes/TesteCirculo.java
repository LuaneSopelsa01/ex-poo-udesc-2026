package exercicio2oo.testes;

import exercicio2oo.classes.Circulo;

import java.util.Scanner;

 public class TesteCirculo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Circulo um = new Circulo();

        System.out.print("Raio: ");
        um.raio = leitor.nextDouble();

        System.out.println("Dados do Circulo");
        System.out.println("               ");
        System.out.println("Raio:    " + um.raio);
    }
}
