public class ContaPoupanca extends ContaBancaria {
	
	private long numeroConta;
	private int variacao;

	public ContaPoupanca(String cpf) {
		super(cpf);
		// TODO Auto-generated constructor stub
	}

	public long getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(long numeroConta) {
		this.numeroConta = numeroConta;
	}

	public int getVariacao() {
		return variacao;
	}

	public void setVariacao(int variacao) {
		this.variacao = variacao;
	}
	
}