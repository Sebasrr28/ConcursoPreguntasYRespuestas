package modelo;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import controlador.ControladorConcurso;
import modelo.Preguntas.enumPreguntas;

public class Respuestas {

	public enum enumRespuestas {
		
		RESPUESTA1HISTORIA1("Alemania invadió Polonia", true, 1, 1),
		RESPUESTA2HISTORIA1("El asesinato del archiduque Francisco Fernando", false, 1, 2),
		RESPUESTA3HISTORIA1("Hitler invadió Austria.", false, 1, 3),
		RESPUESTA4HISTORIA1("Alemania invadió Colombia", false, 1, 4),
		RESPUESTA1HISTORIA2("1492", true, 2, 1),
		RESPUESTA2HISTORIA2("1592", false, 2, 2),
		RESPUESTA3HISTORIA2("1900", false, 2, 3),
		RESPUESTA4HISTORIA2("1705", false, 2, 4),
		RESPUESTA1HISTORIA3("Austriaca", true, 3, 1),
		RESPUESTA2HISTORIA3("Colombiana", false, 3, 2),
		RESPUESTA3HISTORIA3("Alemana", false, 3, 3),
		RESPUESTA4HISTORIA3("Española", false, 3, 1),
		RESPUESTA1HISTORIA4("Batalla de Waterloo", true, 4, 1),
		RESPUESTA2HISTORIA4("Batalla de Austerlitz", false, 4, 2),
		RESPUESTA3HISTORIA4("La campaña de Trafalgar", false, 4, 3),
		RESPUESTA4HISTORIA4("La batalla de Boyaca", false, 4, 4),
		RESPUESTA1HISTORIA5("Argentino", true, 5, 1),
		RESPUESTA2HISTORIA5("Colombiano", false, 5, 2),
		RESPUESTA3HISTORIA5("Cubano", false, 5, 3),
		RESPUESTA4HISTORIA5("Mexicano", false, 5, 4),
		RESPUESTA1MUSICA1("Elvis Presley", true, 6, 1),
		RESPUESTA2MUSICA1("Michael Jackson", false, 6, 2),
		RESPUESTA3MUSICA1("James Hetfield", false, 6, 3),
		RESPUESTA4MUSICA1("Robert Trujillo", false, 6, 4),
		RESPUESTA1MUSICA2("Michael Jackson", true, 7, 1),
		RESPUESTA2MUSICA2("Elvis Presley", false, 7, 2),
		RESPUESTA3MUSICA2("Beethoven", false, 7, 3),
		RESPUESTA4MUSICA2("Lennon", false, 7, 4),
		RESPUESTA1MUSICA3("The beatles", true, 8, 1),
		RESPUESTA2MUSICA3("Aerosmith", false, 8, 2),
		RESPUESTA3MUSICA3("PinkFloid", false, 8, 3),
		RESPUESTA4MUSICA3("Black Sabbath", false, 8, 4),
		RESPUESTA1MUSICA4("Madonna", true, 9, 1),
		RESPUESTA2MUSICA4("Shakira", false, 9, 2),
		RESPUESTA3MUSICA4("Belinda", false, 9, 3),
		RESPUESTA4MUSICA4("JLo", false, 9, 4),
		RESPUESTA1MUSICA5("4", true, 10, 1),
		RESPUESTA2MUSICA5("5", false, 10, 2),
		RESPUESTA3MUSICA5("3", false, 10, 3),
		RESPUESTA4MUSICA5("6", false, 10, 4),
		RESPUESTA1MATEMATICAS1("60", true, 11, 1),
		RESPUESTA2MATEMATICAS1("50", false, 11, 2),
		RESPUESTA3MATEMATICAS1("70", false, 11, 3),
		RESPUESTA4MATEMATICAS1("40", false, 11, 4),
		RESPUESTA1MATEMATICAS2("8", true, 12, 1),
		RESPUESTA2MATEMATICAS2("7", false, 12, 2),
		RESPUESTA3MATEMATICAS2("9", false, 12, 3),
		RESPUESTA4MATEMATICAS2("6", false, 12, 4),
		RESPUESTA1MATEMATICAS3("Dividir por 3", true, 13, 1),
		RESPUESTA2MATEMATICAS3("sumar 3", false, 13, 2),
		RESPUESTA3MATEMATICAS3("restar 3", false, 13, 3),
		RESPUESTA4MATEMATICAS3("Multiplicar por 3", false, 13, 4),
		RESPUESTA1MATEMATICAS4("Heptágono", true, 14, 1),
		RESPUESTA2MATEMATICAS4("Cuadrado", false, 14, 2),
		RESPUESTA3MATEMATICAS4("Triangulo", false, 14, 3),
		RESPUESTA4MATEMATICAS4("Septagono", false, 14, 4),
		RESPUESTA1MATEMATICAS5("10", false, 15, 1),
		RESPUESTA2MATEMATICAS5("1", false, 15, 2),
		RESPUESTA3MATEMATICAS5("100", true, 15, 3),
		RESPUESTA4MATEMATICAS5("50", false, 15, 4),
		RESPUESTA1PELICULAS1("Un paraguas", false, 16, 1),
		RESPUESTA2PELICULAS1("Un Plato", false, 16, 2),
		RESPUESTA3PELICULAS1("Una vela", true, 16, 3),
		RESPUESTA4PELICULAS1("Un cuadro", false, 16, 4),
		RESPUESTA1PELICULAS2("Minie Mouse", false, 17, 1),
		RESPUESTA2PELICULAS2("Merida", true, 17, 2),
		RESPUESTA3PELICULAS2("Bella", false, 17, 3),
		RESPUESTA4PELICULAS2("Blanca Nieves", false, 17, 4),
		RESPUESTA1PELICULAS3("Es un cocinero", false, 18, 1),
		RESPUESTA2PELICULAS3("Es un boxeador", true, 18, 2),
		RESPUESTA3PELICULAS3("Es un contador", false, 18, 3),
		RESPUESTA4PELICULAS3("Es un vendedor de casas", false, 18, 4),
		RESPUESTA1PELICULAS4("Pascua", false, 19, 1),
		RESPUESTA2PELICULAS4("Navidad", false, 19, 2),
		RESPUESTA3PELICULAS4("Amor y amistad", false, 19, 3),
		RESPUESTA4PELICULAS4("Halloween", true, 19, 4),
		RESPUESTA1PELICULAS5("Saw", false, 20, 1),
		RESPUESTA2PELICULAS5("It", true, 20, 2),
		RESPUESTA3PELICULAS5("Viernes 13", false, 20, 3),
		RESPUESTA4PELICULAS5("El resplandor", false, 20, 4),
		RESPUESTA1DEPORTE1("90 minutos", true, 21, 1),
		RESPUESTA2DEPORTE1("80 minutos", false, 21, 2),
		RESPUESTA3DEPORTE1("45 minutos", false, 21, 3),
		RESPUESTA4DEPORTE1("60 minutos", false, 21, 4),
		RESPUESTA1DEPORTE2("Touchdown", true, 22, 1),
		RESPUESTA2DEPORTE2("Gol", false, 22, 2),
		RESPUESTA3DEPORTE2("Canasta", false, 22, 3),
		RESPUESTA4DEPORTE2("Punto", false, 22, 4),
		RESPUESTA1DEPORTE3("3 a 7 kg", true, 23, 1),
		RESPUESTA2DEPORTE3("4 a 10 kg", false, 23, 2),
		RESPUESTA3DEPORTE3("2 a 8 kg", false, 23, 3),
		RESPUESTA4DEPORTE3("3 a 6 kg", false, 23, 4),
		RESPUESTA1DEPORTE4("Ajedrez", false, 24, 1),
		RESPUESTA2DEPORTE4("Billar", true, 24, 2),
		RESPUESTA3DEPORTE4("Waterpolo", false, 24, 3),
		RESPUESTA4DEPORTE4("Futbol Americano", false, 24, 4),
		RESPUESTA1DEPORTE5("10 a 13 horas", true, 25, 1),
		RESPUESTA2DEPORTE5("8 a 9 horas", false, 25, 2),
		RESPUESTA3DEPORTE5("5 a 9 horas", false, 25, 3),
		RESPUESTA4DEPORTE5("9 a 10 horas", false, 25, 4);
		
		private String respuesta;
		private boolean correcta;
		private int numeroPregunta;
		private int numeroRespuesta;
		
		enumRespuestas (String respuesta, boolean correcta, int numeroPregunta, int numeroRespuesta) {
			this.respuesta = respuesta;
			this.correcta = correcta;
			this.numeroPregunta = numeroPregunta;
			this.setNumeroRespuesta(numeroRespuesta);
		}
		
		public String getRespuesta() {
			return respuesta;
		}
		
		public boolean isCorrecta() {
			return correcta;
		}
	
		public int getNumeroPregunta() {
			return numeroPregunta;
		}
	
		public int getNumeroRespuesta() {
			return numeroRespuesta;
		}
	
		public void setNumeroRespuesta(int numeroRespuesta) {
			this.numeroRespuesta = numeroRespuesta;
		}
	
		
	}
	
	public static void obtenerRespuestaPorNumeroDePregunta(Scanner entrada, enumPreguntas pregunta, Usuario usuario, int ronda) throws SQLException {
		List<enumRespuestas> respuestas = Collections.unmodifiableList(Arrays.asList(enumRespuestas.values()));
		List<enumRespuestas> respuestasAmostrar = new ArrayList<>();
		for (enumRespuestas respuesta : respuestas) {
			if (respuesta.getNumeroPregunta() == pregunta.getNumeroPregunta()) {
				respuestasAmostrar.add(respuesta);
			}
		}
		
		for (enumRespuestas respuestaMostrar : respuestasAmostrar) {
			System.out.println(respuestaMostrar.getRespuesta());
		}
			
		System.out.println("Escribe el número de la respuesta correcta");
		int numeroRespuesta = entrada.nextInt();
			
		esResuestaCorrecta(usuario, ronda, respuestasAmostrar, numeroRespuesta, entrada);
		
	}

	private static void esResuestaCorrecta(Usuario usuario, int rondaActual, List<enumRespuestas> respuestasAmostrar,
			int numeroRespuesta, Scanner entrada) throws SQLException {
		for (enumRespuestas respuestaMostrada : respuestasAmostrar) {
			if(respuestaMostrada.getNumeroRespuesta() == numeroRespuesta && respuestaMostrada.isCorrecta()) {
				ControladorConcurso controladorConcurso = new ControladorConcurso();
				controladorConcurso.actualizarAcumuladoUsuario(usuario);
				Ronda.avanzaRonda(usuario, rondaActual, entrada);
			}
		}
	}
}
