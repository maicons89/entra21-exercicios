/**
 * 
 */
package lista4LaçosDeRepeticao;

import java.util.Scanner;

/**
 * @author Paraibah89
 *
 */
public class Exercicio4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner mostrarTeclado = new Scanner(System.in);

		int grauInstrucao;
		int quantidadeSexoFeminino = 0;
		int totalDeCandidatos = 0;
		int somatorioGrau1 = 0;
		int somatorioGrau2 = 0;
		int mulheresSegundoGrau = 0;
		double quantidadeSexoMasculino = 0;
		double homensTerceiroGrau = 0;
		double porcentagemHomensTerceiroGrau = 0;
		String sexo;

		do {

			System.out.println("\n=====================================");
			System.out.println("        Concurso Auxiliar de Justica    ");
			System.out.println("======================================\n");
			System.out.println("Digite 0 para sair");
			System.out.println("Digite o seu grau de instrucao 1 -> Segundo Grau e 2 -> Terceiro Grau");
			grauInstrucao = mostrarTeclado.nextInt();
			mostrarTeclado.nextLine();
			if (grauInstrucao == 1) {
				somatorioGrau1 = somatorioGrau1 + 1;
			} else if (grauInstrucao == 2) {
				somatorioGrau2 = somatorioGrau2 + 1;
			} else if (grauInstrucao == 0) {
				System.out.println("Programa Finalizado");
				break;
			}

			System.out.println("Digite o seu sexo M (Masculino) e F (Feminino):");
			sexo = mostrarTeclado.nextLine();

			totalDeCandidatos = (somatorioGrau1 + somatorioGrau2);

			if (sexo.equalsIgnoreCase("M")) {
				if (grauInstrucao == 2) {
					homensTerceiroGrau = homensTerceiroGrau + 1;
				}
				quantidadeSexoMasculino = quantidadeSexoMasculino + 1;
			}
			if (sexo.equalsIgnoreCase("F")) {
				if (grauInstrucao == 1) {
					mulheresSegundoGrau = mulheresSegundoGrau + 1;
				}
				quantidadeSexoFeminino = quantidadeSexoFeminino + 1;
			}

		} while (grauInstrucao != 0);

		if (homensTerceiroGrau > 0)
			porcentagemHomensTerceiroGrau = (homensTerceiroGrau / quantidadeSexoMasculino) * 100;

		System.out.println("Total de candidatos: " + totalDeCandidatos);
		System.out.println("Total de candidatos do sexo masculino: " + quantidadeSexoMasculino);
		System.out.println("Total de candidatos do sexo feminino: " + quantidadeSexoFeminino);
		System.out.println("Número de mulheres com apenas o 2º grau: " + mulheresSegundoGrau);
		System.out.println("Porcentagem de homens com terceiro grau em relação ao total de homens inscritos: "
				+ porcentagemHomensTerceiroGrau + "%");
	}
}