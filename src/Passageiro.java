
public class Passageiro {
	
	private Pessoa pessoa;
	private int numeroSmiles;
	
	public Passageiro(Pessoa p) {
		pessoa = p;
	}
	
	
	public String getNome() {
		return pessoa.getNome();
	}
	public void setNome(String nome) {
		this.pessoa.setNome(nome);
	}
	public String getEndereco() {
		return pessoa.getEndereco();
	}
	public void setEndereco(String nome) {
		this.pessoa.setEndereco(nome);
	}
	public int getNumeroSmiles() {
		return numeroSmiles;
	}
	public void setNumeroSmiles(int numero) {
		this.numeroSmiles = numero;
	}
	
	public String eh() {
		return "passageiro";
	}

}
