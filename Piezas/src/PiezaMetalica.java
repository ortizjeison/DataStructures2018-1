
public class PiezaMetalica extends Pieza {

	public PiezaMetalica(String Codigo, String Descripcion, float PesoKg) {
		super(Codigo, Descripcion, PesoKg);
	}

	@Override
	public float Costo() {
		return (float) (2.0 *PesoKg +56);
	}

}
