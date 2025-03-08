package edu.dio.operadores;

public class Relacionais {
    public static void main(String[] agrs) {
        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;
        System.out.println("São iguais? " + simNao);

        simNao = numero1 != numero2;
        System.out.println("São diferentes? " + simNao);

        String nome1 = "Christian";
        String nome2 = new String("Christian");

        boolean resultado = numero1 >= numero2 ? true : false;
        System.out.println(numero1 + " é maior ou igual? " + resultado);

        boolean resultado2 = numero1 <= numero2 ? true : false;
        System.out.println(numero1 + " é menor ou igual? " + resultado2);

        System.out.println(nome1.equals(nome2));
        System.out.println(nome1 == nome2);
    }
}
