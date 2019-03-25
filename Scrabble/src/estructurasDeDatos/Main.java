package estructurasDeDatos;

public class Main {
	public static <T> void main(String[] args) {
		ListaEnlazadaSimple <Integer> l = new ListaEnlazadaSimple<Integer>();
		l.addLast(1);
		l.addLast(2);
		l.addLast(3);
		l.addLast(4);
		l.deleteLast();
		l.print();
		
	}
}



