/** Calcule a m�dia dos alunos e indique se ele est� aprovado ou reprovado. Permita que esse aluno fa�a exame para ser aprovado.
 * 4 notas bimestrais
 * M�dia para aprova��o = 7.0
 * M�dia para aprova��o do exame = 6.0
 * 
 */
package lista2;

import java.util.Scanner;

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

		System.out.println("Digite Nota 1 do aluno");
		float nota1 = mostrarTeclado.nextFloat();

		System.out.println("Digite Nota 2 do aluno");
		float nota2 = mostrarTeclado.nextFloat();

		System.out.println("Digite Nota 3 do aluno");
		float nota3 = mostrarTeclado.nextFloat();

		System.out.println("Digite Nota 4 do aluno");
		float nota4 = mostrarTeclado.nextFloat();

		float media = (nota1 + nota2 + nota3 + nota4) / 4;

		System.out.println("M�dia do aluno: " + media);

		if (media >= 7) {
			System.out.println("Aprovado");
		} else {
			System.out.println("Digite a nota do exame:");
			float notaExame = mostrarTeclado.nextFloat();
			if (notaExame >= 6) {
				System.out.println("Aprovado");
			} else {
				System.out.println("Reprovado");
			}
		}
	}
}