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
	
	
	public boolean swapNodo(int i, int j) {
		NodoL<E> A = getNodo(i);
		NodoL<E> B = getNodo(j);
		
		System.out.println("A.info: " + A.getInfo());
		System.out.println("B.info: " + B.getInfo());
		
		if(A!= null && B!=null) {
			//intercambio
			NodoL<E> temp = new NodoL<E>(null);
			temp.setInfo(A.getInfo());
			System.out.println("temp.info: " + temp.getInfo());
			A.setInfo(B.getInfo());
			System.out.println("A.info: " + A.getInfo());
			System.out.println("B.info: " + B.getInfo());
			B.setInfo(temp.getInfo());
			return true;
		}else {
			return false;
		}
	}
	
	public NodoL<E> getNodo(E x){
		NodoL<E> temp=head;
		boolean found = false;
		while(temp!=null && found == false) {
			if(((Comparable<E>) temp.getInfo()).compareTo(x)==0) {
				found = true;
			}else {
				temp=temp.getNext();
			}
		}
		return temp;
	}
	
	public NodoL<E> getNodo(int i){
		int k=0;
		NodoL<E> temp=head;
		while(temp!=null && k<i) {
			temp.getNext();
			k++;
		}
		return temp;
	}
	
	
	public boolean deleteNodo(E x) {
		NodoL<E> temp=head;
		NodoL<E> ant = null;
		//Si encuentra la cabeza?
		while(temp!=null && ((Comparable<E>) temp.getInfo()).compareTo(x)!=0) {
			ant = temp;			
			temp = temp.getNext();
		}
		
		if(temp!=null) {
			if(ant==null) {
				head = head.getNext();
			}else {
				ant.setNext(temp.getNext());
			}
			return true;
		}
		return false;

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
	
	public void printList() {
		NodoL<E> temp = head;
		while(temp!=null) {
			System.out.println(temp.getInfo());
			temp = temp.getNext();
		}
	}
	
	public static void main(String[] args) {

		
		//NODOS
		NodoL<Integer> n1 = new NodoL<Integer>(1);
		NodoL<Integer> n2 = new NodoL<Integer>(2);
		NodoL<Integer> n3 = new NodoL<Integer>(3);
		NodoL<Integer> n4 = new NodoL<Integer>(4);
		
		n1.setNext(n2);
		n2.setNext(n3);
		n3.setNext(n4);
		
		ListaSimplementeEnlazada l = new ListaSimplementeEnlazada(n1);
		
		l.printList();
		
		l.swapNodo(1, 3);
		System.out.println("///");
		l.printList();
	}
	
	
}

