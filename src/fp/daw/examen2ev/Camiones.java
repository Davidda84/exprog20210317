package fp.daw.examen2ev;

public class Camiones extends TransporteMercancias {

	public Camiones(int diasAlquiler, String matricula, int pma) {
		super(diasAlquiler, matricula, pma);
		super.setPrecioAlquiler(super.getPrecioAlquiler() + 40);
	}

}
