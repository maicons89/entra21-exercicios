/**
 * 
 */
package lista5EstruturaDeDados;

import java.util.Scanner;

/**
 * @author isado
 *
 */
public class Exercicio3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner mostrarTeclado = new Scanner(System.in);

		double nota[] = new double[4];
		double somaNotas = 0;

		System.out.println("Digite a primeira nota");
		double nota0 = mostrarTeclado.nextDouble();
		nota[0] = nota0;

		System.out.println("Digite a segunda nota");
		double nota1 = mostrarTeclado.nextDouble();
		nota[1] = nota1;

		System.out.println("Digite a terceira nota");
		double nota2 = mostrarTeclado.nextDouble();
		nota[2] = nota2;

		System.out.println("Digite a quarta nota");
		double nota3 = mostrarTeclado.nextDouble();
		nota[3] = nota3;
		System.out.println();

		for (int i = 0; i < nota.length; i++) {
			System.out.println(nota[i]);

			somaNotas = somaNotas + nota[i];

		}
		System.out.println("Média de nota dos alunos: " + somaNotas/nota.length);

	}
}
