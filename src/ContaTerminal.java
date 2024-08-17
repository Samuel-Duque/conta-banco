import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        try (Scanner sc = new Scanner(System.in)) {

            System.out.printf("Por favor, digite o numero da conta: ");
            int conta = sc.nextInt();
            sc.nextLine();

            System.out.printf("Digite o numero da agencia:");
            String agencia = sc.nextLine();

            System.out.printf("Digite o nome do titular da conta:");
            String titular = sc.nextLine();

            System.out.printf("Digite o saldo da conta:");
            double saldo = sc.nextDouble();

            System.out.printf("Olá, %s, obrigado por criar uma conta em nosso banco, sua agencia é %s, sua conta é %d e seu saldo %.2f já está disponível.", titular, agencia, conta, saldo);
        }
    }
}
