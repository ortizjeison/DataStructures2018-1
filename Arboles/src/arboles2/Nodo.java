package arboles2;

public class Nodo <E> {
	private E llave; //Identificador de nodos
	private Nodo<E> HijoI;
	private Nodo<E> HijoD;
	
	//Constructor
	public Nodo(E llave, Nodo<E> hijoI, Nodo<E> hijoD){
		this.llave = llave;
		this.HijoD = hijoD;
		this.HijoI = hijoI;
	}
	
	public Nodo(E llave){
		this.llave = llave;
	}
	
	public Nodo getHijoI(){
		return HijoI;
	}
	
	public Nodo getHijoD(){
		return HijoD;
	}
	
	public void setHijoD(Nodo<E> h){
		HijoD = h;
	}
	
	public void setHijoI(Nodo<E> h){
		HijoI = h;
	}
	
	
	public E getllave(){
		return llave;
	}	
	
	@Override
	public String toString(){
		String HI=(HijoI==null)? "null":HijoI.getllave().toString();
		String HD=(HijoD==null)? "null":HijoD.getllave().toString();
		return((Comparable<E>)llave).toString()+"("+HI+","+HD+") ";		
	}
}

