package com.trybe.idadeemdias;

import java.util.Scanner;

/**
 * Class Main.
 */
public class Main {

  /**
   * Initial Method.
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Qual é o seu nome?");

    String name = scanner.next();

    System.out.println("Qual é sua idade em anos, meses e dias?");

    try {
      System.out.println("anos:");

      int years = scanner.nextInt();

      System.out.println("meses:");

      int months = scanner.nextInt();

      System.out.println("dias:");

      int days = scanner.nextInt();

      Pessoa pessoa = new Pessoa();
      int age = pessoa.calcularIdadeEmDias(years, months, days);

      StringBuilder sb = new StringBuilder();

      sb.append("Olá ").append(name).append(", sua idade em dias é ").append(age);

      System.out.println(sb.toString());
    } catch (Exception e) {
      System.out.println("Entre com uma opção válida!");
    }

    scanner.close();
  }

}
