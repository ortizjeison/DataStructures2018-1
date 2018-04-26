package arboles2;

import java.util.ArrayList;
import java.util.Arrays;


public class construirArbol<E extends Comparable> {
		
	public Nodo<E> construir(ArrayList<E> preorden, ArrayList<E> inorden) {		
		
		if(preorden.size()>0 && inorden.size()>0){
			
			//Raiz
			Nodo<E> raiz = new Nodo<E>(preorden.get(0));
			
			//Buscar raiz del preorden en inorden
			int i;
			for(i = 0; i < inorden.size(); i++){
				if(inorden.get(i).compareTo(raiz.getllave()) == 0 ){
					break;
				}
			}
			
			//Asignación de hijos correspondientes
			raiz.setHijoI(construir(
					new ArrayList<E> (preorden.subList(1, i+1)),
					new ArrayList<E> (inorden.subList(0,i))
			));
			raiz.setHijoD(construir(
					new ArrayList<E> (preorden.subList(i+1, preorden.size())),
					new ArrayList<E> (inorden.subList(i+1,inorden.size()))
			));
			
			return raiz;
		}
		
		return null;		
	}
	
	
	
	//						Intento 2	
	
	public static <E> int buscarnodo(E llave,Nodo[]b){
		int n = 0;
		for(int k=1;k<b.length;k++){
			if(b[k].getllave().equals(llave))
				n=k;
		}
		return n;
	}
	
	
	//Dividir recursivamente y vencer, o al menos eso intento xd
	public static void dividir(Nodo[]pre, Nodo[]in, Nodo anterior){
				
		//Buscar el primer elemento del pre[] en  in[]
		int p = buscarnodo(anterior.getllave(),in);
		Nodo actual = in[p];
		
		if(p==0){
			anterior.setHijoI(null);		
		}else{
			Nodo[] izquierdo = Arrays.copyOfRange(in,0, p); 
			dividir(pre,izquierdo,actual);
		}
		
		if(p==in.length-1){
			anterior.setHijoD(null);
		}else{
			Nodo[] derecho = Arrays.copyOfRange(in,p+1,in.length-1);
			dividir(pre,derecho,actual); // lo mismo, al lado derecho
		}
	}
	
	public static ArrayList arraytoAL(Nodo[] arreglo){
		ArrayList arraylist = new ArrayList();
		
		for(int i=0;i<arreglo.length;i++){
			arraylist.add(arreglo[i]);
		}
		return arraylist;
	}
	
	
	public static void main(String[] args){
		
		Nodo<Integer> n1 = new Nodo<Integer>(1);
		Nodo<Integer> n2 = new Nodo<Integer>(2);
		Nodo<Integer> n3 = new Nodo<Integer>(3);
		Nodo<Integer> n4 = new Nodo<Integer>(4);
		Nodo<Integer> n5 = new Nodo<Integer>(5);
		Nodo<Integer> n6 = new Nodo<Integer>(6);
		
		
		//Crear arreglos de inorden y preorden
		
		
		Nodo[] in = {n1,n3,n5,n4,n6,n2};
		Nodo[] pre ={n1,n5,n3,n2,n4,n6};
		
		Arbol<Integer> abb=new abb<Integer>(n1);
		
//		ArrayList inorden = new ArrayList();
//		ArrayList preorden = new ArrayList();
//	
//		inorden=arraytoAL(in);
//		preorden=arraytoAL(pre);
//		
//		abb.construir(inorden,preorden);
		
		dividir(in,pre,n1);
		
	
//		
		System.out.println("Preorden");
//		System.out.println("Preorden");
//		abb.preorden();
//		System.out.println("Posorden");
//		abb.posorden();
//		System.out.println("Inorden");
//		abb.inorden();
		
	}
}
