/**
 * Calcule a média dos alunos e indique se ele está aprovado ou reprovado. Permita que
este aluno faça exame para poder ser aprovado.
4 notas bimestrais
 Média para aprovação = 7,0
 Média para aprovação para Exame = 6,0
 */
package lista3ControleCondicional;

import java.util.Scanner;

/**
 * @author Paraibah89
 *
 */
public class Exercicio6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner mostrarTeclado = new Scanner(System.in);
		
		System.out.println("Nota1");
		double nota1 = mostrarTeclado.nextDouble();
		
		System.out.println("Nota2");
		double nota2 = mostrarTeclado.nextDouble();
		
		System.out.println("Nota3");
		double nota3 = mostrarTeclado.nextDouble();
		
		System.out.println("Nota4");
		double nota4 = mostrarTeclado.nextDouble();
		
		System.out.println("Nota5");
		double nota5 = mostrarTeclado.nextDouble();
		
		double media = (nota1 + nota2 + nota3 + nota4 + nota5) / 4;
		
		if (media >= 7) {
			System.out.println("Aprovado");
		} else {
			System.out.println("Reprovado");
		}
		
		System.out.println("Digite a nota do exame: ");
		double notaExame = mostrarTeclado.nextDouble();
		
		if (notaExame >= 6) {
			System.out.println("Aprovado no exame");
		} else {
			System.out.println("Reprovado no exame");
		}
		
	}

}
