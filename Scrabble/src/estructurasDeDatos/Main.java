package estructurasDeDatos;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;

import palabras.Letra;
import serializador.Serializador;

public class Main {
	public static <T> void main(String[] args) throws IOException {
		ListaEnlazadaSimple <Letra> l = new ListaEnlazadaSimple<Letra>();
		l.addLast(new Letra(1,"A"));
		l.addLast(new Letra(2,"B"));
		l.addLast(new Letra(3,"C"));
		l.print();
		Serializador.serializar(l);
		
	}
}



