/**11. Crie um algoritmo que leia um valor e a partir disso faça: (1) se o valor for 1, 2 ou 3,
mostre o valor elevado ao quadrado; (2) se o valor for o número 4 ou 9, mostre a raiz
quadrada do número;
 */
package lista3ControleCondicional;

import java.util.Scanner;

/**
 * @author Paraibah89
 *
 */
public class Exercicio11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner mostrarTeclado = new Scanner(System.in);
		
		int valor = 0;
		int elevadoAoQuadrado = 0;
		int raizQuadrada = 0;
						
		System.out.println("Digite um valor entre os números apresentados: 1, 2, 3, 4 ou 9");
		valor = mostrarTeclado.nextInt();
		
		
		if (valor == 1) {
			elevadoAoQuadrado = (valor * valor);
			System.out.println("O valor elevado ao quadrado é: " + elevadoAoQuadrado);
		} else if (valor == 2) {
			elevadoAoQuadrado = (valor * valor);
			System.out.println("O valor elevado ao quadrado é: " + elevadoAoQuadrado);
		} else if (valor == 3) {
			elevadoAoQuadrado = (valor * valor);
			System.out.println("O valor elevado ao quadrado é: " + elevadoAoQuadrado);
		} else if (valor == 4) {
			raizQuadrada = (int) Math.sqrt(valor);
			System.out.println("A raiz quadrada do número é: " + raizQuadrada);
		} else if (valor == 9) {
			raizQuadrada = (int) Math.sqrt(valor);
			System.out.println("A raiz quadrada do número é: " + raizQuadrada);
		}
	}

}
