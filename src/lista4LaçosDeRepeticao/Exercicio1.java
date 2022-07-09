/**Construa um algoritmo que:
* a) Leia varias fichas contendo cada uma:
* sua matricucula
* o nome de um atleta
* o seu peso
* o sexo
* a idade
* Calcule e imprima:
* O peso e a matricula do atleta mais pesado;
* A media de idade dos atletas do sexo feminino;
* A matricula e o peso do atleta masculino de menor peso.
* Obs: O programa deve finalizar quando for digitada matricula = 0
 * 
 */
package lista4LaçosDeRepeticao;

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

		String nomeAtleta;
		int matricula = 1;
		int idade;
		String sexo;
		int matriculaMaisPesado = 0;
		int matriculaMenorPeso = 0;
		double peso;
		double maiorPeso = 0;
		double menorPeso = 0;
		double somaIdade = 0;
		double quantidadeSexoFeminino = 0;
		double media = 0;

		while (matricula != 0) {

			System.out.println("Digite a sua matrícula: ");
			matricula = mostrarTeclado.nextInt();

			if (matricula == 0) {
				break;
			} else {

				System.out.println("Digite o nome do Atleta: ");
				nomeAtleta = mostrarTeclado.nextLine();

				mostrarTeclado.nextLine();

				System.out.println("Digite o seu peso: ");
				peso = mostrarTeclado.nextDouble();

				System.out.println("Digite o seu sexo (M) Masculino (F) Feminino : ");
				sexo = mostrarTeclado.nextLine();

				mostrarTeclado.nextLine();

				System.out.println("Digite a sua idade: ");
				idade = mostrarTeclado.nextInt();

				mostrarTeclado.nextLine();

				if (peso > maiorPeso) {
					maiorPeso = peso;
					matriculaMaisPesado = matricula;
				}

				if (sexo.equalsIgnoreCase("M")) {
					if (peso < menorPeso) {
						menorPeso = peso;
						matriculaMenorPeso = matricula;
					}
				}

				if (sexo.equalsIgnoreCase("F")) {
					somaIdade = somaIdade + idade;
					quantidadeSexoFeminino = quantidadeSexoFeminino + 1;
				}

			}
			if (quantidadeSexoFeminino != 0) {
				media = somaIdade / quantidadeSexoFeminino;
			}

			System.out.println("Este é o maior peso " + maiorPeso + "KG" + " e a matricula do atleta mais pesado é "
					+ matriculaMaisPesado);

			System.out.println("A média de idade dos atletas do sexo feminino é de: " + media);
			System.out.println(
					"A matricula " + matriculaMenorPeso + " e o menor peso " + menorPeso + " do atleta masculino");
		}
	}
}