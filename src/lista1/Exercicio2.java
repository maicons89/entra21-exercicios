package lista1;

import java.util.Scanner;

/**
 * Dado um n�mero inteiro, o programa deve mostrar o n�mero antecessor, 
 * o n�mero digitado e o n�mero sucessor.
 */

/**
 * @author Paraibah89
 *
 */
public class Exercicio2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mostrarTeclado = new Scanner(System.in);

		System.out.println("Insira o Numero");
		int numero = mostrarTeclado.nextInt();

		int resultadosucessor = numero + 1;
		System.out.println("Resultado do sucessor: " + numero + "+" + 1 + "=" + resultadosucessor);

		int resultadoantecessor = numero - 1;
		System.out.println("Resultado do antecessor " + numero + "-" + 1 + "=" + resultadoantecessor);

	}
}