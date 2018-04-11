package Ordenamiento;

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
			System.out.println("Ordenado");
		}
	}
	
	public static void main(String[] args) {
		Integer [] a = {1,2,3,4,5,6};
		checker(a, 'a');
	}
}
