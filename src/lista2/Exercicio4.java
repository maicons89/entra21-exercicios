/** Uma empresa quer verificar se um empregado est� qualificado para a aposentadoria ou n�o.
Para estar em condi��es, um dos seguintes requisitos deve ser satisfeito:
Ter no m�nimo 65 anos de idade.
Ter trabalhado no m�nimo 30 anos
Ter no m�nimo 60 anos e ter trabalhado no m�nimo 25 anos
Com base nas informa��es acima leia: o n�mero do empregado (c�digo), o ano de seu nascimento e
o ano de seu ingresso na empresa. O programa dever� escrever a idade e o tempo de trabalho do
empregado e a mensagem 'Requerer aposentadoria' ou 'N�o requerer'
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

		System.out.println("N�mero do empregado");
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
		System.out.println("Tempo de Trabalho do Empregado � de: " + tempoDeTrabalho + " anos");

		if (idade >= 65) {
			System.out.println("Requer Aposentadoria");
		} else {
			if (tempoDeTrabalho >= 30) {
				System.out.println("Requer Aposentadoria");
			} else {
				if (idade >= 60 && tempoDeTrabalho >= 25) {
					System.out.println("Requer Aposentadoria");
				} else {
					System.out.println("N�o Requer Aposentadoria");
				}
			}
		}
	}
}
