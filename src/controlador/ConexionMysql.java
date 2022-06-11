package controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConexionMysql {
	
	private final String base = "concursopreguntasyrespuestas";
	private final String usuario = "root";
	private final String contraseña = "";
	private final String url = "jdbc:mysql://localhost:3306/" + base;
	private Connection conexion = null;

	public Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conexion = (Connection) DriverManager.getConnection(this.url, this.usuario, this.contraseña);
		}catch (SQLException e) {
			System.err.println(e);
		} catch (ClassNotFoundException e) {
			Logger.getLogger(ConexionMysql.class.getName()).log(Level.SEVERE, null, e);
		}
		
		return conexion;
	}
}
