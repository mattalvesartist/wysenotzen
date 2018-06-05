package sharecards.model;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.sql.ResultSet;
import java.sql.SQLException;

public interface UsuarioDAO {

		public void insereUsuario(Usuario u) throws ClassNotFoundException, SQLException;
		
		public int removeUsuario(String codigoUsuario) throws ClassNotFoundException, SQLException;
		
		public ResultSet consultaUsuario(String codigoUsuario) throws ClassNotFoundException, SQLException;
		
		public boolean validaLogin(String email, String senha) throws SQLException;
		
		public Usuario retornaUsuario(String email, String senha) throws ClassNotFoundException, SQLException, NoSuchAlgorithmException, NoSuchProviderException, UnsupportedEncodingException;
		
		public void alteraSenha(String email, String senha) throws SQLException;
		
		public void mostrarPerfil(Usuario u) throws SQLException;
}
