import java.util.Arrays;

public class PMixta extends Pieza{

	public Pieza[] ListaPiezas;
	

	
	public PMixta(String Codigo, String Descripcion, float PesoKg, Pieza[] listaPiezas) {
		super(Codigo, Descripcion, PesoKg);
		ListaPiezas = listaPiezas;
	}

	public void AddPieza(Pieza p){
		
		if(ListaPiezas==null)
			ListaPiezas = new Pieza[1];
		else
			ListaPiezas = Arrays.copyOf(ListaPiezas, ListaPiezas.length+1);
			ListaPiezas[ListaPiezas.length-1] = p;
			Costo=p.getCosto();
	}

	@Override
	public float Costo() {
		float total = 0;
		for(Pieza p: ListaPiezas) {
			total += p.Costo;
		}
		return total;
	}
	
	
}
