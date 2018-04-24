import java.util.concurrent.atomic.AtomicInteger;

public class Cita {
	static int k = 0;
	int id;
	Paciente p;
	Medico m;
	Consultorio c;
	
	
	public Cita(Paciente p, Medico m, Consultorio c) {
		super();
		id = k++;
		this.p = p;
		this.m = m;
		this.c = c;
	}
	
}
