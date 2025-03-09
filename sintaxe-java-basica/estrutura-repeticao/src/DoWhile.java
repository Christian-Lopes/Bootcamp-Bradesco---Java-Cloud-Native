import java.util.Random;

public class DoWhile {
    public static void main(String[] args) {
        System.out.println("Discando...");

        int quantidadeChamadas = 0;
        do{
            System.out.println("Telefone tocando...");
            quantidadeChamadas++;
        }while(tocando());

        System.out.println("Quantidade de chamadas: " + quantidadeChamadas + ".");
        System.out.println("Alô!!!");
    }

    private static boolean tocando() {
        boolean atendeu = new Random().nextInt(3) == 1;
        System.out.println("Atendeu? " + atendeu);
        return !atendeu;
    }
}
