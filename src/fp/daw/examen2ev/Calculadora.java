package fp.daw.examen2ev;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String linea;
		System.out.print("calculadora > ");
		while (!(linea = in.readLine()).equalsIgnoreCase("fin")) {
			calcular(linea);
			System.out.print("calculadora > ");
		}
	}

	static void calcular(String linea) {
		Scanner s = new Scanner(linea);
		String[] eq = linea.split(" ");
		try {
		switch (eq[1]) {
		case "+":
			double suma = Double.parseDouble(eq[0]) + Double.parseDouble(eq[2]); 
			System.out.println("Resultado de " + linea + " = " + suma);
			break;
		case "-":
			double resta = Double.parseDouble(eq[0]) - Double.parseDouble(eq[2]);
			System.out.println("Resultado de " + linea + " = " + resta);
			break;
		case "*":
			double multiplicacion = Double.parseDouble(eq[0]) * Double.parseDouble(eq[2]);
			System.out.println("Resultado de " + linea + " = " + multiplicacion);
			break;
		case "/":
			double division = Double.parseDouble(eq[0]) / Double.parseDouble(eq[2]);
			System.out.println("Resultado de " + linea + " = " + division);
			break;
		default:
			System.out.println("Expresión incorrecta, el operador no es correcto");
		}
		}
		catch(NumberFormatException e) {
			System.out.println("Expresión incorrecta, comprueba que los parametros de la ecuación son numeros");
		}
		s.close();
	}

}
