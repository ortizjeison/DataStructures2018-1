package arboles2;


public class abb<E extends Comparable> extends Arbol<E> {

	public abb(Nodo<E> raiz) {
		super(raiz);
		// TODO Auto-generated constructor stub
	}
	
	public Nodo<E> buscar(E llave){
		return buscar(raiz,llave);
		
	}
	
	public Nodo<E> buscar(Nodo <E> r, E llave){
		if(r==null)
			//throw new ExceptionNodo("Not found");
		if(llave.compareTo(r.getllave())<0)
			return buscar(r.getHijoI(),llave);
		
		if(llave.compareTo(r.getllave())>0)
			return buscar(r.getHijoD(), llave);
		
		return (Nodo<E>) r.getllave();
	}
	
	
	public Nodo<E> insertar(E llave){
		return buscar(raiz,llave);
		
	}
	
	public Nodo<E> insertar(Nodo <E> r, E llave){
		if(r==null);
			//throw new ExceptionNodo("Not found");
		if(llave.compareTo(r.getllave())<0)
			return buscar(r.getHijoI(),llave);
		
		if(llave.compareTo(r.getllave())>0)
			return buscar(r.getHijoD(), llave);
		
		return (Nodo<E>) r.getllave();
		
	}
	
	public static int alturaNodo(Nodo<Integer> nodo) {
		
		int altura = 0;
		
		//Por definición
		if(nodo==null){
			altura = -1;
		}
		else{
			int alturaIzq = alturaNodo(nodo.getHijoI());
			int alturaDer = alturaNodo(nodo.getHijoD());
			altura = 1 + Math.max(alturaIzq, alturaDer);
		}
		return altura;
	}
	

	//Crear árbol desde preorden, inorden
	
	public static void main(String[] args){
		
		Nodo<Integer> n1 = new Nodo<Integer>(1);
		Nodo<Integer> n2 = new Nodo<Integer>(2);
		Nodo<Integer> n3 = new Nodo<Integer>(3);
		Nodo<Integer> n4 = new Nodo<Integer>(4);
		Nodo<Integer> n5 = new Nodo<Integer>(5);
		Nodo<Integer> n6 = new Nodo<Integer>(6);
		Nodo<Integer> n7 = new Nodo<Integer>(7);
		Nodo<Integer> n8 = new Nodo<Integer>(8);
		Nodo<Integer> n9 = new Nodo<Integer>(9);
		Nodo<Integer> n10 = new Nodo<Integer>(10);

		n1.setHijoI(n2);
		n1.setHijoD(n5);
		n5.setHijoD(n6);
		n2.setHijoI(n3);
		n2.setHijoD(n4);
		n3.setHijoI(n7);
		n4.setHijoI(n8);
		n7.setHijoD(n10);
		n8.setHijoD(n9);
		
				
		Arbol<Integer> abb=new abb<Integer>(n1);
		//System.out.println("Preorden");
		abb.preorden();
		System.out.println("Inorden ");
		System.out.println();
		abb.inorden();
		
		//System.out.println(alturaNodo(n1));
		//System.out.println("Cantidad hojas= "+abb.cantidadHojas());
		
		
	
	}
	
}
