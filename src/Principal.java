import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		System.out.println("############## DigitalBank ##############");
		// Variaveis
		String nome, cpf, numero;
		int i;
		double transfer, valor;
		valor = 30;
		i = 0;
		Scanner ler = new Scanner(System.in);
		Scanner test = new Scanner(System.in);
		// Objeto de ContaCorrente chamado cc1.
		ContaCorrente cc1 = new ContaCorrente();
		// Objeto de ContaPoupança chamado cp1.
		ContaPoupanca cp1 = new ContaPoupanca();
		// Objetos de Pessoa chamados P1 P2
		Pessoa p1 = new Pessoa();
		Pessoa p2 = new Pessoa();
		// Atributos de P2 e seus atributos.
		p2.setNome("Cris");
		p2.setCpf("322.212.212.15");
		cp1.setNumero(123);
		cp1.setAgencia(1);
		cp1.setContemPix(false);
		cp1.setPessoa(p2);
		cp1.setSaldoContaPoupanca(300);
		// Criação de P1 e seus atributos.
		System.out.println("Digite seu nome: ");
		p1.setNome(ler.nextLine());
		System.out.println("Digite o numero do seu CPF: ");
		p1.setCpf(ler.nextLine());
		cc1.setPessoa(p1);
		cc1.setAgencia(2);
		cc1.setNumero(321);
		cc1.setContemPix(false);
		cc1.setSaldoContaCorrente(valor);
		System.out.println("-----------------------------------");
		System.out.println("Seja bem-vindo, " + p1.getNome());
		System.out.println("-----------------------------------");

		while (true) {

			System.out.println("Escolha alguma das opções a baixo." + "\n1: Sacar" + "\n2: Depositar" + "\n3: Saldo"
					+ "\n4: Transferir" + "\n5: Informações da conta." + "\n0: Sair");
			System.out.println("-----------------------------------");
			System.out.println("Digite o numero da operação: ");
			System.out.println("-----------------------------------");

			try {

				numero = ler.nextLine();

				i = Integer.parseInt(numero);
				if (i == 0) {
					System.out.println("Sessão encerrada.");
					break;
				}

			} catch (NumberFormatException e) {
				System.out.println("-----------------------------------");
				System.out.println("Número inválido!");
				System.out.println("-----------------------------------");

			}

			switch (i) {
			case 1:

				System.out.println("Digite o valor para o saque: ");
				valor = test.nextDouble();
				cc1.sacar(valor);
				break;
			case 2:
				System.out.println("Digite o valor do deposito: ");
				valor = test.nextDouble();
				cc1.depositar(valor);
				break;
			case 3:
				cc1.exibirSaldo();
				break;
			case 4:
				System.out.println("Digite o valor para tranferir.");
				transfer = test.nextDouble();
				if (valor >= transfer) {
					cc1.tranfer(transfer);
					cp1.transferenciaCom(transfer);
					cp1.exibirSaldo();

				} else {

					System.err.println("Valor invalido.");
				}

				break;
			case 5:
				cc1.exibirDados();

				break;

			default:

				System.err.println("A operação não foi concluida.");
				break;
			}

			System.out.println("---------------");
			System.out.println("Voltar ao menu: \n 0: Menu");
			numero = ler.nextLine();

			i = Integer.parseInt(numero);

		}

	}

}
