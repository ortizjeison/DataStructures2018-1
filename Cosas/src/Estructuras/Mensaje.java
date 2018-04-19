package Estructuras;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Mensaje {
	public static <E> void printLista(Stack<Integer> lista) {
		for (int e : lista) {
			System.out.print(e + " ");
		}
		System.out.println();
	}

	public static <E> void printLista(Queue<Integer> lista) {

		for (int e : lista) {
			System.out.print(e + " ");
		}
		System.out.println();
	}
	 

	public static <E> void printLista1(Queue<Character> lista) {
		Queue temp = (Queue) ((LinkedList) lista).clone();
		for (int e : lista) {
			System.out.print(temp.poll() + " ");
		}
		System.out.println();
	}

	public static <E> void printLista1(Stack<Character> lista) {
		for (int e : lista) {
			System.out.print((char) e + " ");
		}
		System.out.println();
	}


	public static <E> Stack<E> etapa1(LinkedList<E> Cola) {
		Stack<E> e = new Stack<E>();
		String s = "a";
		char[] vocales = { 'a', 'e', 'i', 'o', 'u' };
		return e;
	}

	public static <E> Queue<E> etapa2(Stack<E> lista) {
		Queue<E> e = new LinkedList<E>();
		while (!lista.isEmpty())
			e.add(lista.pop());
		return e;
	}

	@SuppressWarnings("unchecked")
	public static <E> Queue<E> convertiraCola(String cadena) {
		Queue<E> e = new LinkedList<E>();
		for (int i = 0; i < cadena.length(); i++) {
			e.add((E) ((Character) cadena.charAt(i)));
		}
		return e;
	}

	@SuppressWarnings("unchecked")
	public static <E> Stack<E> convertiraPila(String cadena) {
		Stack<E> e = new Stack<E>();
		for (int i = 0; i < cadena.length(); i++) {
			e.add((E) ((Character) cadena.charAt(i)));
		}
		return e;
	}

	public static void main(String[] args) {
		Stack<Integer> ints = new Stack<Integer>();
		String e = "Prueba";
		for (int i = 0; i < 10; i++) {
			ints.push(i);
		}
		printLista(ints);
		printLista(etapa2(ints));
		printLista1(convertiraPila(e));


		System.out.println("pepito");
	}
}
