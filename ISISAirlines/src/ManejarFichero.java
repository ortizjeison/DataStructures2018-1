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
	
//	public String nombre,ciudad,pais;
//	public String puertas[];
//	public boolean estado;
//	for(int j=0;j==5;j++) {
//		pw.println(a.aeropuertos[i].getNombre());
//	}
	
	public static void guardarAeropuertos(Aerolinea a) throws IOException {
		FileWriter fichero = null;
		PrintWriter pw = null;
		try {
			fichero = new FileWriter("aeropuertos.ins");
			pw = new PrintWriter(fichero);
			
			
			for(int i=1;i<a.aeropuertos.length;i++) {
				pw.println("Nombre:" + a.aeropuertos[i].getNombre());
				pw.println("Ciudad:" + a.aeropuertos[i].getCiudad());
				pw.println("País:" + a.aeropuertos[i].getPais());
				pw.println("Puertas:" + a.aeropuertos[i].getPuertasString());
				pw.println("Estado:" + a.aeropuertos[i].estado);
				
			}
			
		}catch (Exception e) {
            e.printStackTrace();
        } finally {
           try {
        	   if (null != fichero)
        		   fichero.close();
        	   }catch (Exception e2) {
        		   e2.printStackTrace();
              }
        }
	}
	
	public static void main(String[] args) throws ClassNotFoundException, IOException {
		Aerolinea a = new Aerolinea("IsisAirlines");
		a.AddAvion("AA", 10, 0);
		a.AddAvion("XX", 5555, 0);
		a.AddAvion("BB", 111, 0);

//		System.out.println("hola");
//		guardar(a);
//		leer("t.ins");
		String [] p1 = {"1111","222","333"};
		
		a.AddAeropuerto("A", "B", "C"); a.aeropuertos[1].setPuertas(p1);
		a.AddAeropuerto("A", "A", "A"); a.aeropuertos[2].setPuertas(p1);
		a.AddAeropuerto("B", "B", "B"); a.aeropuertos[3].setPuertas(p1);
		a.AddAeropuerto("C", "C", "C"); a.aeropuertos[4].setPuertas(p1);
		
		guardarAeropuertos(a);
	}

}
