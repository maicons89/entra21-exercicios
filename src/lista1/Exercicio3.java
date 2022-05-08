package lista1;

import java.util.Scanner;

/**
 * Dado um numero, o programa deve calcular o dobro e o triplo desse numero.
 */

/**
 * @author Paraibah89
 *
 */
public class Exercicio3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner mostrarTeclado = new Scanner(System.in);

		System.out.println("Insira o Numero");
		int numero = mostrarTeclado.nextInt();

		int dobro = numero * 2;
		System.out.println("Resultado do Dobro " + numero + " * " + 2 + " = " + dobro);

		int triplo = numero * 3;
		System.out.println("Resultado do Triplo: " + numero + " * " + 3 + " = " + triplo);

	}
}