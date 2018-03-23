
public class Pares {
	
	public int contarPares(int[] vec) {
		return contarPares(vec, vec.length-1);
	}
	
	public int contarPares(int[] vec, int n) {
		if(n<0)
			return 0;
		if(vec[n]%2==0)
			return 1+contarPares(vec,n-1);
		return contarPares(vec,n-1);
		
	}
	
	public static void main(String[] args) {
		Pares pa = new Pares();
		int[] vector= {2,45,31,4,6,7,86,45,5,23,32};
		
		System.out.println(pa.contarPares(vector));
	}

}
