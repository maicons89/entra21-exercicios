package lista1;

import java.util.Scanner;

/**Leia o n�mero da conta do cliente, seu saldo, d�bito e cr�dito. 
Calcular e escrever o saldo atual utilizando a f�rmula saldo atual= saldo - d�bito + cr�dito.
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

		System.out.println("Digite d�bito");
		float debito = mostrarTeclado.nextFloat();

		System.out.println("Digite cr�dtio");
		float credito = mostrarTeclado.nextFloat();

		float saldoAtual = saldo - debito + credito;
		System.out.println("Saldo Atual = " + saldoAtual);

	}
}