
public class SumatoriaVector {
	
	public int sumavector(int[] v){
		return sumatoriavector(v, 0);
	}
	
	public static int sumatoriavector(int[] v, int n){

		if (n==(v.length-1))
			return v[v.length-1];
		else 
			return v[n]+sumatoriavector(v,n+1);
				
	}
	
	
	public static int enteros(int[] v) {
		return enteros(v,v.length-1);
	}
	
	public static int enteros(int[] v, int n) {
		
		if(n<0) {
			return 0;
		}
		if(v[n]%2==0) {
			return 1 + enteros(v,n-1);
		}
			return enteros(v,n-1);
	}
	
	
	
	public static void main(String[] args) {
		int[] k = {2,3,4,5,5,5,5,5,5,6};
		System.out.println(enteros(k));
	}

}
