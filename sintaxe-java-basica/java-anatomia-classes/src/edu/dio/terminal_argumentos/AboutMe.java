package edu.dio.terminal_argumentos;

import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o seu nome.");
        String nome = scanner.next();

        System.out.println("Digite o seu sobrenome.");
        String sobreNome = scanner.next();

        System.out.println("Digite a sua idade.");
        int idade = scanner.nextInt();

        System.out.println("Digite rua altura.");
        double altura = scanner.nextDouble();

        System.out.println("Oi, eu me chamo " + nome + " " + sobreNome);
        System.out.println("Tenho " + idade + " anos de idade.");
        System.out.println("Minha altura é " + altura + " cm.");
    }
}
