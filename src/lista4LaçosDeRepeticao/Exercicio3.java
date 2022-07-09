/**
 * 
 */
package lista4LaçosDeRepeticao;

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

		int voto;
		double somatorioCandidato1 = 0;
		double somatorioCandidato2 = 0;
		double somatorioCandidato3 = 0;
		double somatorioCandidato4 = 0;
		double somatorioVotosNulos5 = 0;
		double somatorioVotosEmBranco6 = 0;
		double totalDeVotos;
		double percentualVotosNulos = 0;
		double percentualVotosEmBranco = 0;

		do {

			System.out.println("\n=====================================");
			System.out.println("        Vote no seu candidato          ");
			System.out.println("======================================\n");
			System.out.println("Para candidato 1 - vote 1");
			System.out.println("Para candidato 2 - vote 2");
			System.out.println("Para candidato 3 - vote 3");
			System.out.println("Para candidato 4 - vote 4");
			System.out.println("Para votar em nulo   - vote 5");
			System.out.println("Para votar em branco - vote 6");
			System.out.println("Digite 0 para encerrar a votação");

			System.out.println("Digite o seu voto:");
			voto = mostrarTeclado.nextInt();

			if (voto < 0 || voto > 6) {
				System.out.println("Opção de voto inválida");
			}

			if (voto == 1) {
				somatorioCandidato1 = somatorioCandidato1 + 1;
			}
			if (voto == 2) {
				somatorioCandidato2 = somatorioCandidato2 + 1;
			}
			if (voto == 3) {
				somatorioCandidato3 = somatorioCandidato3 + 1;
			}
			if (voto == 4) {
				somatorioCandidato4 = somatorioCandidato4 + 1;
			}
			if (voto == 5) {
				somatorioVotosNulos5 = somatorioVotosNulos5 + 1;
			}
			if (voto == 6) {
				somatorioVotosEmBranco6 = somatorioVotosEmBranco6 + 1;
			}

		} while (voto != 0);

		System.out.println("Votações Encerradas");

		totalDeVotos = (somatorioCandidato1 + somatorioCandidato2 + somatorioCandidato3 + somatorioCandidato4
				+ somatorioVotosNulos5 + somatorioVotosEmBranco6);

		if (totalDeVotos > 0) {
			percentualVotosNulos = (somatorioVotosNulos5 / totalDeVotos) * 100;
			percentualVotosEmBranco = (somatorioVotosEmBranco6 / totalDeVotos) * 100;
		}

		System.out.println("Total de votos candidato 1: " + somatorioCandidato1);
		System.out.println("Total de votos candidato 2: " + somatorioCandidato2);
		System.out.println("Total de votos candidato 3: " + somatorioCandidato3);
		System.out.println("Total de votos candidato 4: " + somatorioCandidato4);
		System.out.println("Total de votos Nulos: " + somatorioVotosNulos5);
		System.out.println("Total de votos em Branco: " + somatorioVotosEmBranco6);
		System.out.println("Percentual de votos Nulos: " + percentualVotosNulos);
		System.out.println("Percentual de votos em Branco: " + percentualVotosEmBranco);
	}
}