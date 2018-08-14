public class ContaCorrente extends ContaBancaria {
	
	private long numeroConta;

	public ContaCorrente(String cpf) {
		super(cpf);
	}

	public long getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(long numeroConta) {
		this.numeroConta = numeroConta;
	}
	
	

}