/**Uma empresa fez uma pesquisa para saber se as pessoas gostaram ou n�o de um
novo produto lan�ado no mercado. A resposta, portanto, era �sim� ou �n�o�.
Calcule e escreva o n�mero de pessoas que responderam �sim� e o n�mero de
pessoas que responderam �n�o�. Simule para 5 pessoas.
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

		System.out.println("Pessoas que responderam n�o: " + quantidadeDeNao);
	}
}