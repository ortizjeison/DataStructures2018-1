package calculadora;

public  class Calculadora {
	
	public int sumar(String a, String b) {
		return Integer.parseInt(a) + Integer.parseInt(b);
	}
	
	public int div(String a, String b) throws DivisionCero{
		if(Integer.parseInt(b) !=0) {
			return Integer.parseInt(a) / Integer.parseInt(b);
		}else {
			throw new DivisionCero();
		}

	}
	
	public static void main(String[] args) {
		myjframe ventana = new myjframe();
		ventana.setVisible(true);
	}
}
