package lista1;

import java.util.Scanner;

/**Leia o número da conta do cliente, seu saldo, débito e crédito. 
Calcular e escrever o saldo atual utilizando a fórmula saldo atual= saldo - débito + crédito.
 * 
 */

/**
 * @author Paraibah89
 *
 */
public class Exercicio6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner mostrarTeclado = new Scanner(System.in);

		System.out.println("Digite conta do cliente");
		int contacliente = mostrarTeclado.nextInt();

		System.out.println("Digite saldo");
		float saldo = mostrarTeclado.nextFloat();

		System.out.println("Digite débito");
		float debito = mostrarTeclado.nextFloat();

		System.out.println("Digite crédtio");
		float credito = mostrarTeclado.nextFloat();

		float saldoAtual = saldo - debito + credito;
		System.out.println("Saldo Atual = " + saldoAtual);

	}
}