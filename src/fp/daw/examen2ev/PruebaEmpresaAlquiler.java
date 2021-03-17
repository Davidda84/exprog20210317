package fp.daw.examen2ev;

import java.util.ArrayList;
import java.util.Scanner;

public class PruebaEmpresaAlquiler {
	public static Scanner teclado = new Scanner(System.in);
	public static ArrayList<EmpresaAlquiler> flota = new ArrayList<EmpresaAlquiler>();

	public static void main(String[] args) {
		try {
		int entrada = Integer.parseInt(teclado.next());
			GeneraFlota(entrada);
		}
		catch(NumberFormatException e){
			System.out.println("Por favor introduzca un número");
			int entrada = Integer.parseInt(teclado.next());
			GeneraFlota(entrada);			
		}
		for(EmpresaAlquiler e : flota){
			System.out.println("Precio de Alquiler de " + e.getClass().getSimpleName() + " = " + e.getPrecioAlquiler());
		}
	}

	public static void GeneraFlota(int entrada){
		EmpresaAlquiler coche = new Coche (entrada, "ABC0123", 4);
		flota.add(coche);
		EmpresaAlquiler microbus = new Microbus (entrada, "ABC0124", 4);
		flota.add(microbus);
		EmpresaAlquiler furgoneta = new Furgonetas (entrada, "ABC0123", 100);
		flota.add(furgoneta);
		EmpresaAlquiler camion = new Camiones (entrada, "ABC0123", 1500);
		flota.add(camion);
	}

}
