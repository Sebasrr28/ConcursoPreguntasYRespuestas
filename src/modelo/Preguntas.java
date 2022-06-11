package modelo;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Preguntas {

	public enum enumPreguntas {
	
		HISTORIA1("�Qu� inici� la Segunda Guerra Mundial?", 1, 1, 1),
		HISTORIA2("�En qu� a�o descubri� Crist�bal Col�n, Am�rica?", 2, 1, 2),
		HISTORIA3("�De qu� nacionalidad era Adolf Hitler?", 3, 1, 3),
		HISTORIA4("�Qu� famosa batalla perdi� y dej� humillado a Napole�n Bonaparte?", 4, 1, 4),
		HISTORIA5("�De qu� nacionalidad era Ernesto Ch� Guevara?", 5, 1, 5),
		MUSICA1("�Qu� cantante es considerado El Rey del Rock and Roll?", 6, 2, 1),
		MUSICA2("�Qu� cantante es reconocido por �xitos como Thriller, Beat It y Smooth Criminal?", 7, 2, 2),
		MUSICA3("�Qu� famosa banda formaron Lennon, McCartney, Harrison y Starr?", 8, 2, 3),
		MUSICA4("�Qu� afamada cantante es conocida como La reina del pop?", 9, 2, 4),
		MUSICA5("�Cu�ntas cuerdas tiene un viol�n?", 10, 2, 5),
		MATEMATICAS1("Aproxima el n�mero 58 a la decena siguiente", 11, 3, 1),
		MATEMATICAS2("�Qu� n�mero resulta si divides 56 entre 7?", 12, 3, 2),
		MATEMATICAS3("Para calcular cu�nto es un tercio de 3996, �qu� tienes que hacer?", 13, 3, 3),
		MATEMATICAS4("�C�mo se llama el pol�gono de siete lados?", 14, 3, 4),
		MATEMATICAS5("�Cu�ntos metros es un hect�metro?", 15, 3, 5),
		PELICULAS1("�Cual es el objeto milagro en la pel�cula Encanto?", 16, 4, 1),
		PELICULAS2("�Como se llama la protagonista de brave?", 17, 4, 2),
		PELICULAS3("�A qu� se dedica Rocky?", 18, 4, 3),
		PELICULAS4("�De qu� festividad es Jack?", 19, 4, 4),
		PELICULAS5("�De qu� pelicula es el personaje de terror representado por un payaso?", 20, 4, 5),
		DEPORTE1("�Cu�nto dura un partido de f�tbol?", 21, 5, 1),
		DEPORTE2("�C�mo se llama la anotaci�n de un tanto en f�tbol americano?", 22, 5, 2),
		DEPORTE3("�Cu�nto pesa la bola de bolera?", 23, 5, 3),
		DEPORTE4("�En qu� deporte puedes hacer una tacada?", 24, 5, 4),
		DEPORTE5("�Cu�ntas horas debe dormir un deportista de �lite?", 25, 5, 5);
		
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
