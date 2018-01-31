
public class Triangulo {
	
	public double a,b,c;
	
	public Triangulo(double a, double b, double c) throws Desigualdad {
		if(a+b>c && a+c>b && b+c>a) {
			this.a = a;
			this.b = b;
			this.c = c;			
		}else {
			throw new Desigualdad();
		}
	}
	 
	public double perimetro() {
		return a+b+c;
	}
	
	public char type() {
		return (a==b && b==c)? 'q':(a==b || a==c || b==c)?'i':'e';
	}
	
	public double area() {
		if(a+b>c && a+c>b && b+c>a) {
			double s = perimetro()/2;
			return Math.sqrt(s*(s-a)*(s-b)*(s-c));
		}else {
			return -1;
		}
	}
	
	public static void main(String[] args) {
		
		try {
			Triangulo t1 = new Triangulo(3,1,1);
			System.out.println(t1.area());
		} catch (Desigualdad e) {
			// TODO Auto-generated catch block
			System.out.println("No es un triangulo");
		}
	}
}

class Desigualdad extends Exception {}

