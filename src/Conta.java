
public abstract class Conta {
	private Pessoa pessoa;
	private int numero, agencia;
	private boolean contemPix = false;

	// Metodo que faz o saque do valor que esta na conta.
	public abstract void sacar(double valor);

	// Metodo que faz o deposito na conta.
	public abstract void depositar(double valor);

	// Metodo que mostra o saldo disponivel na conta.
	public abstract void exibirSaldo();

	// Metodo que faz a ativação do pix.
	public void ativarPix() {
		if (contemPix == false) {
			this.contemPix = true;
			System.out.println("Pix ativado com sucesso.");

		} else {

			System.err.println("Seu pix ja esta ativo.");
		}

	}

	// Metodo que faz a desativação do pix.
	public void desativarPix() {

		if (contemPix == true) {

			this.contemPix = false;
			System.out.println("Pix desativado com sucesso.");

		} else {

			System.err.println("Seu pix já esta desativado.");
		}

	}

	public abstract void exibirDados();

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public int getNumero() {
		return numero;
	}

	public boolean setNumero(int numero) {
		this.numero = numero;
		return contemPix;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public boolean isContemPix() {
		return contemPix;
	}

	public void setContemPix(boolean contemPix) {
		this.contemPix = contemPix;
	}

	@Override
	public String toString() {
		return "Conta [pessoa=" + pessoa + ", numero=" + numero + ", agencia=" + agencia + ", contemPix=" + contemPix
				+ "]";
	}

}
