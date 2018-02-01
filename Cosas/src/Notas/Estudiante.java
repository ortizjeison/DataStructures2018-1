package Notas;
import java.util.Arrays;

import cosasUtiles.Operaciones;

public class Estudiante {
	private String nombre;
	private String [] materias;
	private double [][] notas;
	
	//Constructor
	public Estudiante(String nombre, String[] materias) {
		super();
		this.nombre = nombre;
		this.materias = materias;
		this.notas = new double[materias.length][];
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
			//System.out.println("suma = "+ sum);
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
	
	public void addNota(String m, double nota) throws Exception {
		int i = Operaciones.findByString(m, materias);
		if(i!=-1 && nota>=0) {
			if(notas[i]==null) {
				notas[i]=new double [1];
			}else { 
				notas[i] = Arrays.copyOf(notas[i], notas[i].length+1);
			}
			notas[i][notas[i].length-1] = nota;		
		}else
			throw new Exception("error");
	}
	
	public void addNota(String s, double []nota) throws Exception {
		for(double n:nota) {
				addNota(s,n);
		}
	}
	
	public static void main (String args[]) {
//		double [][]e1Notas = {
//		{1,2,3},
//		{4,5,6,7},
//		{3,2,1,0}
//		};
			
		String [] e1Materias = {"a","b","c"};
		Estudiante e1 = new Estudiante("E1", e1Materias);
		
//		System.out.println("Promedio = "+e1.promMateria("b"));
//		System.out.println("La nota máxima = "+ e1.maxNota("b"));
		try {
			e1.addNota("a", 3.5);
			e1.addNota("a", 4);
			e1.addNota("a", 3.9);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		//System.out.println(e1.promMateria("a"));
		
		double [] noticas = {2,2,2,2};
		try {
			e1.addNota("b", noticas);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}		
		System.out.println(e1.promMateria("b"));
	}
}
