package modelo;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Categoria {
	
	public enum enumCategoria {

		HISTORIA("Historia", 1),
		MUSICA("Musica", 2),
		MATEMATICAS("Matemáticas", 3),
		PELICULAS("Películas", 4),
		DEPORTE("Deporte", 5);
		
		enumCategoria (String nombreCategoria, int numeroCategoria) {
			this.nombreCategoria = nombreCategoria;
			this.numeroCategoria = numeroCategoria;
		}
		
		private String nombreCategoria;
		private int numeroCategoria;
		
		public String getNombreCategoria() {
			return nombreCategoria;
		}
	
		public int getNumeroCategoria() {
			return numeroCategoria;
		}
		
	
	}
	
	public static void escogerCategoriaAleatoria(Usuario usuario, Scanner entrada, int ronda) throws SQLException {
		List<enumCategoria> categorias = Collections.unmodifiableList(Arrays.asList(enumCategoria.values()));
		int tamano = categorias.size();
		Random random = new Random();
		enumCategoria categoriaElegida = categorias.get(random.nextInt(tamano));
		Preguntas.escogerPreguntaSegunLaCategoriaYLaRonda(categoriaElegida.getNumeroCategoria(), ronda, entrada, usuario);
	}
}