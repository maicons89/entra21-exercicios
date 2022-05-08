/** Uma empresa quer verificar se um empregado está qualificado para a aposentadoria ou não.
Para estar em condições, um dos seguintes requisitos deve ser satisfeito:
Ter no mínimo 65 anos de idade.
Ter trabalhado no mínimo 30 anos
Ter no mínimo 60 anos e ter trabalhado no mínimo 25 anos
Com base nas informações acima leia: o número do empregado (código), o ano de seu nascimento e
o ano de seu ingresso na empresa. O programa deverá escrever a idade e o tempo de trabalho do
empregado e a mensagem 'Requerer aposentadoria' ou 'Não requerer'
 * 
 */
package lista2;

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

		System.out.println("Número do empregado");
		int numeroDoEmpregado = mostrarTeclado.nextInt();

		System.out.println("Insira data de nascimento");
		int dataNascimento = mostrarTeclado.nextInt();

		System.out.println("Insira o ano de ingresso na empresa");
		int anoIngressoEmpresa = mostrarTeclado.nextInt();

		System.out.println("Ano Atual");
		int anoAtual = mostrarTeclado.nextInt();

		int idade = anoAtual - dataNascimento;
		System.out.println("Idade do Empregado: " + idade);

		int tempoDeTrabalho = anoAtual - anoIngressoEmpresa;
		System.out.println("Tempo de Trabalho do Empregado é de: " + tempoDeTrabalho + " anos");

		if (idade >= 65) {
			System.out.println("Requer Aposentadoria");
		} else {
			if (tempoDeTrabalho >= 30) {
				System.out.println("Requer Aposentadoria");
			} else {
				if (idade >= 60 && tempoDeTrabalho >= 25) {
					System.out.println("Requer Aposentadoria");
				} else {
					System.out.println("Não Requer Aposentadoria");
				}
			}
		}
	}
}
