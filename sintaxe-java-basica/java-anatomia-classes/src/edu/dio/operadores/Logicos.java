package edu.dio.operadores;

public class Logicos {
    public static void main(String[] args) {
        boolean condicao1 = true;
        boolean condicao2 = false;

        if (condicao1 && condicao2) {
        System.out.println("As duas condições são verdadeiras!");
        }

        if (condicao1 || condicao2) {
            System.out.println("Uma das condições é verdadeira!");
        }

        System.out.println("Fim!");
    }
}
