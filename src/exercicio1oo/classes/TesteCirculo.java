package exercicio1oo.classes;

import java.util.Scanner;

 class TesteCirculo {
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
