package lista1;

import java.util.Scanner;

/**
 * Dados dois números, some os dois números e mostre o resultado na tela.
 */

/**
 * @author Paraibah89
 *
 */
public class Exercicio1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner mostrarTeclado = new Scanner(System.in);

		System.out.println("Insira o primeiro numero");
		int n1 = mostrarTeclado.nextInt();

		System.out.println("Insira o segundo numero");
		int n2 = mostrarTeclado.nextInt();

		int soma = n1 + n2;

		System.out.println("Resultado da soma: " + n1 + " + " + n2 + " = " + soma);
	}
}
