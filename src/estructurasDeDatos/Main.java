package estructurasDeDatos;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;

import palabras.Letra;
import palabras.Palabra;
import serializador.Serializador;

public class Main {
	public static <T> void main(String[] args) throws IOException {
		ListaEnlazadaSimple <Letra> l = new ListaEnlazadaSimple<Letra>();
		l.addLast(new Letra("A"));
		l.addLast(new Letra("B"));
		l.addLast(new Letra("C"));
		Serializador.serializar(l);
		Palabra p = new Palabra();
		p.getVAlor(Serializador.deserializar(Serializador.serializar(l)));
		p.getPuntaje(Serializador.deserializar(Serializador.serializar(l)));
	}
}



