
public class ContaCorrente extends Conta {
	private double saldoContaCorrente;

	// Metodo que faz o saque da conta corrente.
	@Override
	public void sacar(double valor) {
		if (saldoContaCorrente < valor) {
			System.err.println("Não foi possivel efetuar o saque.");

		} else {
			System.out.println("Saque efetuado com sucesso.");
			this.saldoContaCorrente = saldoContaCorrente - valor;

		}

	}

	// Metodo que inicia a transferência.
	public void tranfer(double valor) {
		this.saldoContaCorrente = saldoContaCorrente - valor;
		this.saldoContaCorrente = saldoContaCorrente - 9.50;
		System.out.println("Transferência concluída");

	}

	// Metodo que conclui a transferência.
	public void transferenciaCom(double valor) {
		saldoContaCorrente = saldoContaCorrente + valor;

	}

	// Metodo que faz o deposito.
	@Override
	public void depositar(double valor) {
		saldoContaCorrente = saldoContaCorrente + valor;
		System.out.println("Deposito Efetuado.");

	}

	// Metodo que exibi o saldo.
	@Override
	public void exibirSaldo() {
		System.out.println("Seu saldo é : $" + saldoContaCorrente);

	}

	public double getSaldoContaCorrente() {
		return saldoContaCorrente;
	}

	public void setSaldoContaCorrente(double saldoContaCorrente) {
		this.saldoContaCorrente = saldoContaCorrente;
	}

	@Override
	public String toString() {
		return "ContaCorrente [saldoContaCorrente=" + saldoContaCorrente + "]";
	}

	@Override
	public void exibirDados() {
		System.out.println("Seus dados são: ");
		System.out.println("Numero da conta: " + this.getNumero());
		System.out.println("Numero da agencia: " + this.getAgencia());
		System.out.println("Nome : " + this.getPessoa().getNome());
		System.out.println("CPF: " + this.getPessoa().getCpf());
		
	}

}
