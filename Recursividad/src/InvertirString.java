
public class InvertirString {

	public static String invCadena1(String s) {
		return invCadenaRecu1(s, s.length() - 1);
	}

	public static String invCadenaRecu1(String s, int n) {
		if (n == 0) {
			return Character.toString(s.charAt(n));
		} else {
			return s.charAt(n) + invCadenaRecu1(s, n - 1);
		}
	}
	
	////

	public static String invCadena2(String s) {
		return invCadenaRecu2(s, 0);
	}

	public static String invCadenaRecu2(String s, int n) {
		if (n == s.length() - 1) {
			return Character.toString(s.charAt(n));
		} else {
			return invCadenaRecu2(s, n + 1) + s.charAt(n);
		}
	}

	public static void main(String[] args) {
		String t = "Hola";
		System.out.println(invCadena1(t));
	}
}
