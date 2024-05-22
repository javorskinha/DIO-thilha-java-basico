import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        //criando objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //utilizando scanner para entrada de dados
        System.out.println("Olá! por favor digite seu nome:");
        String nome = scanner.next();

        System.out.println("Digite o número da agência:");
        String agencia = scanner.next();

        System.out.println("Digite o numero da conta:");
        int conta = scanner.nextInt();

        System.out.println("Digite seu saldo:");
        double saldo = scanner.nextDouble();

        //retornando a mensagem com os dados inseridos pelo usuario
        System.out.println("Olá " + nome + ", obrigado por criar sua conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque!");

    }
}
