package Búsqueda;

import java.util.Arrays;

public class Busqueda {
	public static int mayor(Comparable[] a) {
		int index=0;
		for(int i=0;i<a.length;i++) {
			if(a[index].compareTo(a[i])<0) {
				//System.out.println(a[index] + " / " + a[i]);
				index=i;
			}
		}
		return index;
	}
	
	public static Integer[] buscarRaro(Comparable[] a) {
		Integer [] indexes = {0};
		
		int indexm = 0;
		for(int i=0;i<a.length;i++) {
			if(a[indexm].compareTo(a[i])<0) {
				indexm = i;
			}
		}
		return indexes;
		
	}
	
	public static int secuencial(Comparable[] a, Comparable o) {
		int index = -1;
		int i = 0;
		boolean sw = true;
		while(i<a.length && sw==true) {
			if(a[i].compareTo(o)==0) {
				index = i;
				sw=false;
			}
			i++;
		}
		return index;
	}
	
	public static int binariaI(Comparable[] a, Comparable o) {
		int i = 0;
		int d = a.length-1;
		int medio;
		while(i<=d) {
			medio=(i+d)/2;
			if(a[medio].compareTo(o)==0) {
				return medio;
			}
			else {
				if(a[medio].compareTo(o)>0) {
					d = medio-1;
				}
				else {
					i = medio +1;
				}
			}
		}
		return -1;
	}
	
	public static int binariaR(Comparable[] a, Comparable o) {
		return binariaR(a,o,0,a.length-1);
	}
	
	public static int binariaR(Comparable[] a,Comparable o,int i, int d) {
		int medio;
		if(i==d) {
			if(a[i].compareTo(o)==0) {
				return i;
			}else {
				return -1;
			}
		}else {
			medio = (i+d)/2;
			if(a[medio].compareTo(o)>0) {
				return binariaR(a,o,i,medio-1);
			}else {
				return binariaR(a,o,medio+1,d);
			}
		}
		
	}
	

	
	public static void print(Comparable [] a) {
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i].toString());
		}
	}
	
	public static void main(String[] args) {
		Integer [] l = {3,6,7,10,12,45};
		
		System.out.println(binariaR(l, 6));
	}
}
