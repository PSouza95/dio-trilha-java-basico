import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        //Exibir as mensagens para o nosso usuario
        System.out.println("Por favor, digite o número da conta !");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agência !");
        String agencia = scanner.next();

        scanner.nextLine();
        System.out.println("Por favor, digite o seu nome !");
        String nome = scanner.nextLine();

        System.out.println("Por favor, digite o valor do saldo !");
        double saldo = scanner.nextDouble();
        //Obter pelo Scanner os valores digitados no terminal
        //Exibir a mensagem conta criada
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +", conta " + numero +" e seu saldo " + saldo + " já está disponível para saque.");

        scanner.close();
        
    }
}