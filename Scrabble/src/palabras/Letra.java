package palabras;

public class Letra {
	public Letra() {}
	public Letra(int puntaje, String letra) {
		super();
		this.puntaje = puntaje;
		this.letra = letra;
	}
	private int puntaje;
	public int getPuntaje() {
		return puntaje;
	}
	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}
	public String getLetra() {
		return letra;
	}
	public void setLetra(String letra) {
		this.letra = letra;
	}
	private String letra;

}
