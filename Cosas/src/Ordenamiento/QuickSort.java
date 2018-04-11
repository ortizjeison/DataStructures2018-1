package Ordenamiento;

import java.util.Arrays;

public class QuickSort {
	
	public static void quickSort(Comparable[] a) {
		quickSort(a,0,a.length-1);
	}
	
	public static void quickSort(Comparable[] a, int inicio, int fin){
		if(fin <= inicio)
			return;
		else{
			Comparable pivote = a[fin];
			int i = inicio-1;
			int j = fin;
			Comparable temp;
			while(i<j){
				
				while(a[++i].compareTo(pivote)<0);
				while(j>inicio && pivote.compareTo(a[--j])<0);
				if(i<j){
					temp = a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}			
			temp=a[i];
			a[i]=a[fin];
			a[fin]=temp;
			int partition=i;
			quickSort(a,inicio, partition-1);
			quickSort(a,partition+1,fin);
		}
	}
	
	public static Comparable[] Merge(Comparable[] a, Comparable[] b){
		Comparable[] res = new Comparable[a.length+b.length];
		int i = 0;
		int j = 0;
		int k = 0;
		while(i<a.length && j<b.length){
			if(a[i].compareTo(b[j]) < 0){ //Si a[i] < B[j]
				res[k] = a[i];
				i++;
				k++;
			}
			else{
				res[k] = b[j];
				j++;
				k++;
			}
		}
		while(i<a.length){
			res[k] = a[i];
			i++;
			k++;
		}
		while(j<b.length){
			res[k] = b[j];
			j++;
			k++;
		}
		return res;
	}
	
	public static void MergeSort(Comparable[] a) {
		MergeSort(a,0,a.length-1);
	}
	
	public static Comparable[] MergeSort(Comparable[] a, int i, int f){

		if(i==f){
			return new Comparable[] {a[i]};
		}else {
			Comparable[] izquierdo = Arrays.copyOfRange(a, i, (i+f)/2);
			Comparable[] derecho = Arrays.copyOfRange(a,(i+f)/2+1,a.length);
			return Merge(izquierdo,derecho);
            }
	}
	
	
	public static void main(String[] args) {
		Integer [] a1 = {2,6,8,10,20}; //5
		Integer [] a2 = {0,1,4,7,12,23,24,25}; //8
		
		Comparable [] merged = Merge(a1,a2);
		//Ordenamiento.print(merged);
		//System.out.println(merged[12]);
		
		Persona p1 = new Persona("Marcela",24);
		Persona p2 = new Persona("Oscar",21);
		Persona p3 = new Persona("Marcela",20);
		Persona p4 = new Persona("Andrés", 26);
		Persona p5 = new Persona("Oscar", 30);
		Persona p6 = new Persona("Nadia",21);
		
		Persona [] l1 = {p1,p2,p3,p4,p5,p6};
		MergeSort(l1);
		Ordenamiento.print(l1);
//		Persona[] l2 = Arrays.copyOf(l1, l1.length);
//		Persona[] l3 = Arrays.copyOf(l1, l1.length);
//		Persona[] l4 = Arrays.copyOf(l1, l1.length);
//		
//		
//		//Quick
//		System.out.println("Original: ");
//		Ordenamiento.print(l1);
//		System.out.println();
//		quickSort(l1);
//		System.out.println("QuickSort: ");
//		Ordenamiento.print(l1);
//		System.out.println();
//		
//		//BubbleSort
//		Ordenamiento.bubblesort2(l2);
//		System.out.println("**BubbleSort: ***");
//		Ordenamiento.print(l2);
//		System.out.println();
//		
//		//SelectSort
//		Ordenamiento.SelectSort(l3);
//		System.out.println("***SelectSort: ***");
//		Ordenamiento.print(l3);
//		System.out.println();
//		
//		//InsertSort
//		Ordenamiento.insertSort(l3);
//		System.out.println("***InsertSort: ***");
//		Ordenamiento.print(l3);
//		System.out.println();
		
		
		
	}
}
