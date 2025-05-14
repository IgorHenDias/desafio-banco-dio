import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Cliente cliente = new Cliente();
        Banco banco = new Banco();

        System.out.print("Informe o nome do banco: ");
        banco.setNome(sc.nextLine());

        System.out.print("Informe o nome do cliente: ");
        cliente.setNome(sc.nextLine());

        System.out.print("Digite o CPF do cliente: ");
        cliente.setCpf(sc.nextLine());

        sc.close();

        Conta contaCorrente = new ContaCorrente(cliente, banco);
        Conta contaPoupanca = new ContaPoupanca(cliente, banco);

        contaCorrente.depositar(100);
        contaCorrente.transferir(100, contaPoupanca);

        contaCorrente.imprimirExtrato();
        contaPoupanca.imprimirExtrato();
    }
}
