/**
 * Ler o nome, 2 notas e a frequência do aluno nas disciplinas e verificar se o
aluno foi aprovado ou não, sabendo que para ser aprovado um aluno precisa ter média
>= 6,0 e frequência >= 70%.
 */
package lista3ControleCondicional;

import java.util.Scanner;

/**
 * @author Paraibah89
 *
 */
public class Exercicio3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner mostrarTeclado = new Scanner(System.in);

		System.out.println("Digite o nome do aluno:");
		String nomeAluno = mostrarTeclado.nextLine();

		System.out.println("Frequencia1");
		float frequencia1 = mostrarTeclado.nextFloat();

		System.out.println("Nota1");
		float nota1 = mostrarTeclado.nextFloat();
		if (nota1 >= 6 && frequencia1 >= 7) {
			System.out.println("Aluno aprovado");
		} else {
			System.out.println("Aluno reprovado");
		}

		System.out.println("Frequencia2");
		float frequencia2 = mostrarTeclado.nextFloat();

		System.out.println("Nota2");
		float nota2 = mostrarTeclado.nextFloat();
		if (nota2 >= 6 && frequencia2 >= 7) {
			System.out.println("Aluno aprovado");
		} else {
			System.out.println("Aluno reprovado");
		}

	}

}
