package fp.daw.examen2ev;

public class Furgonetas extends TransporteMercancias {

	public Furgonetas(int diasAlquiler, String matricula, int pma) {
		super(diasAlquiler, matricula, pma);
	}

	@Override
	public String toString() {
		return "Furgonetas [" + super.toString() + "]";
	}
	

}
