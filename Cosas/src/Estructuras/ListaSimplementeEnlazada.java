package Estructuras;

public class ListaSimplementeEnlazada <E extends Comparable>{
	private NodoL<E> head;
	
	public NodoL<E> getHead(){
		return head;
	}
	

	
	public void setHead(NodoL<E> h) {
		head = h;
	}
	
	public ListaSimplementeEnlazada(NodoL<E> h) {
		super();
		this.head = h;
	}
	
	public boolean isEmpty() {
		return head==null;
	}
	
	public int length(){
		int i=0;
		NodoL<E> temp=head;
		while(temp!=null) {
			temp=temp.getNext();
			i++;
		}
		return i;
	}
	
	public void add(E n) {
		NodoL<E> newNodo=null;
		if(head!=null) {
			newNodo = new NodoL<E>(head.getInfo());
			newNodo.setNext(head.getNext());
		}
		head.setInfo(n);
		head.setNext(newNodo);
	}
	
	public static void main(String[] args) {
		ListaSimplementeEnlazada l = new ListaSimplementeEnlazada(null);
	}
	
	
}

