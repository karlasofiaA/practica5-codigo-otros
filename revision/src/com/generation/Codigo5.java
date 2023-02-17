package com.generation; //La clase la ingresamos dentro de un paquete

import java.util.Scanner; //Agregamos la librería de Scanner

/* Solo debes ingresar un valor entero para que aparezca en consola, de acuerdo a las 
 * condiciones si es un numero afortunado o no
 */

public class Codigo5 {
	
	public static void main(String[] args) { // Falta instanciar la función main
		Scanner s = new Scanner(System.in); // Falta de la entrada "System.in"
		System.out.println("Introduzca un número: "); // Las comillas deben ser igual dentro de los paréntesis
		int ni = s.nextInt(); //La entrada de escanner es un numérico
		int c = ni; 

		int afo = 0;
		int noAfo = 0;

		if (ni > 0) { //Se cambia por una sentencia if para no crear un bucle infinito
			int digito = (int) (ni % 10);
			if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
				afo++;
			} else {
				noAfo++;

				ni /= 10;
				System.out.println(ni);
			}

			if (afo > noAfo) {
				System.out.println("El " + c + " es un número afortunado."); //"t" a la palabra print
			} else {
				System.out.println("El " + c + " no es un número afortunado.");
			}
		}
	}

}