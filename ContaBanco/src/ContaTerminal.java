import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        /*
         TODO:
         Conhecer e importar a classe Scanner
         Exibir as mensagens para o nosso usuário
         Obter pela scanner os valores digitados no terminal
         Exibir a mensagem conta criada
        */

        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor, digite o número da conta: ");
        int numConta = sc.nextInt();

        System.out.print("Por favor, digite o número da agência: ");
        String numAgencia = sc.next();

        System.out.print("Por favor, digite seu nome: ");
        sc.nextLine(); // Consumir a quebra de linha pendente
        String nome = sc.nextLine();

        System.out.print("Por favor, digite o saldo: ");
        double saldo = sc.nextDouble();

        // %d para int, %s para string e %.2f para float
        System.out.printf("Olá %s obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo de %.2f já está disponível para saque.", nome, numAgencia, numConta, saldo);
        sc.close();
    }
}