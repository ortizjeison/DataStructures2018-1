package arboles2;

import java.util.ArrayList;

public class Arbol <E extends Comparable>{
	protected Nodo<E> raiz;
		
	//Constructor
	public Arbol(Nodo<E> raiz){
		this.raiz = raiz;
	}
	
	public Nodo<E> getRaiz(){
		return raiz;
	}
	
	public void setRaiz(Nodo<E> raiz){
		this.raiz = raiz;
	}
	
	//Preorden
	public void preorden(){
		preorden(raiz);
		System.out.println();
	}
		
	public void preorden(Nodo <E> nodo){
		if(!(nodo==null)){
			System.out.println(nodo);
			preorden(nodo.getHijoI());
			preorden(nodo.getHijoD());
		}
	}
	
	
	//Posorden IZ-DER-RAIZ
	
	public void posorden(){
		posorden(raiz);
		System.out.println();
	}

	public void posorden(Nodo<E> nodo){
		if(!(nodo==null)){
			posorden(nodo.getHijoI());
			posorden(nodo.getHijoD());	
			System.out.println(nodo);
		}
	}
	
	//Inorden

	public void inorden(){
		inorden(raiz);
		System.out.println();
	}
	
	public void inorden(Nodo<E> nodo){
		if(nodo!=null){
			inorden(nodo.getHijoI());
			System.out.println(nodo);
			inorden(nodo.getHijoD());
		}
	}
	
	
	public int cantidadHojas(){
		return cantidadHojas(raiz);
	}
	
	public int cantidadHojas(Nodo<E> nodo){
		if(nodo==null)
			return 0;
		if(nodo.getHijoD()==null && nodo.getHijoI()==null){
			return 1;
		}
		return cantidadHojas(nodo.getHijoD()) +cantidadHojas(nodo.getHijoI());
	}
	
	
	public boolean  ValidarABB(){
		return ValidarABB(raiz);
	}
		
	public boolean ValidarABB(Nodo <E> nodo){
		
		boolean answer = true;
				
		if(nodo!=null){
			if((nodo.getHijoI()!=null && nodo.getllave().compareTo(nodo.getHijoI().getllave())<0)
					|| nodo.getHijoD()!=null && nodo.getllave().compareTo(nodo.getHijoD().getllave())<0)
				answer= false;
			else
				ValidarABB(nodo.getHijoI());
				ValidarABB(nodo.getHijoD());
		}
		return answer;
	}
	
	
	
	public static void main(String[] args){
	
		Nodo<Integer> n1 = new Nodo<Integer>(10);
		Nodo<Integer> n2 = new Nodo<Integer>(7);
		Nodo<Integer> n3 = new Nodo<Integer>(5);
		Nodo<Integer> n4 = new Nodo<Integer>(19);
		Nodo<Integer> n5 = new Nodo<Integer>(15);
		Nodo<Integer> n6 = new Nodo<Integer>(120);

		
		n1.setHijoI(n2);
		n2.setHijoI(n5);
		n2.setHijoI(n3);
		n2.setHijoD(n4);
		n5.setHijoI(n6);

		
		Arbol<Integer> a=new Arbol<Integer>(n1);
		
//		Nodo[] in = {n1,n3,n5,n4,n6,n2};
//		Nodo[] pre ={n1,n5,n3,n2,n4,n6};

		
		
		System.out.println("Preorden");
		a.preorden();
//		System.out.println("Posorden");
//		a.posorden();
//		System.out.println("Inorden");
//		a.inorden();
	}
	
	//Convertir arbol cualquiera a binario
	//Codigo de Huffman y cómo se utilizaría en árboles binarios
	//Cuad-arbol
}

