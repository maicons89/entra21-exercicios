// Entrar com a idade de uma pessoa e informar:
 //Se é maior de idade
 //Se é menor de idade
package lista3ControleCondicional;

import java.util.Scanner;

/**
 * @author Paraibah89
 *
 */
public class Exercicio4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner mostrarTeclado = new Scanner(System.in);
		
		System.out.println("Digite a sua idade");
		int idade = mostrarTeclado.nextInt();
		
		if (idade >= 18) {
			System.out.println("Maior de idade");
		} else {
			System.out.println("Menor de idade");
		}
	}
}
