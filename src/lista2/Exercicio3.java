/**Uma fruteira está vendendo frutas com a seguinte tabela de preços:
 * Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra ultrapassar R$ 25,00,
receberá ainda um desconto de 10% sobre este total. Escreva um algoritmo para ler a
quantidade (em Kg) de morangos e a quantidade (em Kg) de maças adquiridas e escreva o
valor a ser pago pelo cliente. 
 * 
 */
package lista2;

import java.util.Scanner;

/**
 * @author Paraibah89
 *
 */
public class Exercicio3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner mostrarTeclado = new Scanner(System.in);

		double kgMorango, kgMaca, valorPago, kgFrutas, valorPago2;

		System.out.println("Quantos kg de morangos foram comprados :");
		kgMorango = mostrarTeclado.nextInt();

		System.out.println("Quantos kg de maças foram comprados :");
		kgMaca = mostrarTeclado.nextInt();

		kgFrutas = (kgMorango + kgMaca);

		if (kgFrutas <= 5) {
			valorPago = (kgMorango * 2.5) + (kgMaca * 1.8);
		} else if (kgFrutas > 5 && kgFrutas <= 8) {
			valorPago = (kgMorango * 2.2) + (kgMaca * 1.5);
		} else {
			valorPago2 = (kgMorango * 2.2) + (kgMaca * 1.5);
			valorPago = valorPago2 * 0.9;
		}

		System.out.println("Valor a ser pago: R$ " + valorPago);
	}
}
