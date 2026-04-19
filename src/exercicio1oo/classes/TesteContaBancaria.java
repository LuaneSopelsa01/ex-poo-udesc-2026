package exercicio1oo.classes;

import java.util.Scanner;

class TesteContaBancaria {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ContaBancaria um = new ContaBancaria();

        System.out.print("Numero Conta: ");
        um.numeroConta = leitor.nextLine();

        System.out.print("Titular: ");
        um.titular = leitor.nextLine();

        System.out.print("Saldo: ");
        um.saldo = leitor.nextDouble();


        System.out.println("Dados da Conta Bancaria:");
        System.out.println("               ");
        System.out.println("Numero da Conta:  " + um.numeroConta);
        System.out.println("Titular:          " + um.titular);
        System.out.println("Saldo:            " + um.saldo);
    }
}
