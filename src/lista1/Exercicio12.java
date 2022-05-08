/** Crie um programa que leia a largura e a altura de uma parede em metros e calcule a sua área
 *  e a quantidade de tinta necessária para pintá-la, sabendo que cada litro de tinta, pinta
 *  uma área de 2 metros quadrados. Exemplo: Dados os números 3 e 2, programa deve mostrar a
 *  mensagem na tela: Sua parede tem a dimensão de 3.0x2.0 e sua área é de 6.0 metros quadrados.
 *  Você precisará de 3 litros de tinta.
 * 
 */
package lista1;

import java.util.Scanner;

/**
 * @author Paraibah89
 *
 */
public class Exercicio12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner mostrarTeclado = new Scanner(System.in);

		System.out.println("Digite a Largura da Parede em metros");
		float largura = mostrarTeclado.nextFloat();

		System.out.println("Digite a Altura da Parede em metros");
		float altura = mostrarTeclado.nextFloat();

		float area = largura * altura;
		System.out.println("Qual a sua área? " + area + " metros quadrados.");

		float litrosDeTintas = area / 2;
		System.out.println("Quantos litros de tintas, precisará para pintar a área? " + litrosDeTintas);

	}
}