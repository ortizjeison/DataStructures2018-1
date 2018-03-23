
public class CadenaPalindrome {

	public static boolean cadenaPalindrome(String s) {
		String s1 = s;
		String s2 = InvertirString.invCadena2(s);

		if (s1.compareTo(s2) == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean cadenaPalindrome1(String s) {
		return cadenaPalindromeRecu1(s, 0, s.length()-1);
	}

	public static boolean cadenaPalindromeRecu1(String s, int i, int j) {
		if (i >= j) {
			return true;
		} else if (s.charAt(i) == s.charAt(j)) {
			return (cadenaPalindromeRecu1(s, i + 1, j - 1));
		} else {
			return false;
		}
	}

	public static boolean cadenaPalindromeRecu2(String s) {
		s = s.toLowerCase();
		if (s.length() <= 1) {
			return true;
		} else {
			if (s.charAt(0) == s.charAt(s.length() - 1)) {
				return cadenaPalindromeRecu2(s.substring(1, s.length() - 1));
			} else {
				return false;
			}
		}
	}

	public static void main(String[] args) {
		System.out.println(cadenaPalindrome1("reconocer"));
		System.out.println();
		System.out.println(cadenaPalindromeRecu2("reconocer"));
	}

}
