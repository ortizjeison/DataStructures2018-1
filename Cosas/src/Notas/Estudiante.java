package Notas;
import cosasUtiles.Operaciones;

public class Estudiante {
	private String nombre;
	private String [] materias;
	private double [][] notas;
	
	//Constructor
	public Estudiante(String nombre, String[] materias, double[][] notas) {
		super();
		this.nombre = nombre;
		this.materias = materias;
		this.notas = notas;
	}	
	
	//Getters & Setters
	public String[] getMaterias() {
		return materias;
	}
	public void setMaterias(String[] materias) {
		this.materias = materias;
	}
	public double[][] getNotas() {
		return notas;
	}
	public void setNotas(double[][] notas) {
		this.notas = notas;
	}
	public String getNombre() {
		return nombre;
	}
	

	public double promNotas() {
		double sum = 0;
		int count = 0;
		
		for(int i=0;i<materias.length;i++) {
			for(int j=0;j<notas[i].length;j++) {
				sum += notas[i][j];
				count++;
			}
		}
		return sum/count;
	}	
	//Promedio por materia
	public double promMateria(String m) {
		
		int indice = Operaciones.findByString(m, materias);
		if(indice!=-1) {
			double sum = 0;
			int i;
			for(i=0;i<notas[indice].length;i++){
				sum += notas[indice][i];
			}
			return sum/i;			
		}else 
			System.out.println("No se puede hallar el promedio");
			return -1;
	}
	//Buscar mayor/ menor nota
	
	public double maxNota(String m) {
		
		int indice = Operaciones.findByString(m, materias);
		if(indice!=-1) {
			double max = notas[indice][0];			
			for(int i=1;i<notas[indice].length;i++){
				if(notas[indice][i]>max) {
					max = notas[indice][i];
				}
			}return max;			
		}else 
			System.out.println("No se puede hallar la nota máxima");
			return -1;
	}
	
	
	public static void main (String args[]) {
		double [][]e1Notas = {
		{1,2,3},
		{4,5,6,7},
		{3,2,1,0}
		};
			
		String [] e1Materias = {"a","b","c"};
		Estudiante e1 = new Estudiante("E1", e1Materias, e1Notas);
		
		System.out.println("Promedio = "+e1.promMateria("b"));
		System.out.println("La nota máxima = "+ e1.maxNota("b"));
	}
}
