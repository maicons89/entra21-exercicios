/**
 * 
 */
package lista1;

import java.util.Scanner;

/**
 * @author Paraibah89
 *
 */
public class Exercicio8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner mostrarTeclado = new Scanner(System.in);

		System.out.println("Digite Metros Desejados");
		float metros = mostrarTeclado.nextFloat();

		float converterMetrosParaKM = metros / 1000;
		System.out.println("Metros equivale a km: " + converterMetrosParaKM);

		float converterMetrosParaCentimetros = metros * 100;
		System.out.println("Metros equivale a centímetros: " + converterMetrosParaCentimetros);

		float converterMetrosParaMilimetros = metros * 1000;
		System.out.println("Metros equivale a milímetros: " + converterMetrosParaMilimetros);
	}
}
