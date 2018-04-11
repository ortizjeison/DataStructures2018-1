package Ordenamiento;

import java.util.Arrays;

public class Tarea {
	
	public static void checker(Comparable[] a, char o) {
		boolean sw = true;
		int i = 0;
		
		while(i<a.length-1 && sw == true) {
			if(o=='a') {
				if(a[i].compareTo(a[i+1])>0){
					System.out.println(a[i] + " > " + a[i+1]);
					sw=false;
					System.out.println("No está ordenado ascendentemente");
				}
			}else {
				if(a[i].compareTo(a[i+1])<0){
					System.out.println(a[i] + " < " + a[i+1]);
					sw=false;
					System.out.println("No está ordenado descendentemente");
				}
			}
			i++;
		}
		if(sw==true) {
			System.out.println("Arreglo Ordenado");
		}
	}
	
	public static Comparable[] Repetidos(Comparable[] a) {
		Comparable [] temp = new Comparable[1];
		temp[0] = a[0];
		
		for(int i=1;i<a.length;i++) {	
			
			int j=0;
			boolean sw=true;
			
			while(j<temp.length && sw==true) {
				//Si son iguales: El elemento ya está guardado
				if(a[i].compareTo(temp[j])==0) {
					sw=false;
				}
				j++;
			}
			
			if(sw==true) {
				temp = Arrays.copyOf(temp, temp.length+1);
				temp[temp.length-1]=a[i];
			}
		}
		return temp;
	}
	
	
	public static Comparable[] RepetidosOrdenado(Comparable[] a) {
		Ordenamiento.bubblesortOp(a);
		
		Comparable[] temp = new Comparable[1];
		temp[0] = a[0];
		int i = 1;
		while(i<a.length) {
			//Si el Ai-1 = Ai 
			if(a[i-1].compareTo(a[i])==0) {
			}else {
				temp = Arrays.copyOf(temp,temp.length+1);
				temp[temp.length-1] = a[i];
			}
			i++;
		}
		return temp;
	}
	
	
	public static void print(Comparable [] a) {
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i].toString());
		}
	}
	
	public static void main(String[] args) {
//		Integer [] a = {1,2,3,4,5,6};
//		checker(a, 'a');
		Integer[] b = {5,5,1,-2,9,3,1};
		Integer[] c = Arrays.copyOf(b, b.length);
		Comparable[] clean = RepetidosOrdenado(b);
		Comparable[] clean2 = Repetidos(c);
		print(clean);
		System.out.println("/////");
		print(clean2);
		
	}
}
