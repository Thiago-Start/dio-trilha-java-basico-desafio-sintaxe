import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: Conhecer e importar a classe Scanner;

        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Digite o seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite sua data de nascimento (dd/MM/yyyy): ");
        String dataNascimentoStr = scanner.nextLine();
        LocalDate dataNascimento = LocalDate.parse(dataNascimentoStr, formatter);

        System.out.print("Digite o Número da Conta: ");
        int numeroConta = scanner.nextInt();

        System.out.print("Digite sua agência: ");
        int agencia = scanner.nextInt();

        System.out.print("Digite o saldo inicial: ");
        double saldo = scanner.nextDouble();

        Cliente cliente = new Cliente(nome, dataNascimento);

        ContaCadastro novaConta = new ContaCadastro(cliente, agencia, numeroConta, saldo, LocalDate.now());

        System.out.println(novaConta);

        //TODO: Exibir as menssagens para o nosso usuário

        //TODO: Obter pela scanner os valores digitados no terminal

        //TODO: Exibir a menssagem conta criada
    }
}
