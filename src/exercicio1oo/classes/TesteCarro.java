package exercicio1oo.classes;

import java.util.Scanner;

public class TesteCarro {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Carro um = new Carro();

        System.out.print("Modelo: ");
        um.modelo = leitor.nextLine();

        System.out.print("Marca: ");
        um.marca = leitor.nextLine();

        System.out.print("Ano: ");
        um.ano = leitor.nextInt();

        System.out.print("Velocidade: ");
        um.velocidade = leitor.nextDouble();



        System.out.println("Dados do Carro:");
        System.out.println("               ");
        System.out.println("Modelo:      " + um.modelo);
        System.out.println("Marca:       " + um.marca);
        System.out.println("Ano:         " + um.ano);
        System.out.println("Velocidade:  " + um.velocidade);

    }

}
