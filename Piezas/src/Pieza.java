
abstract class Pieza {

	protected String Codigo;
	protected String Descripcion;
	protected float PesoKg;
	protected float Costo;

	public Pieza(String Codigo, String Descripcion, float PesoKg){

		this.Codigo=Codigo;
		this.Descripcion=Descripcion;
		this.PesoKg=PesoKg;
		this.Costo= Costo();

	}


	public abstract float Costo();


	public String getCodigo() {
		return Codigo;
	}

	public void setCodigo(String codigo) {
		Codigo = codigo;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	public float getPesoKg() {
		return PesoKg;
	}

	public void setPesoKg(float pesoKg) {
		PesoKg = pesoKg;
	}

	public float getCosto() {
		return Costo;
	}

	public void setCosto(float costo) {
		Costo = costo;
	}


}
