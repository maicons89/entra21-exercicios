/** Dado o preï¿½o de um produto, o sistema deve calcular o preï¿½o com desconto de 5%.
 * Exemplo: Dado o valor R$ 546,00, o sistema deve mostrar a mensagem: O produto que custava
 * R$ 546,00, na promoï¿½ï¿½o com desconto de 5% seu produto ficarï¿½ R$ 518,70.
 * 
 */
package lista1;

import java.util.Scanner;

/**
 * @author Paraibah89
 *
 */
public class Exercicio13 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner mostrarTeclado = new Scanner(System.in);

		System.out.println("Qual o preço do produto?");
		float precoPoduto = mostrarTeclado.nextFloat();

		float desconto = precoPoduto - (precoPoduto * 0.05f);

		System.out.println("O prouto que custava R$ " + precoPoduto
				+ " , na promoção com desconto de 5%, seu produto ficaria R$ " + desconto);

	}
}