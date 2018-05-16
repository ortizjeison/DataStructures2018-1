package AVL;

import java.util.ArrayList;

public class ABB<E extends Comparable<E>> extends Arbol<E> {

	public ABB(Nodo<E> raiz) {
		super(raiz);
	}

	public Nodo<E> buscar(E llave) throws Exception {
		return buscar(llave, raiz);
	}

	public Nodo<E> buscar(E llave, Nodo<E> raiz) throws Exception {
		if (raiz == null) {
			throw new Exception("El nodo no existe");
		}
		if (llave.compareTo(raiz.getLlave()) < 0) {
			return buscar(llave, raiz.getHijoIzq());
		}
		if (llave.compareTo(raiz.getLlave()) > 0) {
			return buscar(llave, raiz.getHijoDer());
		}
		return raiz;
	}

	public Nodo<E> insertarNodo(E llave) throws Exception {
		raiz = insertarNodoR(llave, raiz);
		return raiz;

	}

	public Nodo<E> insertarNodoR(E llave, Nodo<E> raiz1) throws Exception {
		if (raiz1 == null) {
			raiz1 = new Nodo<E>(llave);
		} else {
			if (llave.compareTo(raiz1.getLlave()) < 0) {
				raiz1.setHijoIzq(insertarNodoR(llave, raiz1.getHijoIzq()));
			}
			if (llave.compareTo(raiz1.getLlave()) > 0) {
				raiz1.setHijoDer(insertarNodoR(llave, raiz1.getHijoDer()));
			}
			if (llave.compareTo(raiz1.getLlave()) == 0) {
				throw new Exception("El nodo esta repetido");
			}
		}
		return raiz1;
	}

	public Nodo<E> sucesor(Nodo<E> nodo) throws Exception {
		if (nodo.getHijoIzq() == null) {
			throw new Exception("Error en algoritmo, el nodo no tiene predecesor");
		} else {
			return sucesorR(nodo);
		}
	}

	private Nodo<E> sucesorR(Nodo<E> raiz) throws Exception {
		if (raiz.getHijoDer() == null) {
			return raiz;
		} else {
			return sucesorR(raiz.getHijoDer());
		}
	}

	public Nodo<E> antecesor(Nodo<E> nodo) throws Exception {
		if (nodo.getHijoIzq() == null) {
			throw new Exception("Error en algoritmo, el nodo no tiene antecesor");
		} else {
			return antecesorR(nodo);
		}
	}

	public Nodo<E> antecesorR(Nodo<E> nodo) {
		if (nodo.getHijoIzq() == null) {
			return nodo;
		} else {
			return antecesorR(nodo.getHijoIzq());
		}
	}
	
	public ArrayList<E> getNivel(int n){
		if(n>=0) {
			ArrayList<E> llaves = new ArrayList<E>();
			getNivel(llaves,raiz,n);
			return llaves;
		}else {
			return null;
		}
		
	}
	
	public ArrayList<E> getNivel(ArrayList<E> llaves, Nodo<E> N, int n) {
		if(n==0) {
			llaves.add(N.getLlave());
			return llaves;
		}else {
			getNivel(llaves,N.getHijoIzq(),n-1);
			getNivel(llaves,N.getHijoDer(),n-1);
		}
		return llaves;
	}

	public void eliminarNodo(E llave) throws Exception {
		raiz = eliminarR(llave, raiz);

	}

	public Nodo<E> eliminarR(E llave, Nodo<E> raiz) throws Exception {
		if (raiz == null) {
			throw new Exception("No se encuentra el nodo");
		} else {
			if (llave.compareTo(raiz.getLlave()) < 0) {
				raiz.setHijoIzq(eliminarR(llave, raiz.getHijoIzq()));
			} else {
				if (llave.compareTo(raiz.getLlave()) > 0) {
					raiz.setHijoDer(eliminarR(llave, raiz.getHijoDer()));
				} else {
					if (llave.compareTo(raiz.getLlave()) == 0) {
						// Caso 3
						if (raiz.getHijoDer() != null && raiz.getHijoIzq() != null) {
							Nodo<E> antecesor = antecesor(raiz);
							raiz.setLlave(antecesor.getLlave());
							raiz.setHijoIzq(eliminarR(antecesor.getLlave(), raiz.getHijoIzq()));

						} else {
							// caso2 o caso 1
							if (raiz.getHijoDer() != null) {
								raiz = raiz.getHijoDer();
							} else {
								raiz = raiz.getHijoIzq();
							}
						}
					}
				}
			}
		}
		return raiz;
	}

	/*
	 * public int alturaNodo(E llave) { return alturaNodoR(llave, raiz, 1); }
	 * 
	 * 
	 * public int alturaNodoR(E llave, Nodo<E> raiz, int i) { if (llave ==
	 * raiz.getLlave()) { return i; } else { if
	 * (llave.compareTo(raiz.getLlave()) < 0) { return alturaNodoR(llave,
	 * raiz.getHijoIzq(), i + 1); } if (llave.compareTo(raiz.getLlave()) > 0) {
	 * return alturaNodoR(llave, raiz.getHijoDer(), i + 1); } } return i; }
	 * 
	 * public int alturaArbol(ABB<E> arbol) { return
	 * alturaArbolR(arbol.getRaiz()); }
	 * 
	 * public static int alturaArbolR(Nodo raiz) { if (raiz == null) { return 0;
	 * } else { int hojasIzq = alturaArbolR(raiz.getHijoIzq()); int hojasDer =
	 * alturaArbolR(raiz.getHijoDer()); return Math.max(hojasIzq, hojasDer) + 1;
	 * }
	 * 
	 * }
	 */
	public int contarHojas() {
		return cantidadHojasR(raiz);
	}

	public int cantidadHojasR(Nodo<E> raiz) {
		if (raiz == null) {
			return 0;
		}
		if (raiz.getHijoDer() == null && raiz.getHijoIzq() == null) {
			return 1;
		}
		return cantidadHojasR(raiz.getHijoDer()) + cantidadHojasR(raiz.getHijoIzq());
	}


	 public static void main(String[] args) throws Exception {
		 
		Nodo<Integer> n1 = null;
	 	ABB<Integer> arbolito = new ABB<Integer>(n1);
	  
	 
	 	arbolito.insertarNodo(12); 
		arbolito.insertarNodo(6);
		arbolito.insertarNodo(15); 
		arbolito.insertarNodo(9);
		arbolito.insertarNodo(7); 
		arbolito.insertarNodo(3);
	  

	  
	  }

}
