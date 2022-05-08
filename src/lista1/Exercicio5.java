package lista1;

import java.util.Scanner;

/**
 * O sistema de avaliação de uma disciplina é composto por 3 provas.
 * Leia a nota das 3 provas e calcule a média final de aluno desta disciplina.
 */

/**
 * @author Paraibah89
 *
 */
public class Exercicio5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner mostrarTeclado = new Scanner(System.in);

		System.out.println("Digite a Nota da Prova 1");
		Float notaProva1 = mostrarTeclado.nextFloat();

		System.out.println("Digite a Nota da Prova 2");
		Float notaProva2 = mostrarTeclado.nextFloat();

		System.out.println("Digite a Nota da Prova 3");
		Float notaProva3 = mostrarTeclado.nextFloat();

		Float mediaFinalDoAluno = (notaProva1 + notaProva2 + notaProva3) / 3;
		System.out.println("Média final do aluno: " + mediaFinalDoAluno);

	}
}
