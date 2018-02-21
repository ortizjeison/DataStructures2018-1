import java.io.*;

public class ManejarFichero {
	
	public static void guardar(Object a) {
		FileOutputStream fos;
		ObjectOutputStream oos = null;
		
		try {
			fos = new FileOutputStream("t.ins");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(a);
		}catch (FileNotFoundException e){
			System.out.println("404 fichero not found");
			
		}catch (IOException e) {
			System.out.println("No es serializable");
		}finally {
			try {
				oos.close();
			}catch(IOException e) {
				System.out.println("no se puede cerrar");
			}
		}
	}

	
	public static void leer(String path) throws IOException, ClassNotFoundException {
		FileInputStream fis;
		ObjectInputStream ois=null;
		
		
		try {
			fis = new FileInputStream(path);
			ois=new ObjectInputStream(fis);
			Aerolinea b=(Aerolinea) ois.readObject();
			System.out.println(b.getNombre());
		}finally {}
	}

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		Aerolinea a = new Aerolinea("IsisAirlines");
		a.AddAvion("AA", 10, 0);
		a.AddAvion("XX", 5555, 0);
		a.AddAvion("BB", 111, 0);
		a.AddAeropuerto("A", "B", "C");
		System.out.println("hola");
		guardar(a);
		leer("t.ins");
	}

}
