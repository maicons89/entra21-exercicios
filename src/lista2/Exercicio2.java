/**Leia o n�mero da conta do cliente, seu saldo, d�bito e cr�dito. Calcular e escrever o saldo
atual utilizando a f�rmula saldo atual = saldo - d�bito + cr�dito. Testar se saldo atual for maior ou
igual a zero escrever a mensagem 'Saldo Positivo', sen�o escrever a mensagem 'Saldo Negativo'.
 * 
 */
package lista2;

import java.util.Scanner;

/**
 * @author Paraibah89
 *
 */
public class Exercicio2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner mostrarTeclado = new Scanner(System.in);

		System.out.println("Insira o n�mero da sua conta");
		int numeroConta = mostrarTeclado.nextInt();

		System.out.println("Insira o seu Saldo");
		float saldo = mostrarTeclado.nextFloat();

		System.out.println("Insira o seu D�bito");
		float debito = mostrarTeclado.nextFloat();

		System.out.println("Insira o seu Cr�dito");
		float credito = mostrarTeclado.nextFloat();

		float saldoAtual = saldo - debito + credito;

		if (saldoAtual >= 0) {
			System.out.println("Saldo Positivo");
		} else {
			System.out.println("Saldo Negativo");
		}
	}
}
