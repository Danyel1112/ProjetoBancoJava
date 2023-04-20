package banco;

import java.util.Scanner;

public class Main extends Banco {
	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		Banco banco = new Banco();
		banco.setSaldo(600); // inicia o saldo
		boolean continuar = true;

		while (continuar) {
			System.out.println("Deseja realizar qual operação?");
			System.out.println("1 - Sacar");
			System.out.println("2 - Depositar");
			System.out.println("3 - Ver Saldo");
			System.out.println("4 - Sair");
			System.out.println("Seu saldo atual: " + banco.getSaldo());

			int opcao = leitura.nextInt();

			switch (opcao) {
			case 1: {
				System.out.println("Digite o valor a ser sacado: ");
				double valorSaque = leitura.nextDouble();
				double novoSaldo = banco.sacar(valorSaque, banco);
				banco.setSaldo(novoSaldo);
				System.out.println("Novo saldo atualizado: " + banco.getSaldo());
				break;
			}
			case 2: {
				System.out.println("Digite o valor a ser depositado: ");
				double valorDeposito = leitura.nextDouble();
				double novoSaldo = banco.depositar(valorDeposito, banco);
				banco.setSaldo(novoSaldo);
				System.out.println("Novo saldo atualizado: " + banco.getSaldo());
				break;
			}
			case 3: {
				System.out.println("Seu saldo atual: " + banco.getSaldo());
				break;
			}
			case 4: {
				System.out.println("Finalizando operação...");
				continuar = false;
				break;
			}
			default: {
				System.out.println("Opção inválida, tente novamente.");
			}
			}
		}
		leitura.close();
	}

}