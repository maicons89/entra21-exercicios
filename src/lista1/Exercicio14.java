/** Dado o sal�rio de um funcion�rio, o programa deve calcular o sal�rio com 15% de aumento.
 * Exemplo: Dado o sal�rio R$ 3.500,00 o sistema deve mostrar a msg: Um funcion�rio que ganhava 
 * R$ 3.500,00, com 15% de aumento, passa a receber R$ 4025,00.
 * 
 */
package lista1;

import java.util.Scanner;

/**
 * @author Paraibah89
 *
 */
public class Exercicio14 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner mostrarTeclado = new Scanner(System.in);

		System.out.println("Digite o sal�rio do funcion�rio");
		float salarioFuncionario = mostrarTeclado.nextFloat();

		float aumento = salarioFuncionario + (salarioFuncionario * 0.15f);

		System.out.println("Um funcion�rio que ganhava R$ " + salarioFuncionario
				+ ",com 15% de aumento, passa a receber R$ " + aumento);

	}
}