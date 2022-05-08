/** Crie um programa que leia quanto dinheiro uma pessoa tem na carteira e o programa
 * deve mostrar quantos dólares ela deve comprar. Considere que 1 dólar custa R$ 5,90.
 */
package lista1;

import java.util.Scanner;

/**
 * @author Paraibah89
 *
 */
public class Exercicio11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner mostrarTeclado = new Scanner(System.in);

		System.out.println("Quanto de dinheiro você tem na carteira?");
		float dinheiroCarteira = mostrarTeclado.nextFloat();

		float valorDolar = dinheiroCarteira / 5.90f;
		System.out.println("Com R$ " + dinheiroCarteira + ", você poderá comprar US$" + valorDolar);

	}
}