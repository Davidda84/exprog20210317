package fp.daw.examen2ev;

public class Microbus extends TransportePersonas {

	public Microbus(int diasAlquiler, String matricula, int plazas) {
		super(diasAlquiler, matricula, plazas);
		super.setPrecioBase(super.PrecioBase + ((2 * plazas)*diasAlquiler));		
	}

	@Override
	public String toString() {
		return "Microbus [" + super.toString() + "]";
	}
	

}
