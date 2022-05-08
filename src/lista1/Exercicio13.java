/** Dado o preço de um produto, o sistema deve calcular o preço com desconto de 5%.
 * Exemplo: Dado o valor R$ 546,00, o sistema deve mostrar a mensagem: O produto que custava
 * R$ 546,00, na promoção com desconto de 5% seu produto ficará R$ 518,70.
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
		float preçoProduto = mostrarTeclado.nextFloat();

		float desconto = preçoProduto - (preçoProduto * 0.05f);

		System.out.println("O prouto que custava R$ " + preçoProduto
				+ " , na promoção com desconto de 5%, seu produto ficará R$ " + desconto);

	}
}