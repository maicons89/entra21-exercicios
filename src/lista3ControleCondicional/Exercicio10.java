/**
 * A prefeitura de uma cidade deseja fazer uma pesquisa entre seus habitantes. Esta
pesquisa deseja coletar os dados sobre o sal�rio e n�mero de filhos de cada habitante
e ap�s as leituras, escrever:
a) M�dia de sal�rio da popula��o
b) M�dia do n�mero de filhos
c) Maior sal�rio dos habitantes
d) Percentual de pessoas com sal�rio menor que R$ 150,00
Considere a popula��o para 5 pessoas.
 */
package lista3ControleCondicional;

import java.util.Scanner;

/**
 * @author Paraibah89
 *
 */
public class Exercicio10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner mostrarTeclado = new Scanner(System.in);

		double maiorSalario = 0;

		int pessoasSalarioMenorQue150 = 0;

		System.out.println("Sal�rio pessoa 1");
		double salarioPessoa1 = mostrarTeclado.nextDouble();
		maiorSalario = salarioPessoa1;
		if (salarioPessoa1 < 150) {
			pessoasSalarioMenorQue150 = pessoasSalarioMenorQue150 + 1;
		}

		System.out.println("Quantidade de filhos pessoa 1");
		double quantidadeFilhosPessoa1 = mostrarTeclado.nextDouble();

		System.out.println("Sal�rio pessoa 2");
		double salarioPessoa2 = mostrarTeclado.nextDouble();
		if (salarioPessoa2 > maiorSalario) {
			maiorSalario = salarioPessoa2;
		}
		if (salarioPessoa2 < 150) {
			pessoasSalarioMenorQue150 = pessoasSalarioMenorQue150 + 1;
		}

		System.out.println("Quantidade de filhos pessoa 2");
		double quantidadeFilhosPessoa2 = mostrarTeclado.nextDouble();

		System.out.println("Sal�rio pessoa 3");
		double salarioPessoa3 = mostrarTeclado.nextDouble();
		if (salarioPessoa3 > maiorSalario) {
			maiorSalario = salarioPessoa3;
		}
		if (salarioPessoa3 < 150) {
			pessoasSalarioMenorQue150 = pessoasSalarioMenorQue150 + 1;
		}

		System.out.println("Quantidade de filhos pessoa 3");
		double quantidadeFilhosPessoa3 = mostrarTeclado.nextDouble();

		System.out.println("Sal�rio pessoa 4");
		double salarioPessoa4 = mostrarTeclado.nextDouble();
		if (salarioPessoa4 > maiorSalario) {
			maiorSalario = salarioPessoa4;
		}
		if (salarioPessoa4 < 150) {
			pessoasSalarioMenorQue150 = pessoasSalarioMenorQue150 + 1;
		}

		System.out.println("Quantidade de filhos pessoa 4");
		double quantidadeFilhosPessoa4 = mostrarTeclado.nextDouble();

		System.out.println("Sal�rio pessoa 5");
		double salarioPessoa5 = mostrarTeclado.nextDouble();
		if (salarioPessoa5 > maiorSalario) {
			maiorSalario = salarioPessoa5;
		}
		if (salarioPessoa5 < 150) {
			pessoasSalarioMenorQue150 = pessoasSalarioMenorQue150 + 1;
		}

		System.out.println("Quantidade de filhos pessoa 5");
		double quantidadeFilhosPessoa5 = mostrarTeclado.nextDouble();

		double mediaSalario = (salarioPessoa1 + salarioPessoa2 + salarioPessoa3 + salarioPessoa4 + salarioPessoa5) / 5;
		System.out.println("M�dia de sal�rio da Popula��o: " + mediaSalario);

		double mediaQuantidadeFilhos = (quantidadeFilhosPessoa1 + quantidadeFilhosPessoa2 + quantidadeFilhosPessoa3
				+ quantidadeFilhosPessoa4 + quantidadeFilhosPessoa5) / 5;

		System.out.println("M�dia n�mero de Filhos da popula��o: " + mediaQuantidadeFilhos);

		System.out.println("Maior Sal�rio dos Habitante: " + maiorSalario);

		double percentualPessoasSalarioMenor150 = (pessoasSalarioMenorQue150 * 100) / 5;

		System.out.println("Percentual de sal�rios com sal�rio menor que 150: " + percentualPessoasSalarioMenor150);

	}

}
