
public class BancoProxy implements Banco {
	
	String NumeroDeUsuarios;
	String UsuariosConectados;
	
	public BancoProxy(String NumeroDeUsuarios, String UsuariosConectados) {
		this.NumeroDeUsuarios = NumeroDeUsuarios;
		this.UsuariosConectados = UsuariosConectados;
	}

	@Override
	public String getNumeroDeUsuarios() {
		// TODO Auto-generated method stub
		return NumeroDeUsuarios;
	}

	@Override
	public String getUsuariosConectados() {
		// TODO Auto-generated method stub
		return UsuariosConectados;
	}
	
}