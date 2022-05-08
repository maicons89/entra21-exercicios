/** Crie um programa que leia a largura e a altura de uma parede em metros e calcule a sua �rea
 *  e a quantidade de tinta necess�ria para pint�-la, sabendo que cada litro de tinta, pinta
 *  uma �rea de 2 metros quadrados. Exemplo: Dados os n�meros 3 e 2, programa deve mostrar a
 *  mensagem na tela: Sua parede tem a dimens�o de 3.0x2.0 e sua �rea � de 6.0 metros quadrados.
 *  Voc� precisar� de 3 litros de tinta.
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
		System.out.println("Qual a sua �rea? " + area + " metros quadrados.");

		float litrosDeTintas = area / 2;
		System.out.println("Quantos litros de tintas, precisar� para pintar a �rea? " + litrosDeTintas);

	}
}