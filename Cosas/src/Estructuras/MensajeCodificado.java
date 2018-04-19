package Estructuras;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class MensajeCodificado {
 
	
	public static String Stack2String(Stack<Character> c) {
		String s = "";
		
		while(!c.isEmpty()) {
			s = s + (c.pop().toString());
		}
		return s;
	}
	
	
	public static String Queue2String(Queue<Character> c) {
		String s = "";
		while(!c.isEmpty()) {
			s = s + (c.poll().toString());
		}
		return s;
	}
	
	
	public static <E> Queue<E> String2Queue(String cadena) {
		Queue<E> e = new LinkedList<E>();
		for (int i = 0; i < cadena.length(); i++) {
			e.add((E) ((Character) cadena.charAt(i)));
		}
		return e;
	}

	public static <E> Stack<E> String2Stack(String cadena) {
		Stack<E> e = new Stack<E>();
		for (int i = 0; i < cadena.length(); i++) {
			e.add((E) ((Character) cadena.charAt(i)));
		}
		return e;
	}
	

	/////////////////////
	//Etapa 1
	
	public static <E> Stack<E> etapa1(LinkedList<E> Cola) {
		Stack<E> e = new Stack<E>();
		String s = "a";
		char[] vocales = { 'a', 'e', 'i', 'o', 'u' };
		return e;
	}
	
	
	
	
}
