package arboles2;

import java.util.LinkedList;

public class NodoN <E> {
	private E llave; //Identificador de nodos
	private LinkedList <NodoN<E>> hijos;
	private int i=-1;
	
	//Constructor
	public NodoN(E llave){
		this.llave = llave;
	}

	
	public NodoN getNextHijo(){
		i++;
		if(i<hijos.size()) {
			return hijos.get(i);
		}else {
			return null;
		}
	}
	
	public void setHijoD(NodoN<E> h){
		hijos.add(h);
	}
	
	
	public E getllave(){
		return llave;
	}	
	
	@Override
	public String toString(){
		return null;
	}
}

