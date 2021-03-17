package fp.daw.examen2ev;

public class Coche extends TransportePersonas {

	public Coche(int diasAlquiler, String matricula, int plazas) {
		super(diasAlquiler, matricula, plazas);
		super.setPrecioBase(super.getPrecioAlquiler() + super.getPrecioBase() + (1.5 * plazas));
	}

	@Override
	public String toString() {
		return "Coche [" + super.toString() + "]";
	}
}
