package main;

import java.sql.SQLException;
import java.util.Scanner;

import controlador.ControladorConcurso;
import modelo.Categoria;
import modelo.Usuario;

public class Main {
	
	
	public static void main (String [] args) throws SQLException {
		Scanner entrada = new Scanner(System.in);
		Usuario usuario = new Usuario();
		inicioDelJuego(usuario, entrada);
		Categoria.escogerCategoriaAleatoria(usuario, entrada, 1);
		ControladorConcurso controladorConcurso = new ControladorConcurso();
		controladorConcurso.actualizarAcumuladoUsuario(usuario);
		System.out.println("Terminaste, este es tu acumulado: " + usuario.getAcumulado());
	}
	
	private static void inicioDelJuego(Usuario usuario, Scanner entrada) throws SQLException {
		System.out.println("Digite Su tipo de documento");
		usuario.setTipoDocumento(entrada.next());
		System.out.println("Digite Su número de documento");
		usuario.setNumeroDocumento(entrada.next());
		System.out.println("Digite Su nombre");
		usuario.setNombre(entrada.next());
		System.out.println("¡Empecemos!");
		ControladorConcurso controladorConcurso = new ControladorConcurso();
		controladorConcurso.insertarDatosInicialesUsuario(usuario);
	}
}
