package fp.daw.examen2ev;

public class TransportePersonas extends Vehiculos {
	
	private int Plazas;

	public TransportePersonas(int diasAlquiler, String matricula, int plazas) {
		super(diasAlquiler, matricula, "Personas");
		this.Plazas = plazas;
	}
	
	public int getPlazas() {
		return Plazas;
	}

	public void setPlazas(int plazas) {
		Plazas = plazas;
	}

	@Override
	public String toString() {
		return "Plazas=" + Plazas + super.toString();
	}

}
