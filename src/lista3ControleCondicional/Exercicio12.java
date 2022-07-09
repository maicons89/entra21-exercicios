/**Crie um algoritmo que leia um valor e a partir disso faça: (1) se for um valor negativo,
mostre o módulo (valor sem sinal) do valor; (2) se for um valor maior do que 10,
solicite outro valor e mostre a diferença entre eles; (3) Caso o valor não seja de
nenhuma condição anterior, mostre o valor dividido por 5.
 * 
 */
package lista3ControleCondicional;

import java.util.Scanner;

/**
 * @author Paraibah89
 *
 */
public class Exercicio12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner mostrarTeclado = new Scanner(System.in);

		double valor = 0;
		double outroValor = 0;
		double nenhumaCondicao = 0;

		System.out.println("Digite um valor:");
		valor = mostrarTeclado.nextDouble();

		if (valor < 0) {
			System.out.println("Mostrar o valor sem o sinal de negativo: " + Math.abs(valor));
		} else if (valor > 10) {
			System.out.println("Digite um outro valor: ");
			outroValor = mostrarTeclado.nextDouble();
			System.out.println("Diferença entre eles: " + (valor - outroValor));
		} else if (valor > 0 && valor < 10) {
			nenhumaCondicao = valor / 5;
			System.out.println(
					"Caso o valor seja maior que 0 e menor que 10, mostre o valor dividido por 5 " + nenhumaCondicao);
		}
	}
}
