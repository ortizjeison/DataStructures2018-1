package AVL;

public class Arbol<E extends Comparable<E>> {
	protected Nodo<E> raiz;

	public Nodo<E> getRaiz() {
		return raiz;
	}

	public void setRaiz(Nodo<E> raiz) {
		this.raiz = raiz;
	}

	public Arbol(Nodo<E> raiz) {
		this.raiz = raiz;
	}

	public void preorden() {
		preorden(this.raiz);
		System.out.println();
	}
	
	
	

	public void preorden(Nodo<E> raiz) {
		if (raiz == null) {
			
		} else {
			System.out.print(raiz.toString() + " ");
			preorden(raiz.getHijoIzq());
			preorden(raiz.getHijoDer());
		}
	}

	public void postorden() {
		postorden(this.raiz);
	}

	public void postorden(Nodo<E> raiz) {
		if (raiz == null) {
			
		} else {

			postorden(raiz.getHijoIzq());
			postorden(raiz.getHijoDer());
			System.out.print(raiz.toString() + " ");
		}
	}
	
	
	
	
	

	public void inorden() {
		inorden(this.raiz);
	}

	public void inorden(Nodo<E> raiz) {
		if (raiz == null) {
			
		} else {

			postorden(raiz.getHijoIzq());
			System.out.print(raiz.toString() + " ");
			postorden(raiz.getHijoDer());
		}
	}
}