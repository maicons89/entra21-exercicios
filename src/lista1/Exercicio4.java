package lista1;

import java.util.Scanner;

/**
 * Dado duas m�dias, o programa deve calcular a m�dia aritm�tica
 */

/**
 * @author Paraibah89
 *
 */
public class Exercicio4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner mostrarTeclado = new Scanner(System.in);

		System.out.println("Insira o primeiro numero");
		Float numero1 = mostrarTeclado.nextFloat();

		System.out.println("Insira o segundo numero");
		Float numero2 = mostrarTeclado.nextFloat();

		Float mediaAritmetica = (numero1 + numero2) / 2;
		System.out.println("Resultado da m�dia artmetica: " + mediaAritmetica);

	}
}