import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Cliente cliente = new Cliente();
        /*Cliente cpf = new Cliente();*/

        System.out.println("Digite o nome do cliente: ");
        cliente.setNome(sc.nextLine());

        System.out.println("Digite o cpf do cliente: ");
        cliente.setCpf(sc.nextLine());

        Conta cc = new ContaCorrente(cliente);
        Conta poupanca = new ContaPoupanca(cliente);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

    }


}
