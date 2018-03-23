
public class FibonacciRecursiva {
	
	public static long fibonacciR(long n){
		if (n==0 || n==1)
			return n;
		return fibonacciR(n-1)+fibonacciR(n-2);
	}
	
	public static void main(String[] args){
		long timestart = System.currentTimeMillis();
		System.out.println(fibonacciR(10));
		long timeend = System.currentTimeMillis();
		System.out.println(timeend-timestart);
	}

}