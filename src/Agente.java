
public class Agente {
	
	private Pessoa pessoa;
	private int idAgente;
	
	public Agente(Pessoa p) {
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
	public int getIdAgente() {
		return idAgente;
	}
	public void setIdAgente(int id) {
		this.idAgente = id;
	}
	
	public String eh() {
		return "agente";
	}

}
