/**Uma empresa fez uma pesquisa para saber se as pessoas gostaram ou não de um
novo produto lançado no mercado. A resposta, portanto, era “sim” ou “não”.
Calcule e escreva o número de pessoas que responderam “sim” e o número de
pessoas que responderam “não”. Simule para 5 pessoas.
 * 
 */
package lista3ControleCondicional;

import java.util.Scanner;

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

		int quantidadeDeSim = 0;
		int quantidadeDeNao = 0;

		System.out.println("Primeira Pessoa");
		String primeiraPessoa = mostrarTeclado.nextLine();
		if (primeiraPessoa.equalsIgnoreCase("sim")) {
			quantidadeDeSim = quantidadeDeSim + 1;
		} else {
			quantidadeDeNao = quantidadeDeNao + 1;
		}

		System.out.println("Segunda Pessoa");
		String segundaPessoa = mostrarTeclado.nextLine();
		if (segundaPessoa.equalsIgnoreCase("sim")) {
			quantidadeDeSim = quantidadeDeSim + 1;
		} else {
			quantidadeDeNao = quantidadeDeNao + 1;
		}

		System.out.println("Terceira Pessoa");
		String terceiraPessoa = mostrarTeclado.nextLine();
		if (terceiraPessoa.equalsIgnoreCase("sim")) {
			quantidadeDeSim = quantidadeDeSim + 1;
		} else {
			quantidadeDeNao = quantidadeDeNao + 1;
		}

		System.out.println("Quarta Pessoa");
		String quartaPessoa = mostrarTeclado.nextLine();
		if (quartaPessoa.equalsIgnoreCase("sim")) {
			quantidadeDeSim = quantidadeDeSim + 1;
		} else {
			quantidadeDeNao = quantidadeDeNao + 1;
		}

		System.out.println("Quinta Pessoa");
		String quintaPessoa = mostrarTeclado.nextLine();
		if (quintaPessoa.equalsIgnoreCase("sim")) {
			quantidadeDeSim = quantidadeDeSim + 1;
		} else {
			quantidadeDeNao = quantidadeDeNao + 1;
		}

		System.out.println("Pessoas que responderam sim: " + quantidadeDeSim);

		System.out.println("Pessoas que responderam não: " + quantidadeDeNao);
	}
}