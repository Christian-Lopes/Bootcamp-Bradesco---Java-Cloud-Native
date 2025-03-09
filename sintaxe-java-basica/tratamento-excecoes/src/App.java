import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome:");
        String nome = scanner.next();

        System.out.println("Digite o seu sobrenome:");
        String sobrenome = scanner.next();

        try {
            System.out.println("Digite a sua idade.");
            int idade = scanner.nextInt();

            System.out.println("Digite a sua altura:");
            double altura = scanner.nextDouble();

            System.out.println("Olá, me chamo " + nome.toUpperCase() +
                    " " + sobrenome.toUpperCase() + ".");
            System.out.println("Tenho " + idade + "anos.");
            System.out.println("Minha altura é " + altura + "cm.");
        } catch (InputMismatchException e) {
            System.out.println("Os campos idade e altura precisam ser númericos");
        }
    }
}
