package modelo;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ronda {

	public enum enumRonda {

		RONDA1(1, 10),
		RONDA2(2, 50),
		RONDA3(3, 150),
		RONDA4(4, 400),
		RONDA5(5, 1000);
		
		enumRonda (int numeroDeronda, int premio) {
			this.numeroDeronda = numeroDeronda;
			this.premio = premio;
		}
		
		private int numeroDeronda;
		private int premio;
		
		public int getNumeroDeronda() {
			return numeroDeronda;
		}
		
		public int getPremio() {
			return premio;
		}
			
		
	}
	
	public static void  avanzaRonda(Usuario usuario, int ronda, Scanner entrada) throws SQLException {
		List<enumRonda> rondas = Collections.unmodifiableList(Arrays.asList(enumRonda.values()));
		for (enumRonda rondaActual : rondas) {
			if (rondaActual.getNumeroDeronda() == ronda) {
				usuario.setAcumulado(usuario.getAcumulado() + rondaActual.getPremio());
				System.out.println("Este es tu acumulado: " + usuario.getAcumulado()+ ".");
				if(ronda<5) {
					System.out.println("Vamos a la siguiente Ronda");
				}
			}
		}
		Categoria.escogerCategoriaAleatoria(usuario, entrada, ronda+1);
	}
}