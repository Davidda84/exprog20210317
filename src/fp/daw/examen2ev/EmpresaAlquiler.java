package fp.daw.examen2ev;

public class EmpresaAlquiler {
	private int diasAlquiler;
	private double precioAlquiler;

	public EmpresaAlquiler(int diasAlquiler) {
		super();
		this.diasAlquiler = diasAlquiler;
	}

	public int getDiasAlquiler() {
		return diasAlquiler;
	}

	public void setDiasAlquiler(int diasAlquiler) {
		this.diasAlquiler = diasAlquiler;
	}

	public double getPrecioAlquiler() {
		return precioAlquiler;
	}
	
	public void setPrecioAlquiler(double precioAlquiler) {
		this.precioAlquiler = precioAlquiler;
	}

	@Override
	public String toString() {
		return ", Días de alquiler = " + diasAlquiler + ", Precio de Alquiler = " + precioAlquiler;
	}
}
