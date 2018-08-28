import java.sql.*;
public class ConexaoBD {
     
    private static ConexaoBD instancia = new ConexaoBD();
     
    private ConexaoBD()
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        }
        catch(ClassNotFoundException e )
        {
            e.printStackTrace();
        }
    }
     
    public static ConexaoBD getInstance() {
        return instancia;
    }
     
       public Connection getConnection(){
            Connection conexao;
			try {
				conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/produtos","root","password");
				return conexao;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} return null;
        }
}