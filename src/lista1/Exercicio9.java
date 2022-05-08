/**Dado um n�mero, o programa deve mostrar a sua tabuada. Digitado o valor de qualquer n�mero,
 * o sistema deve mostrar o resultado na tela.
 *
 */
package lista1;

import java.util.Scanner;

/**
 * @author Paraibah89
 *
 */
public class Exercicio9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner mostrarTeclado = new Scanner(System.in);

		System.out.println("Digite um n�mero:");
		int numero = mostrarTeclado.nextInt();

		System.out.println("===================");
		System.out.println("Tabuada de " + numero);
		System.out.println("===================");

		for (int i = 1; i < 11; i++) {
			System.out.println(numero + "x" + i + "=" + numero * i);
		}
	}
}