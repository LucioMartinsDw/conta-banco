import java.util.InputMismatchException;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Programa: Por favor, digite o número da Agência !");
        String agencia = scanner.nextLine();

        int numero = 0;
        boolean numeroValido = false;
        while (!numeroValido) {
            try {
                System.out.println("Programa: Por favor, digite o número da Conta !");
                numero = scanner.nextInt();
                numeroValido = true;
            } catch (InputMismatchException e) {
                System.out.println("Programa: Por favor, digite um número válido para a conta.");
                scanner.nextLine(); // Limpa o buffer
            }
        }

        scanner.nextLine(); // Limpa o buffer após a leitura do número da conta

        System.out.println("Programa: Por favor, digite o nome do cliente !");
        String nomeCliente = scanner.nextLine();

        double saldo = 0;
        boolean saldoValido = false;
        while (!saldoValido) {
            try {
                System.out.println("Programa: Por favor, digite o saldo da conta !");
                saldo = scanner.nextDouble();
                saldoValido = true;
            } catch (InputMismatchException e) {
                System.out.println("Programa: Por favor, digite um valor válido para o saldo.");
                scanner.nextLine(); // Limpa o buffer
            }
        }

        // Feche o scanner após a leitura dos dados
        scanner.close();

        // Exibir a mensagem com os dados inseridos pelo usuário
        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia
                + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.";

        System.out.println(mensagem);
    }
}
