package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import modelo.Usuario;

public class ControladorConcurso extends ConexionMysql{

	public void insertarDatosInicialesUsuario (Usuario usuario) throws SQLException {
		PreparedStatement  ps = null;
		Connection conexion = getConnection();
		String query = "insert into usuario (nombre, tipoDocumento, numeroDocumento, premioAcumulado) values ('"+usuario.getNombre()+"','"+usuario.getTipoDocumento()+"','"+usuario.getNumeroDocumento()+"',"+usuario.getAcumulado()+")";
		ps = conexion.prepareStatement(query);
		ps.execute();
	}
	
	public void actualizarAcumuladoUsuario(Usuario usuario) throws SQLException {
		PreparedStatement  ps = null;
		Connection conexion = getConnection();
		String query = "update usuario set premioAcumulado = '"+usuario.getAcumulado()+"' where tipoDocumento = '"+usuario.getTipoDocumento()+"' and numeroDocumento = '"+usuario.getNumeroDocumento()+"'";
		ps = conexion.prepareStatement(query);
		ps.execute();
	}
	
}
