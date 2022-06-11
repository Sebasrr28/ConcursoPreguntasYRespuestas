package modelo;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Preguntas {

	public enum enumPreguntas {
	
		HISTORIA1("¿Qué inició la Segunda Guerra Mundial?", 1, 1, 1),
		HISTORIA2("¿En qué año descubrió Cristóbal Colón, América?", 2, 1, 2),
		HISTORIA3("¿De qué nacionalidad era Adolf Hitler?", 3, 1, 3),
		HISTORIA4("¿Qué famosa batalla perdió y dejó humillado a Napoleón Bonaparte?", 4, 1, 4),
		HISTORIA5("¿De qué nacionalidad era Ernesto Ché Guevara?", 5, 1, 5),
		MUSICA1("¿Qué cantante es considerado El Rey del Rock and Roll?", 6, 2, 1),
		MUSICA2("¿Qué cantante es reconocido por éxitos como Thriller, Beat It y Smooth Criminal?", 7, 2, 2),
		MUSICA3("¿Qué famosa banda formaron Lennon, McCartney, Harrison y Starr?", 8, 2, 3),
		MUSICA4("¿Qué afamada cantante es conocida como La reina del pop?", 9, 2, 4),
		MUSICA5("¿Cuántas cuerdas tiene un violín?", 10, 2, 5),
		MATEMATICAS1("Aproxima el número 58 a la decena siguiente", 11, 3, 1),
		MATEMATICAS2("¿Qué número resulta si divides 56 entre 7?", 12, 3, 2),
		MATEMATICAS3("Para calcular cuánto es un tercio de 3996, ¿qué tienes que hacer?", 13, 3, 3),
		MATEMATICAS4("¿Cómo se llama el polígono de siete lados?", 14, 3, 4),
		MATEMATICAS5("¿Cuántos metros es un hectómetro?", 15, 3, 5),
		PELICULAS1("¿Cual es el objeto milagro en la película Encanto?", 16, 4, 1),
		PELICULAS2("¿Como se llama la protagonista de brave?", 17, 4, 2),
		PELICULAS3("¿A qué se dedica Rocky?", 18, 4, 3),
		PELICULAS4("¿De qué festividad es Jack?", 19, 4, 4),
		PELICULAS5("¿De qué pelicula es el personaje de terror representado por un payaso?", 20, 4, 5),
		DEPORTE1("¿Cuánto dura un partido de fútbol?", 21, 5, 1),
		DEPORTE2("¿Cómo se llama la anotación de un tanto en fútbol americano?", 22, 5, 2),
		DEPORTE3("¿Cuánto pesa la bola de bolera?", 23, 5, 3),
		DEPORTE4("¿En qué deporte puedes hacer una tacada?", 24, 5, 4),
		DEPORTE5("¿Cuántas horas debe dormir un deportista de élite?", 25, 5, 5);
		
		private String pregunta;
		private int numeroPregunta;
		private int numeroCategoria;
		private int dificultad;
		
		
		enumPreguntas (String pregunta, int numeroPregunta,
					int numeroCategoria, int dificultad) {
			this.pregunta = pregunta;
			this.numeroPregunta = numeroPregunta;
			this.numeroCategoria = numeroCategoria;
			this.dificultad = dificultad;
			
		}
		
		public String getPregunta() {
			return pregunta;
		}
	
		public int getNumeroPregunta() {
			return numeroPregunta;
		}
	
		public int getNumeroCategoria() {
			return numeroCategoria;
		}
	
		public int getDificultad() {
			return dificultad;
		}
		
	}
	
	public static void escogerPreguntaSegunLaCategoriaYLaRonda(int categoria, int ronda, Scanner entrada, Usuario usuario) throws SQLException {
		List<enumPreguntas> preguntas = Collections.unmodifiableList(Arrays.asList(enumPreguntas.values()));
		for (enumPreguntas pregunta : preguntas) {
			if(pregunta.getNumeroCategoria() == categoria && pregunta.getDificultad() == ronda) {
				System.out.println(pregunta.getPregunta());
				Respuestas.obtenerRespuestaPorNumeroDePregunta(entrada, pregunta, usuario, ronda);
			}
				
		}
		
	}
}
