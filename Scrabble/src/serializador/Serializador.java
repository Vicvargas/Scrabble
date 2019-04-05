package serializador;

import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import estructurasDeDatos.ListaEnlazadaSimple;
import estructurasDeDatos.Nodo;
import palabras.Letra;

public class Serializador {
	static ObjectMapper mapper = new ObjectMapper();
	
	public static <T> String serializar( ListaEnlazadaSimple Lista) throws IOException {
		Nodo <T> aux = Lista.getFirst();
		String json = "[";
		while (aux != null) {
			String jsonTemp = mapper.writerWithDefaultPrettyPrinter()
		            .writeValueAsString(aux.getData());
			System.out.println(aux.getData());
			aux = aux.getNext();
			json =json + jsonTemp;
		
				json = json+",";
			
			}
		json = json +"{}" +"]";
		System.out.println(json);
		
		Serializador.deserializar(json);
		

	return json;	
	
	}
	
	public static ArrayList<Letra> deserializar(String json) throws JsonParseException, JsonMappingException, IOException {
		ArrayList<Letra> objeto = mapper.readValue(json, new TypeReference<ArrayList<Letra>>(){});
		System.out.println(objeto);
		return objeto;
		
		
	}

	
}
