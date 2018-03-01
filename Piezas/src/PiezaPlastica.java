
public class PiezaPlastica extends Pieza{

	public PiezaPlastica(String Codigo, String Descripcion, float PesoKg) {
		super(Codigo, Descripcion, PesoKg);
		// TODO Auto-generated constructor stub
	}

	@Override
	public float Costo() {
		return (float) (2.8*PesoKg+56);
	}

}
