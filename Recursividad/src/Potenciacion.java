
public class Potenciacion {
	public static float potencia (long b, long e) {
		if(b==0)
			return 0;
		else {
			if(e==0) {
				return 1;
			}
			if(e<0) {
				return 1 / (b * potencia(b,-e-1));
			}
			else {
				return b * potencia(b,e-1);
			}
				}
	}
	
	public static void main(String[] args) {
		System.out.println(potencia(2,5));
		System.out.println(Math.pow(2,5));
	}
}
