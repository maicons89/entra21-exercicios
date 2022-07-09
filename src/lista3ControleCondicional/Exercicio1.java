/** Escreva um programa que leia a velocidade de um carro. Se ele ultrapassar 80 km/h,
mostre uma mensagem dizendo que ele foi multado. A multa vai custar R$ 7,00 por
cada km acima do limite. Exemplo: Dado o número: 100, o sistema deve mostrar a
msg:
MULTADO! Você excedeu o limite permitido que é de 80Km/h.
Você deve pagar uma multa de R$140.00!
Caso o usuário digite a velocidade, 78 km/h, o sistema deve mostrar a msg:
Muito bem! Tudo certo! Dirija com segurança!
 * 
 */
package lista3ControleCondicional;

import java.util.Scanner;

/**
 * @author Paraibah89
 *
 */
public class Exercicio1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner mostrarTeclado = new Scanner(System.in);

		System.out.println("Insira a velocidade do carro");
		int velocidadeDoCarro = mostrarTeclado.nextInt();

		int velocidadePardal = (velocidadeDoCarro - 80);

		double valorDaMulta = (7.00 * velocidadePardal);

		if (velocidadeDoCarro > 80) {
			System.out.println("Você foi multado");

			System.out.println("Você deve pagar o valor de R$ " + valorDaMulta);
		} else {
			System.out.println("Muito bem! Tudo certo! Dirija com segurança");
		}

	}

}
