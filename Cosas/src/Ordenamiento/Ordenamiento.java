package Ordenamiento;

import java.util.Arrays;
import java.util.Random;

public class Ordenamiento {
	public static void bubblesort(int [] a) {
		for(int i=0; i<a.length-1;i++) {
			for(int j=0; j<a.length-1-i;j++) {
				if(a[j]>a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
	}
	
	public static void bubblesort2(Comparable[] a) {
		int k = 0;
		for(int i=0; i<a.length-1;i++)
			for(int j=0; j<a.length-1-i;j++) { 
				k++;
				if(a[j].compareTo(a[j+1])>0) {
					Comparable temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		System.out.println("Pasos = " + k);
	}
	
	public static void bubblesortOp(Comparable[] a) {
		int k = 0;
		boolean sw = true;
		int i =0;
		while(i<a.length-1 && sw==true) {
			for(int j=0; j<a.length-1-i;j++){
				k++;
				if(a[j].compareTo(a[j+1])>0) {
					Comparable temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					sw=true;
				}else {
					sw=false;
				}
			}
			i++;
		}
		System.out.println("Pasos = " + k);
	}
	
	public static void SelectSort(Comparable [] a) {
		for(int i=0;i<a.length-1;i++) {
			int im = i;
			for(int j=i+1;j<a.length;j++) {
				if(a[j].compareTo(a[im])<0) {
					im = j;					
				}
			}
			Comparable temp = a[i];
			a[i] = a[im];
			a[im] = temp;
		}
	}
	
	public static void insertSort(Comparable[] a) {
		for(int i=0;i<a.length-1;i++) {
			Comparable temp = a[i];
			int j = i;
			while(j>0 && temp.compareTo(a[j-1])<0) {
				a[j] = a[j-1];
				j--;
			}
			a[j] = temp;
		}
		
	}
	
	public static void print(Comparable [] a) {
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i].toString());
		}
	}
	
	public static void main(String[] args) {
		Integer [] a = {8,2,6,7,8,9};
		Integer [] b = Arrays.copyOf(a, a.length);
		
		System.out.println("bubble normal");
		bubblesort2(a);
		System.out.println("Bubble óptimo");
		bubblesortOp(b);
//		//Personas
//		Persona p1 = new Persona("Marcela",24);
//		Persona p2 = new Persona("Oscar",21);
//		Persona p3 = new Persona("Marcela",20);
//		Persona p4 = new Persona("Andrés", 26);
//		Persona p5 = new Persona("Oscar", 30);
//		Persona p6 = new Persona("Nadia",21);
//		
//		Persona [] listaP = {p1,p2,p3,p4,p5,p6};
//		print(listaP);
//		bubblesort2(listaP);
//		System.out.println("Ordenada: ");
//		print(listaP);
		
//		int n = 10000;
//		Random r = new Random();
//		Integer[] lista = new Integer[n];
//		for(int i=0;i<n;i++) {
//			lista[i] = r.nextInt(2*n);
//			//lista[i] = i;
//		}
//		
//		Integer[] copy = Arrays.copyOf(lista, lista.length);
//		Integer[] copy2 = Arrays.copyOf(lista, lista.length);
//		
//		long start = System.currentTimeMillis();
//		bubblesort2(lista);
//		long end = System.currentTimeMillis();
//		
//		System.out.println("Bubble: " + (end-start));
//		
//		start = System.currentTimeMillis();
//		SelectSort(copy);
//		end = System.currentTimeMillis();
//		System.out.println("Select: " +(end-start));
//		
//		start = System.currentTimeMillis();
//		insertSort(copy2);
//		end = System.currentTimeMillis();
//		System.out.println("Insert: " +(end-start));
	}
}
