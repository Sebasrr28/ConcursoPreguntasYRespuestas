package modelo;

public class Usuario {

	private String nombre;
	private String tipoDocumento;
	private String numeroDocumento;
	private int premioAcumulado = 0;
	private int ronda = 0;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTipoDocumento() {
		return tipoDocumento;
	}
	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}
	public String getNumeroDocumento() {
		return numeroDocumento;
	}
	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}
	public int getAcumulado() {
		return premioAcumulado;
	}
	public void setAcumulado(int premioAcumulado) {
		this.premioAcumulado = premioAcumulado;
	}
	public int getRonda() {
		return ronda;
	}
	public void setRonda(int ronda) {
		this.ronda = ronda;
	}
	
}
