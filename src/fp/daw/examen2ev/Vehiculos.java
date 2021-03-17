package fp.daw.examen2ev;

import java.util.Arrays;

public class Vehiculos extends EmpresaAlquiler {
	
	private String Matricula;
	protected double PrecioBase;
	private String [] Tipos = {"Personas", "Mercancias"};
	private String Tipo;
	
	public Vehiculos(int diasAlquiler, String matricula, String tipo) {
		super(diasAlquiler);
		this.Matricula = matricula;
		this.PrecioBase = 50 * diasAlquiler;
		this.Tipo = Tipos[Arrays.asList(Tipos).indexOf(tipo)];
		super.setPrecioAlquiler(PrecioBase);
	}
	
	public String getMatricula() {
		return Matricula;
	}

	public void setMatricula(String matricula) {
		Matricula = matricula;
	}

	public double getPrecioBase() {
		return PrecioBase;
	}

	public void setPrecioBase(double precioBase) {
		PrecioBase = precioBase;
	}

	public String[] getTipos() {
		return Tipos;
	}

	public void setTipos(String[] tipos) {
		Tipos = tipos;
	}

	public String getTipo() {
		return Tipo;
	}

	public void setTipo(String tipo) {
		Tipo = tipo;
	}
	
	@Override
	public String toString() {
		return ", Matricula = " + Matricula + ", PrecioBase = " + PrecioBase + "€, Tipo = " + Tipo + super.toString();
	}

	

}
