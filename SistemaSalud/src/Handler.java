import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Handler {
	//Cola de pacientes
	Queue<Paciente> pacientes= new LinkedList<Paciente>();
	//Cola consultorios
	Queue<Consultorio> consultorio= new LinkedList<Consultorio>();
	//Citas
	ArrayList<Cita> citas = new ArrayList<Cita>();
	//Medicos
	ArrayList<Medico> medicos = new ArrayList<Medico>();
	
	
	public void asignarCita(Paciente p, String nombreMedico) {
		//Añadir el paciente a la cola
		
		//Crear cita y añadirla al arraylist
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
	
	public static void main(String[] args) {
		
	}

}
