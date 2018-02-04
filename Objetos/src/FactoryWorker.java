
public class FactoryWorker {
	public Float total;
	
	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}

	public int AddNumbers(int num1, int num2) {
		int result = num1 + num2;
		result = result + 100;
		result = result -100;
		return result;
	}
	
	public void count (float num) {
		if(total==null) {
			total = (float) 0;
		}
		total = total + num;
		System.out.println(total);
	}
	
	public void cout(float num) {
		total = total + num;
		System.out.println(total);
	}
	
	public static void main(String[] args) {
		FactoryWorker w1 = new FactoryWorker();
		//Contador
		w1.cout(4); w1.count(3);
		
		//Encapsulamiento
		int result = w1.AddNumbers(2, 3);
		System.out.println(result);
		
		//Contador polimorfo
		w1.count(4);
		w1.count(5);
		w1.count(4.5f);
		
	}
}
