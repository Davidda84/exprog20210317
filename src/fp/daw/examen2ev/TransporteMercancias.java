package fp.daw.examen2ev;

public class TransporteMercancias extends Vehiculos {
	
	private int PMA;

	public TransporteMercancias(int diasAlquiler, String matricula,int pma) {
		super(diasAlquiler, matricula, "Mercancias");
		this.PMA = pma;
		super.setPrecioAlquiler(super.PrecioBase + (20 * pma));
	}

	public int getPMA() {
		return PMA;
	}

	public void setPMA(int pMA) {
		PMA = pMA;
	}

	@Override
	public String toString() {
		return "PMA = " + PMA + super.toString() + "]";
	}

}
