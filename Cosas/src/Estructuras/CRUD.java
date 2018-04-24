package Estructuras;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class CRUD {

	public static void main(String[] args) {
		
		

		Integer N = 10000000;
		Integer P2 = 10;
		
		//ARRAYLIST 
		ArrayList<Integer> alist = new ArrayList<Integer>();
		for(int i=0;i<N;i++) {
			alist.add(i);
		}
		
		//ADD
		long start = System.currentTimeMillis();
		alist.add(0,P2);
		long end = System.currentTimeMillis();
		
		long time = end -start;
		System.out.println("arraylist add: " + time);
		
		//DELETE
		
		start = System.currentTimeMillis();
		alist.remove(0);
		end = System.currentTimeMillis();
		
		time = end -start;
		System.out.println("arraylist delete: " + time);
		
		
		
		//LINKEDLIST
		LinkedList<Integer> lList = new LinkedList<Integer>();
		for(int i=0;i<N;i++) {
			lList.add(i);
		}
		
		//ADD
		start = System.currentTimeMillis();
		lList.add(0,P2);
		end = System.currentTimeMillis();
		time = end - start;
		System.out.println("LinkedList add: " + time);
		
		//REMOVE
		
		start = System.currentTimeMillis();
		lList.remove(0);
		end = System.currentTimeMillis();
		
		time = end -start;
		System.out.println("Linkedlist delete: " + time);
		
		//QUEUE
		Queue<Integer> cola= new LinkedList<Integer>();
		
		for(int i=0;i<N;i++) {
			cola.add(i);
		}
		
		//ADD
		start = System.currentTimeMillis();
		((LinkedList<Integer>) cola).add(P2);
		end = System.currentTimeMillis();
		time = end - start;
		System.out.println("Queue add: " + time);
		
		//DELETE
		start = System.currentTimeMillis();
		cola.poll();
		end = System.currentTimeMillis();
		time = end -start;
		System.out.println("Queue delete: " + time);
		
		//STACK
		Stack<Integer> stack= new Stack<Integer>();
		
		for(int i=0;i<N;i++) {
			stack.push(i);
		}
		
		//ADD
		start = System.currentTimeMillis();
		stack.push(P2);
		end = System.currentTimeMillis();
		time = end - start;
		System.out.println("Stack add: " + time);
		//DELETE
		
		start = System.currentTimeMillis();
		end = System.currentTimeMillis();
		
		time = end -start;
		System.out.println("STACK delete: " + time);
	}

	
}
