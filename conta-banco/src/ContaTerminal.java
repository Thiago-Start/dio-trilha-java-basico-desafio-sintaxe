import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: Conhecer e importar a classe Scanner;

        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataAberturaConta = LocalDate.now();
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataAberturaFormatada = dataAberturaConta.format(formatter1);

        System.out.print("Digite o seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite sua data de nascimento (dd/MM/yyyy): ");
        String dataNascimentoStr = scanner.nextLine();
        LocalDate dataNascimento = LocalDate.parse(dataNascimentoStr, formatter);

        if (dataNascimento.plusYears(18).isBefore(LocalDate.now()) || dataNascimento.plusYears(18).isEqual(LocalDate.now())) {
            System.out.println("Certo, você é maior de idade e pode abrir a sua conta.");

            System.out.print("Digite o Número da Conta: ");
            int numeroConta = scanner.nextInt();

            System.out.print("Digite sua agência: ");
            int agencia = scanner.nextInt();

            System.out.print("Digite o saldo inicial: ");
            double saldo = scanner.nextDouble();

            Cliente cliente = new Cliente(nome, dataNascimento);

            ContaCadastro novaConta = new ContaCadastro(cliente, agencia, numeroConta, saldo, LocalDate.now());

            System.out.println("Olá, " + nome + "! Obrigado por criar uma conta em nosso Banco.");
            System.out.println("Sua agencia é: " + agencia + " Sua conta: " + numeroConta);
            System.out.println("E o seu saldo é: " + saldo);
            System.out.println("E a data de Abertura de sua conta é: " + dataAberturaFormatada);

        } else {
            System.out.println("OPS! Você precisa ser +18 anos para abrir sua conta.");
        }
    }
}
