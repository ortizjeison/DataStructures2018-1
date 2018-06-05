import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQ {
	
	public static void main(String[] args) {
		
		Comparator<Integer> comp  = new comparador();
		PriorityQueue<Integer> colaP = new PriorityQueue<Integer>(comp);

	}
}

class comparador implements Comparator<Integer>{

	@Override
	public int compare(Integer arg0, Integer arg1) {
		return arg0.compareTo(arg1);
	}
	
}