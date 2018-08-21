
public class Principal {
	
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Joaquim", "Rua Jonas");
		Pessoa p2 = new Pessoa("Joana", "Rua Joaquim");
		Pessoa p3 = new Pessoa("Joelma", "Rua Joelma");
		Pessoa p4 = new Pessoa("Jonas", "Rua Joana");
		
		Tripulante t = new Tripulante(p1);
		Agente a = new Agente(p2);
		Passageiro p = new Passageiro(p3);
		Agente a2 = new Agente(p4);
		
		t.setIdTripulacao(52);
		a.setIdAgente(666);
		p.setNumeroSmiles(5380);
		
		System.out.println(t.getNome() + " mora na rua " + t.getEndereco() + " e é " + t.eh() + " cujo id é " + t.getIdTripulacao());
		System.out.println(a.getNome() + " mora na rua " + a.getEndereco() + " e é " + a.eh() + " cujo id é " + a.getIdAgente());
		System.out.println(p.getNome() + " mora na rua " + p.getEndereco() + " e é " + p.eh() + " cuja quantidade de pontos no smiles é " + p.getNumeroSmiles());

		
	}

}
