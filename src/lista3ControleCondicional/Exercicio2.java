/**
 * Desenvolva um programa que pergunte a distância de uma viagem em Km. Calcule o
preço da passagem, cobrando R$ 0,50 por Km para viagens de até 200Km e R$ R$ 0,45
para viagens mais longas. Exemplo: Dada a distância 1000, o sistema deve mostrar a
msg:
Você está prestes a começar uma viagem de 1000.0Km.
O preço da sua passagem será de R$ 450.00
 */
package lista3ControleCondicional;

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
		
		System.out.println("Qual a distância percorrida em KM da sua viagem?");
		double distanciaPercorrida = mostrarTeclado.nextDouble();
		
		double precoPassagemAte200Km = (distanciaPercorrida * 0.50);
		
		double precoPassagemAcima200Km = (distanciaPercorrida * 0.45);
		
		
		if (distanciaPercorrida <= 200) {
			System.out.println("Você está prestes a começar uma vigem de " + distanciaPercorrida + "KM " + 
		"o preço da sua passagem será de R$" + precoPassagemAte200Km);			
		}	else {
			System.out.println("Você está prestes a começar uma vigem de " + distanciaPercorrida + "KM " + 
					"o preço da sua passagem será de R$" + precoPassagemAcima200Km);
			
		}		
	}

}
