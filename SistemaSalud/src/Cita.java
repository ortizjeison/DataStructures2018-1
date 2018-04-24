import java.util.concurrent.atomic.AtomicInteger;

public class Cita {
	private static final AtomicInteger id = new AtomicInteger(0);
	Paciente p;
	Medico m;
	Consultorio c;
	
	
	public Cita(Paciente p, Medico m, Consultorio c) {
		super();
		this.p = p;
		this.m = m;
		this.c = c;
	}
	
}
