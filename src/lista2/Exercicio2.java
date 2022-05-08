/**Leia o número da conta do cliente, seu saldo, débito e crédito. Calcular e escrever o saldo
atual utilizando a fórmula saldo atual = saldo - débito + crédito. Testar se saldo atual for maior ou
igual a zero escrever a mensagem 'Saldo Positivo', senão escrever a mensagem 'Saldo Negativo'.
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

		System.out.println("Insira o número da sua conta");
		int numeroConta = mostrarTeclado.nextInt();

		System.out.println("Insira o seu Saldo");
		float saldo = mostrarTeclado.nextFloat();

		System.out.println("Insira o seu Débito");
		float debito = mostrarTeclado.nextFloat();

		System.out.println("Insira o seu Crédito");
		float credito = mostrarTeclado.nextFloat();

		float saldoAtual = saldo - debito + credito;

		if (saldoAtual >= 0) {
			System.out.println("Saldo Positivo");
		} else {
			System.out.println("Saldo Negativo");
		}
	}
}
