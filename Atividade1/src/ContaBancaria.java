public class ContaBancaria {
	
	private String nome;
	private String cpf;
	private double saldo;
	private int agencia;
	
	public ContaBancaria(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public void depositar(double quantia){
		this.saldo += quantia;
	}
	
	public void sacar(double quantia){
		this.saldo -= quantia;
	}

	
	
	

}