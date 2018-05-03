package arboles2;


public class abb<E extends Comparable> extends Arbol<E> {

	public abb(Nodo<E> raiz) {
		super(raiz);
		// TODO Auto-generated constructor stub
	}
	
	public Nodo<E> buscar(E llave) throws Exception{
		return buscar(raiz,llave);
		
	}
	
	public Nodo<E> buscar(Nodo <E> r, E llave) throws Exception{
		if(r==null)
			throw new Exception("Not found");
		if(llave.compareTo(r.getllave())<0)
			return buscar(r.getHijoI(),llave);
		
		if(llave.compareTo(r.getllave())>0)
			return buscar(r.getHijoD(), llave);
		
		return raiz;
	}
	
    public Nodo<E> insertarNodo(Nodo<E> nodo) throws Exception {
        raiz = insertarNodoR(nodo, raiz);
        return raiz;
 
    }
    
    public Nodo<E> insertarNodoR(Nodo<E> nodo, Nodo<E> raiz1) throws Exception {
    	if (raiz1 == null) {
    		raiz1 = nodo;
    	} else {
    		if (nodo.getllave().compareTo(raiz1.getllave()) < 0) {
    			raiz1.setHijoI(insertarNodoR(nodo, raiz1.getHijoI()));
    		}
    		if (nodo.getllave().compareTo(raiz1.getllave()) > 0) {
    			raiz1.setHijoD(insertarNodoR(nodo, raiz1.getHijoD()));
    		}
    		if (nodo.getllave().compareTo(raiz1.getllave()) == 0) {
    			throw new Exception("El nodo esta repetido");
    		}
    	}
    	return raiz1;
    }
	
	public static int alturaNodo(Nodo<Integer> nodo) {
		
		int altura = 0;
		
		//Por definici�n
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
	
    
	
	public Nodo<E> antecesor(Nodo<E> nodo) throws Exception {
        if (nodo.getHijoI() == null) {
            throw new Exception("404");
        } else {
            return antecesorR(nodo);
        }
    }
	
    public Nodo<E> antecesorR(Nodo<E> nodo) {
        if (nodo.getHijoD() == null) {
            return nodo;
        } else {
            return antecesorR(nodo.getHijoD());
        }
    }
    
    
    public void eliminarNodo(E llave) throws Exception {
		raiz = eliminarR(llave, raiz);

	}
    
    
    public Nodo<E> eliminarR(E llave, Nodo<E> raiz) throws Exception {
        if (raiz == null) {
            throw new Exception("No se encuentra el nodo");
        } else {
            if (llave.compareTo(raiz.getllave()) < 0) {
                raiz.setHijoI(eliminarR(llave, raiz.getHijoI()));
            } else {
                if (llave.compareTo(raiz.getllave()) > 0) {
                    raiz.setHijoD(eliminarR(llave, raiz.getHijoD()));
                } else {
                    if (llave.compareTo(raiz.getllave()) == 0) {
                        // Caso 3
                        if (raiz.getHijoD() != null && raiz.getHijoI() != null) {
                            Nodo<E> antecesor = antecesor(raiz);
                            raiz.setLlave(antecesor.getllave());
                            raiz.setHijoI(eliminarR(antecesor.getllave(), raiz.getHijoI()));
 
                        } else {
                            // caso2 o caso 1
                            if (raiz.getHijoD() != null) {
                                raiz = raiz.getHijoD();
                            } else {
                                raiz = raiz.getHijoI();
                            }
                        }
                    }
                }
            }
        }
        return raiz;
    }

	
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


		
		
				
		abb<Integer> abb=new abb<Integer>(n1);
		//System.out.println("Preorden");
		
		try {
			abb.insertarNodo(n5);
			abb.insertarNodo(n3);
			abb.insertarNodo(n9);
			abb.insertarNodo(n7);
			abb.insertarNodo(n8);
			abb.insertarNodo(n6);
			abb.insertarNodo(n4);
			abb.insertarNodo(n10);
			System.out.println("antecesor" + abb.antecesor(n5));
			abb.eliminarNodo(5);
			//System.out.println(abb.buscar(8));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		
//		abb.preorden();
//		System.out.println("Inorden ");
//		System.out.println();
//		abb.inorden();
		
		//System.out.println(alturaNodo(n1));
		//System.out.println("Cantidad hojas= "+abb.cantidadHojas());
		
		
	
	}
	
}
