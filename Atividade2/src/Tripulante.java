
public class Tripulante {
	
	private Pessoa pessoa;
	private int idTripulacao;
	
	public Tripulante(Pessoa p) {
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
	public int getIdTripulacao() {
		return idTripulacao;
	}
	public void setIdTripulacao(int idTripulacao) {
		this.idTripulacao = idTripulacao;
	}
	
	public String eh() {
		return "tripulante";
	}
	
	

}
