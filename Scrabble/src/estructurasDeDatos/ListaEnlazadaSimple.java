package estructurasDeDatos;

public class ListaEnlazadaSimple <T>{
	private int len;
	private Nodo <T> first;

	public ListaEnlazadaSimple() {
		len = 0;
		first = null;}

	public boolean isEmpty() {
		return this.first == null; }

	public int getLen() {
		return this.len;}

	public void addLast(T data) {
		Nodo <T> newNodo = new Nodo <T>();
		newNodo.setData(data);
		if(isEmpty()) {
			this.first = newNodo;
			len += 1;}
		else {
			Nodo <T> aux = this.first;
			while (aux.getNext()!= null) {
				aux = aux.getNext();}
			aux.setNext(newNodo);
			len+=1;
		}
	}
	
	
	public void deleteLast() {
		Nodo<T> aux = new Nodo<T>();
		aux = first;
		if(isEmpty() || len == 1 ) {
			first = null;
		}
		else {
			while(aux.getNext().getNext()!=null){
				aux = aux.getNext();
			}
		aux.setNext(null);
		}
		len--;
	}
	
	public void print() {
		Nodo <T> aux = this.first;
		while (aux!= null) {
			System.out.println(aux.getData());
			aux = aux.getNext();}
	}
}





