package cosasUtiles;

public class Operaciones {
	
	//(string, arreglo) -> Indice / -1
	public static int findByString(String s, String a []) {
		int k = 0;
		while(a[k].compareTo(s)!=0 && k<a.length-1){
			k++;
		}
		
		if(a[k].compareTo(s)==0) {
			//System.out.println("Se encontró y es = "+ k);
			return k;
		}else {
			//System.out.println("No se encontró el elemento " + s);
			return -1;
		}
	}

}
