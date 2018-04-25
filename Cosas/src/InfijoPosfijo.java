import java.util.ArrayList;
import java.util.Stack;

public class InfijoPosfijo {
	
	public static ArrayList<String> convert(String expresion) {
		
		expresion = depurar(expresion);
		String[] arrayInfijo = expresion.split(" ");

		Stack<String> E = new Stack<String>();
		Stack<String> Temp = new Stack<String>();
		Stack<String> S = new Stack<String>();

		for (int i = arrayInfijo.length - 1; i >= 0; i--) {
			E.push(arrayInfijo[i]);
		}
		
		// Algoritmo Infijo a Postfijo
		while (!E.isEmpty()) {
			
			switch (prioridad(E.peek())) {
			case 1:
				Temp.push(E.pop());
				break;
			case 3:
			case 4:
				while (prioridad(Temp.peek()) >= prioridad(E.peek())) {

					S.push(Temp.pop());
				}
				Temp.push(E.pop());
				break;
			case 2:
				while (!Temp.peek().equals("(")) {
					S.push(Temp.pop());
				}
				Temp.pop();
				E.pop();
				break;
			default:
				S.push(E.pop());
			}
		}

		//Pila de transbordo
		Stack<String> X = new Stack<String>();
		while (!S.isEmpty()) {
			X.push(S.pop());
		}

		// Cola de salida
		ArrayList<String> postfix = new ArrayList<String>();
		while (!X.isEmpty()) {
			postfix.add(X.pop());
		}

		return postfix;

	}

	// Jerarquia de los operadores
	private static int prioridad(String operador) {
		int orden = 99;
		if (operador.equals("^"))
			orden = 5;
		if (operador.equals("*") || operador.equals("/"))
			orden = 4;
		if (operador.equals("+") || operador.equals("-"))
			orden = 3;
		if (operador.equals(")"))
			orden = 2;
		if (operador.equals("("))
			orden = 1;
		return orden;
	}
	

	private static String depurar(String s) {
		// Elimina espacios en blanco
		s = s.replaceAll("\\s+", "");
		s = "(" + s + ")";
		String operadores = "+-*/()";
		String str = "";
		
		for (int i = 0; i < s.length(); i++) {
			if (operadores.contains("" + s.charAt(i))) {
				str += " " + s.charAt(i) + " ";
			} else {
				str += s.charAt(i);
			}
		}

		return str.replaceAll("\\s+", " ").trim();
}

	public static void main(String[] args) {

		String exp = "2+3*4";
		ArrayList<String> test = convert(exp);
		System.out.println(test.toString());

	}
}