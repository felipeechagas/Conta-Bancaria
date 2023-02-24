package org.example;

import java.util.Scanner;

public class ContaTerminal {
  public static void main(String[] args) throws Exception{

    Scanner leitor = new Scanner(System.in);

    String nomeCliente;
    String agencia;
    int conta;
    double saldo;

    System.out.println("Por favor, digite seu nome: ");
    nomeCliente = leitor.nextLine();

    System.out.println("Por favor, digite o número da Agência: ");
    agencia = leitor.nextLine();

    System.out.println("Por favor, digite o número da conta: ");
    conta = leitor.nextInt();

    System.out.println("Por favor, digite o saldo: ");
    saldo = leitor.nextDouble();

    System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +
            ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque.");

    leitor.close();
  }
}