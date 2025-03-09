import java.util.concurrent.ThreadLocalRandom;

public class While {
    public static void main(String[] args) {
        double mesada = 50.0;

        int quantidadeDoce = 0;
        while (mesada > 0) {
            Double valorDoce = valorAleatorio();

            if (valorDoce >mesada) {
                valorDoce = mesada;
            }
            System.out.println("Doce do valor: " + valorDoce + ". Aicionando no carrinho.");
            mesada = mesada - valorDoce;
            quantidadeDoce++;
        }

        System.out.println("Mesada: " + mesada + ".");
        System.out.println("Joãozinho gastou toda a sua mesada em doces.");
        System.out.println("Quantidade de doces: " + quantidadeDoce + ".");

    }

    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
}
