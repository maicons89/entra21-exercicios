/**
 * 
 */
package lista1;

import java.util.Scanner;

/**
 * @author Paraibah89
 *
 */
public class Exercicio10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner mostrarTeclado = new Scanner(System.in);

		System.out.println("Digite um número:");
		int numero = mostrarTeclado.nextInt();

		System.out.println("===================");
		System.out.println("Tabuada de " + numero);
		System.out.println("===================");

		System.out.println(numero + " x 1 = " + numero * 1);
		System.out.println(numero + " x 2 = " + numero * 2);
		System.out.println(numero + " x 3 = " + numero * 3);
		System.out.println(numero + " x 4 = " + numero * 4);
		System.out.println(numero + " x 5 = " + numero * 5);
		System.out.println(numero + " x 6 = " + numero * 6);
		System.out.println(numero + " x 7 = " + numero * 7);
		System.out.println(numero + " x 8 = " + numero * 8);
		System.out.println(numero + " x 9 = " + numero * 9);
		System.out.println(numero + " x 10 = " + numero * 10);

	}
}
