import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Handler {
	//Cola de pacientes
	Queue<Paciente> pacientes= new LinkedList<Paciente>();
	//Cola consultorios
	ArrayList<Consultorio> consultorios= new ArrayList<Consultorio>();
	//Citas
	ArrayList<Cita> citas = new ArrayList<Cita>();
	//Medicos
	ArrayList<Medico> medicos = new ArrayList<Medico>();
	
	
	public boolean asignarCita(Paciente p, String nombreMedico) {
		//Añadir el paciente a la cola
		pacientes.add(p);
		
		//Crear cita y añadirla al arraylist
		Medico M = findMedico(nombreMedico);
		Consultorio C = findConsultorio();
		
		if(M!=null && C!=null) {
			Cita ctemp = new Cita(p, M, C);
			return citas.add(ctemp);
		}
		return false;

	}
	
	
	public void terminarCita() {
		//Buscar una cita random y eliminarla
	}
	
	public void terminarCita(int id) {
		//Buscar la cita y eliminarla
	}
	
	public boolean PacientesEspera(String nombreMedico) {
		
		//Recorrer las citas y decir si el médico tiene citas pendientes
		return false;
	}
	
	
	//Otros metodos
	public Medico findMedico(String nombre) {		
		for(int i=0;i<medicos.size();i++) {
			if(medicos.get(i).getNombre().compareTo(nombre)==0) {
				return medicos.get(i);
			}
		}
		return null;
	}
	
	public Consultorio findConsultorio() {
		for(int i=0;i<consultorios.size();i++) {
			if(consultorios.get(i).getDisponible()==true) {
				return consultorios.get(i);
			}
		}
		return null;
	}

	
	public static void main(String[] args) {
		
	}

}
