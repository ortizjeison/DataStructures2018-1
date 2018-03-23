
public class ContarVocales {

	public static int contarVocales(String c) {
		c = c.toLowerCase();
		return contarVocalesRecu(c, c.length() - 1);

	}

	public static int contarVocalesRecu(String c, int i) {
		String vocales = "aeiou";
		if (i < 0) {
			return 0;
		}
		if (vocales.contains(Character.toString(c.charAt(i)))) {
			return 1 + contarVocalesRecu(c, i - 1);
		}
		return contarVocalesRecu(c, i - 1);
	}

	public static void main(String[] args) {
		String t = "Hola";
		System.out.println(contarVocales(t));
	}
}
