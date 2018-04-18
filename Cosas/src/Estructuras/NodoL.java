package Estructuras;

public class NodoL <E>{
	private E info;
	private NodoL<E> next;
	
	
	public E getInfo() {
		return info;
	}
	
	public void setInfo(E info) {
		this.info = info;
	}
	
	public NodoL<E> getNext(){
		return next;
	}
	
	public  void setNext(NodoL<E> n) {
		next = n;
	}
	
	public NodoL(E info) {
		super();
		this.info = info;
		next = null;
	}
	
	public String toString() {
		return "info: " + info + " / next: " + next;
		
	}
}
