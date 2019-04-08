package palabras;

import java.util.ArrayList;

public class Palabra {
	
	
	
	public static String getVAlor(ArrayList<Letra> palabra) {
		String valor = "";
		for(int i=0;i<palabra.size()-1;i++) {
			valor = valor + palabra.get(i).getLetra();
			
		}
		
		return valor;
		
		
	}
	public static int getPuntaje(ArrayList<Letra> palabra) {
		int puntaje = 0;
		for(int i=0;i<palabra.size()-1;i++) {
			
			puntaje = puntaje + palabra.get(i).getPuntaje();
		}
		
		
		return puntaje;
	}

}
