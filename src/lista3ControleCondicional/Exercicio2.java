/**
 * Desenvolva um programa que pergunte a dist�ncia de uma viagem em Km. Calcule o
pre�o da passagem, cobrando R$ 0,50 por Km para viagens de at� 200Km e R$ R$ 0,45
para viagens mais longas. Exemplo: Dada a dist�ncia 1000, o sistema deve mostrar a
msg:
Voc� est� prestes a come�ar uma viagem de 1000.0Km.
O pre�o da sua passagem ser� de R$ 450.00
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
		
		System.out.println("Qual a dist�ncia percorrida em KM da sua viagem?");
		double distanciaPercorrida = mostrarTeclado.nextDouble();
		
		double precoPassagemAte200Km = (distanciaPercorrida * 0.50);
		
		double precoPassagemAcima200Km = (distanciaPercorrida * 0.45);
		
		
		if (distanciaPercorrida <= 200) {
			System.out.println("Voc� est� prestes a come�ar uma vigem de " + distanciaPercorrida + "KM " + 
		"o pre�o da sua passagem ser� de R$" + precoPassagemAte200Km);			
		}	else {
			System.out.println("Voc� est� prestes a come�ar uma vigem de " + distanciaPercorrida + "KM " + 
					"o pre�o da sua passagem ser� de R$" + precoPassagemAcima200Km);
			
		}		
	}

}
