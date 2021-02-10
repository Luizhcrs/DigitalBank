
public class ContaPoupanca extends Conta {
	private double saldoContaPoupanca;

	// Metodo que faz o saque da conta poupança.
	@Override
	public void sacar(double valor) {
		if (valor >= saldoContaPoupanca) {
			System.err.println("Não foi possivel efetuar o saque.");

		} else {
			System.out.println("Saque efetuado com sucesso");
			this.saldoContaPoupanca = saldoContaPoupanca - valor;

		}

	}

	// Metodo que conclui a transferência.
	public void transferenciaCom(double valor) {
		saldoContaPoupanca = saldoContaPoupanca + valor;

	}

	// Metodo que inicia a transferência.
	public void tranfer(double valor) {
		this.saldoContaPoupanca = saldoContaPoupanca - valor;
		this.saldoContaPoupanca = saldoContaPoupanca - 9.50;

	}

	// Metodo que faz o deposito.
	@Override
	public void depositar(double valor) {
		saldoContaPoupanca = saldoContaPoupanca + valor;
		System.out.println("Deposito Efetuado.");

	}

	// Metodo que exibi o saldo.
	@Override
	public void exibirSaldo() {
		System.out.println("Seu saldo da conta poupança é : " + saldoContaPoupanca);

	}

	public double getSaldoContaPoupanca() {
		return saldoContaPoupanca;
	}

	public void setSaldoContaPoupanca(double saldoContaPoupanca) {
		this.saldoContaPoupanca = saldoContaPoupanca;
	}

	@Override
	public String toString() {
		return "ContaPoupanca [saldoContaPoupanca=" + saldoContaPoupanca + "]";
	}

	public void exibirDados() {
		System.out.println("Seus dados são: ");
		System.out.println("Numero da conta: " + this.getNumero());
		System.out.println("Numero da agencia: " + this.getAgencia());
		System.out.println("Nome : " + this.getPessoa().getNome());
		System.out.println("CPF: " + this.getPessoa().getCpf());

	}

}
