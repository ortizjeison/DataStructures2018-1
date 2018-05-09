package AVL;

public class Nodo<E extends Comparable<E>> {
	private E llave;
	private Nodo<E> hijoIzq;
	private Nodo<E> hijoDer;
	private Nodo<E> padre;
	
	public int alturaNodo() {
		return alturaNodoR(this);
	}

	public int alturaNodoR(Nodo<E> n) {
		if (n == null) {
			return -1;
		}
		int altDer = (n.getHijoDer() == null) ? 0 : 1 + alturaNodoR(n.getHijoDer());
		int altIzq = (n.getHijoIzq() == null) ? 0 : 1 + alturaNodoR(n.getHijoIzq());
		return Math.max(altDer, altIzq);
	}

	public int FE() {
		return alturaNodoR(this.getHijoDer()) - alturaNodoR(this.getHijoIzq());
	}

	public Nodo(E llave) {
		this.llave = llave;
		padre = null;
		hijoIzq = null;
		hijoDer = null;
	}

	public Nodo(E llave, Nodo<E> hijoIzq, Nodo<E> hijoDer, Nodo<E> padre) {
		this.llave = llave;
		this.hijoIzq = hijoIzq;
		this.hijoDer = hijoDer;
		this.padre = padre;
	}

	public E getLlave() {
		return llave;
	}

	public void setLlave(E llave) {
		this.llave = llave;
	}

	public Nodo<E> getHijoIzq() {
		return hijoIzq;
	}

	public void setHijoIzq(Nodo<E> hijoIzq) {
		if (hijoIzq != null) {
			hijoIzq.setPadre(this);
		}
		this.hijoIzq = hijoIzq;
	}

	public Nodo<E> getHijoDer() {
		return hijoDer;
	}

	public void setHijoDer(Nodo<E> hijoDer) {
		if (hijoDer != null) {
			hijoDer.setPadre(this);
		}
		this.hijoDer = hijoDer;
	}

	public Nodo<E> getPadre() {
		return padre;
	}

	public void setPadre(Nodo<E> padre) {
		this.padre = padre;
	}

	

	@Override
	public String toString() {
		String HI = (hijoIzq == null) ? "null" : hijoIzq.getLlave().toString();
		String HD = (hijoDer == null) ? "null" : hijoDer.getLlave().toString();
		return llave.toString() + "(" + HI + "," + HD + ")";
	}

}

