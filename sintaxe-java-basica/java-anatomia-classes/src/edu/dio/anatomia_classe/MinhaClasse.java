package edu.dio.anatomia_classe;

public class MinhaClasse {
    public static void main(String[] args) {
        System.out.println("Olá turma, sejam bem vindos!");

        int ano = 2025;
        ano = 2026;

        final String BR = "Brasil";

        String meuNome = "Christian";
        int anoFaricacao = 2027;
        boolean verdadeira = true;
        verdadeira = false;
        String primeiroNome = "Christian";
        String segundoNome = "Lopes de Oliveira";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);

    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}
