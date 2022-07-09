/**
 * 
 */
package lista5EstruturaDeDados;

import java.util.Scanner;

/**
 * @author isado
 *
 */
public class Exercicio2A {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner mostrarTeclado = new Scanner(System.in);

		int[] numerosInteiros = { 5, 10, 15, 20, 25, 30, 35, 40, 45, 50 };

		for (int i = 9; i >= 0; i--) {
			System.out.println(numerosInteiros[i]);
		}
	}
}
