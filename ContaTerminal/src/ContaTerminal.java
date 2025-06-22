import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // Criação de variáveis
        int numero;
        String agencia;
        String nomeCliente; 
        float saldo;

        Scanner scanner = new Scanner(System.in);

            System.out.println("Por favor, digite o número da agencia: ");
            agencia = scanner.nextLine();

            System.out.println("Por favor, digite o número da conta: ");
            numero = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha pendente

            System.out.print("Por favor, digite o nome do cliente: ");
            nomeCliente = scanner.nextLine();

            System.out.println("Por favor, digite o saldo da conta: ");
            saldo = scanner.nextFloat();

        

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");


    }
}
