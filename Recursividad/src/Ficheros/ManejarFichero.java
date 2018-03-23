package Ficheros;
import java.io.*;
import java.util.Arrays;

public class ManejarFichero {
	
	
	//FICHERO OBJETO
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

	//FICHERO OBJETO
	public static void leer(String path) throws IOException, ClassNotFoundException {
		FileInputStream fis;
		ObjectInputStream ois=null;
		
		
		try {
			fis = new FileInputStream(path);
			ois=new ObjectInputStream(fis);
			//Class c=(Class) ois.readObject();
		}finally {}
	}
	

	//FICHERO TEXTO
	public static void guardarAeropuertos(Object o) throws IOException {
		FileWriter fichero = null;
		PrintWriter pw = null;
		try {
			fichero = new FileWriter("aeropuertos.txt");
			pw = new PrintWriter(fichero);
			
//			for(int i=1;i<a.aeropuertos.length;i++) {
//				pw.println("atributo:" + o.aeropuertos[i].getNombre());
//			}			
			
			
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
	
	//LEER FICHERO TEXTO
	public static void LeerAeropuertos(Aerolinea a) throws IOException {
		
		File file = null;
		FileReader fr = null;
		FileReader fr2 = null;
		BufferedReader br = null;
		BufferedReader br2 = null;
		
		try {
			file = new File("aeropuertos.txt");
			fr = new FileReader (file);
			br = new BufferedReader(fr);
			
			fr2= new FileReader(file);
			br2 = new BufferedReader(fr2);
			
			
			String line = null;			
			String nombre,ciudad,pais;
			boolean estado;
			String line2 = null;
			
			int contadorObjetos = 0;
			
			while((line2=br2.readLine())!=null) {
				contadorObjetos ++;
			}
			contadorObjetos --;
			contadorObjetos /= 5;			
			
			for(int i=1;i<=contadorObjetos;i++) {
				
				//Nombre
				line = br.readLine();
				nombre = line.substring(7);
				
				//Ciudad
				line = br.readLine();
				ciudad = line.substring(7);
				
				//País
				line = br.readLine();
				pais = line.substring(5);
				
				//Puertas 
				line = br.readLine();
				String puertas [] = line.split("/");
				
				//Estado
				line = br.readLine();				
				String estadoS = line.substring(7);
				if(estadoS == "true") {
					estado = true;
				}else {
					estado = false;
				}		
				
				a.AddAeropuerto(nombre,ciudad,pais);
				a.aeropuertos[a.aeropuertos.length-1].setEstado(estado);
				a.aeropuertos[a.aeropuertos.length-1].setPuertas(puertas);
				
			}

		}catch(Exception e){
			e.printStackTrace();
			}finally{
				try{                    
		            if( null != fr ){   
		               fr.close();     
		            }                  
		         }catch (Exception e2){ 
		            e2.printStackTrace();
		         }				
			}
	}
	
	
	
	public void leerValoresReferencia(String nombreFichero) throws IOException, ECantidadCampos, EFicheroVacio {
		FileReader file= new FileReader(new File(nombreFichero));
		BufferedReader buffer= new BufferedReader(file);
		String line;
		boolean error1=true;// Error de fichero vacío
		while ((line=buffer.readLine())!=null && line.compareTo("")!=0) {
			String[] infexamen=line.split(",");
			if (infexamen.length<3) {
				buffer.close();
				throw new ECantidadCampos();
			}			
			ValorExamen examen=new ValorExamen(infexamen[0], Double.parseDouble(infexamen[1]), Double.parseDouble(infexamen[2]));
			error1=false;
			if (valoresReferencia==null)
				valoresReferencia= new ValorExamen[1];
			else
				valoresReferencia=Arrays.copyOf(valoresReferencia, valoresReferencia.length+1);
			valoresReferencia[valoresReferencia.length-1]=examen;
		}
		buffer.close();
		if (error1) throw new EFicheroVacio();
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
		
		a.AddAeropuerto("Z", "Z", "Z"); a.aeropuertos[1].setPuertas(p1);
		a.AddAeropuerto("A", "A", "A"); a.aeropuertos[2].setPuertas(p1);
		a.AddAeropuerto("B", "B", "B"); a.aeropuertos[3].setPuertas(p1);
		a.AddAeropuerto("C", "C", "C"); a.aeropuertos[4].setPuertas(p1);
		
		guardarAeropuertos(a);
		LeerAeropuertos(a);
		guardarAeropuertos(a);
	}

}
