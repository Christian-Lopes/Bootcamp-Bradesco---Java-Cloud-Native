import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        // Conhecer e importa a classe Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Exibir a mensagem para o usuário
        // Obter pelo scanner os valores digitados no terminal
        System.out.println("         Criar conta          ");
        System.out.println("==============================");

        System.out.println("Informe o número de sua conta.");
        int conta = scanner.nextInt();

        System.out.println("Informe a sua agência.");
        String agencia = scanner.next();

        System.out.println("Digite o seu nome.");
        String nome = scanner.next();

        System.out.println("Inforem o saldo.");
        double saldo = scanner.nextDouble();

        // Exibir a mensagem com a conta criada
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso " +
                "banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldo + 
                " já está disponível para saque.");
        
    }
}
