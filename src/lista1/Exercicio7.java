package lista1;
/*
 A prefeitura de uma cidade deseja fazer uma pesquisa entre os 5 habitantes.
 Esta pesquisa deseja coletar os dados
 sobre o salário e o numero de filhos de cada habitante e após as leituras, escrever:
 a) Média de salário da população
 b) Média do número de filhos
*/

import java.util.Scanner;

/**
 * @author Paraibah89
 *
 */
public class Exercicio7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner mostrarTeclado = new Scanner(System.in);

		float salarios[] = new float[5];
		int numeroFilhos[] = new int[5];

		System.out.println("Salário do Habitante 0? ");
		float salario0 = mostrarTeclado.nextFloat();
		salarios[0] = salario0;

		System.out.println("Número de Filhos do Habitante 0? ");
		int filhos0 = mostrarTeclado.nextInt();
		numeroFilhos[0] = filhos0;

		System.out.println("Salário do Habitante 1? ");
		float salario1 = mostrarTeclado.nextFloat();
		salarios[1] = salario1;

		System.out.println("Número de Filhos do Habitante 1? ");
		int filhos1 = mostrarTeclado.nextInt();
		numeroFilhos[1] = filhos1;

		System.out.println("Salário do Habitante 2? ");
		float salario2 = mostrarTeclado.nextFloat();
		salarios[2] = salario2;

		System.out.println("Número de Filhos do Habitante 2? ");
		int filhos2 = mostrarTeclado.nextInt();
		numeroFilhos[2] = filhos2;

		System.out.println("Salário do Habitante 3? ");
		float salario3 = mostrarTeclado.nextFloat();
		salarios[3] = salario3;

		System.out.println("Número de Filhos do Habitante 3? ");
		int filhos3 = mostrarTeclado.nextInt();
		numeroFilhos[3] = filhos3;

		System.out.println("Salário do Habitante 4? ");
		float salario4 = mostrarTeclado.nextFloat();
		salarios[4] = salario4;

		System.out.println("Número de Filhos do Habitante 4? ");
		int filhos4 = mostrarTeclado.nextInt();
		numeroFilhos[4] = filhos4;

		System.out.println("Salários dos Habitantes: " + salarios[0] + " , " + salarios[1] + " , " + salarios[2] + " , "
				+ salarios[3] + " , " + salarios[4]);

		float mediaSalario = (salarios[0] + salarios[1] + salarios[2] + salarios[3] + salarios[4]) / 5;
		System.out.println("Média de Salários dos Habitantes: " + mediaSalario);

		int mediaFilhos = (numeroFilhos[0] + numeroFilhos[1] + numeroFilhos[2] + numeroFilhos[3] + numeroFilhos[4]) / 5;
		System.out.println("Média de Filhos dos Habitantes: " + mediaFilhos);
	}
}