/**
 * 
 */
package lista5EstruturaDeDados;

import java.util.Scanner;

/**
 * @author isado
 *
 */
public class Exercicio2B {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner mostrarTeclado = new Scanner(System.in);

		double numerosInteiros[] = new double[10];
		
		System.out.println("Digite o primeiro n�mero inteiro: ");
		double numerosInteiros0 = mostrarTeclado.nextDouble();
		numerosInteiros[0] = numerosInteiros0;
		
		System.out.println("Digite o segundo n�mero inteiro: ");
		double numerosInteiros1 = mostrarTeclado.nextDouble();
		numerosInteiros[1] = numerosInteiros1;
		
		System.out.println("Digite o terceiro n�mero inteiro: ");
		double numerosInteiros2 = mostrarTeclado.nextDouble();
		numerosInteiros[2] = numerosInteiros2;
		
		System.out.println("Digite o quarto n�mero inteiro: ");
		double numerosInteiros3 = mostrarTeclado.nextDouble();
		numerosInteiros[3] = numerosInteiros3;
		
		System.out.println("Digite o quinto n�mero inteiro: ");
		double numerosInteiros4 = mostrarTeclado.nextDouble();
		numerosInteiros[4] = numerosInteiros4;
		
		System.out.println("Digite o sexto n�mero inteiro: ");
		double numerosInteiros5 = mostrarTeclado.nextDouble();
		numerosInteiros[5] = numerosInteiros5;
		
		System.out.println("Digite o s�timo n�mero inteiro: ");
		double numerosInteiros6 = mostrarTeclado.nextDouble();
		numerosInteiros[6] = numerosInteiros6;
		
		System.out.println("Digite o oitavo n�mero inteiro: ");
		double numerosInteiros7 = mostrarTeclado.nextDouble();
		numerosInteiros[7] = numerosInteiros7;
		
		System.out.println("Digite o nono n�mero inteiro: ");
		double numerosInteiros8 = mostrarTeclado.nextDouble();
		numerosInteiros[8] = numerosInteiros8;
		
		System.out.println("Digite o d�cimo n�mero inteiro: ");
		double numerosInteiros9 = mostrarTeclado.nextDouble();
		numerosInteiros[9] = numerosInteiros9;
		System.out.println();
		
		for (int i = 9; i >= 0; i--) {
			System.out.println(numerosInteiros[i]);
		
	}
	}
}
