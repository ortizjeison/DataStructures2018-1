package AVL;

public class AVL<E extends Comparable<E>> extends ABB<E> {

	public AVL(Nodo<E> raiz) {
		super(raiz);
		// TODO Auto-generated constructor stub
	}

	public Nodo<E> desbalance(Nodo<E> n) {
		Nodo<E> nodo = n;
		while (nodo != null && Math.abs(nodo.FE()) <= 1) {
			nodo = nodo.getPadre();
		}
		return nodo;
	}
	
	


	public Nodo<E> rotSimpleDer(Nodo<E> n) {
		Nodo<E> izq = n.getHijoIzq();
		izq.setPadre(n.getPadre());
		n.setHijoIzq(izq.getHijoDer());
		izq.setHijoDer(n);
		return izq;
	}

	public Nodo<E> rotSimpleIzq(Nodo<E> n) {
		Nodo<E> der = n.getHijoDer();
		der.setPadre(n.getPadre());
		n.setHijoDer(der.getHijoIzq());
		der.setHijoDer(n);
		return der;
	}

	public Nodo<E> balanceDobleIzqDer(Nodo<E> n) {
		n.setHijoIzq(rotSimpleIzq(n.getHijoIzq()));
		return rotSimpleDer(n);
	}

	public Nodo<E> balanceDobleDerIzq(Nodo<E> n) {
		n.setHijoDer(rotSimpleDer(n.getHijoDer()));
		return rotSimpleIzq(n);
	}


	public void insertarNodo(Nodo<E> nodo) throws Exception {
		super.insertarNodo(nodo.getLlave());
		balancear(nodo);
	}


	public Nodo<E> balancear(Nodo<E> n) {
		Nodo<E> desb = desbalance(n);
		if (desb != null) {
			Nodo<E> p = desb.getPadre();
			if (desb.FE() > 0) {
				if (desb.getHijoDer().FE() >= 0) { // Caso Simple Izq + e hijo
													// Der
					desb = rotSimpleIzq(desb);
				} else { // Caso DobleIzq + eDer
					desb = balanceDobleDerIzq(desb);
				}
			} else {
				if (desb.FE() < 0) {
					if (desb.getHijoIzq().FE() <= 0) { // Caso SimpreDerFE - e
														// HijoDER
						desb = rotSimpleDer(desb);
					} else { // Caso DobleDEr FE - e HijoIz
						desb = balanceDobleIzqDer(desb);
					}
				}
			}
			if (p == null) {
				raiz = desb;

			} else {
				if (desb.getLlave().compareTo(p.getLlave()) > 0) {
					p.setHijoDer(desb);
				} else {
					p.setHijoIzq(desb);
				}
			}
			return null;
		} else {
			return null;
		}
	}
	
	public void delete(E llave) throws Exception {
		Nodo<E> n = buscar(llave);
		Nodo<E> padre = n.getPadre();
		
		if(n.getHijoDer()!=null && n.getHijoIzq()!=null) {
			//Si tiene dos hijos:
			padre = antecesorR(n).getPadre();
		}
		super.eliminarNodo(llave);
		
		if(padre==null) {
			balancear(raiz);
		}else {
			while(padre!=null) {
				balancear(padre);
				padre=padre.getPadre();
			}
		}
	}
	
	public static void main(String[] args) throws Exception{
		Nodo<Integer> n9 = new Nodo<Integer>(9);
		Nodo<Integer> n10 = new Nodo<Integer>(10);
		Nodo<Integer> n12 = new Nodo<Integer>(12);
		Nodo<Integer> n13 = new Nodo<Integer>(13);
		Nodo<Integer> n8 = new Nodo<Integer>(8);
		Nodo<Integer> n3 = new Nodo<Integer>(3);
		Nodo<Integer> n2 = new Nodo<Integer>(2);
		Nodo<Integer> n6 = new Nodo<Integer>(6);
		Nodo<Integer> n1 = new Nodo<Integer>(1);
		Nodo<Integer> n5 = new Nodo<Integer>(5);
		Nodo<Integer> n7 = new Nodo<Integer>(7);
		Nodo<Integer> n4 = new Nodo<Integer>(4);
		
		
		
		AVL<Integer> av = new AVL<Integer>(n8);
		av.insertarNodo(n3);
		av.insertarNodo(n12);
		av.insertarNodo(n2);
		av.insertarNodo(n9);
		av.insertarNodo(n6);
		av.insertarNodo(n13);
		av.insertarNodo(n10);
		av.insertarNodo(n1);
		av.insertarNodo(n5);
		av.insertarNodo(n7);
		av.insertarNodo(n4);
		
		av.preorden();
		
		av.delete(n13.getLlave());
		
		System.out.println("DELETE 13:");
		
		av.preorden();
		
		
		
		
//		System.out.println("Balanceo...");
//		av.balancear(n1);
//		av.preorden();
		
	
		//
		
		av.preorden();
		System.out.println("Balanceo");
		av.balancear(n1);
		av.preorden();
		
	}
}