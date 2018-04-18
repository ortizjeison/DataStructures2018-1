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
	
	
}
