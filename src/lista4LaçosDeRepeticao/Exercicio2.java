/**
 * 
 */
package lista4LaçosDeRepeticao;

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

		String login = "maicon";
		String senha = "santos";
		String loginDigitado;
		String senhaDigitada;

		for (int i = 0; i < 3; i++) {

			System.out.println("Digite o seu login: ");
			loginDigitado = mostrarTeclado.nextLine();

			System.out.println("Digite a sua senha: ");
			senhaDigitada = mostrarTeclado.nextLine();

			if (login.equalsIgnoreCase(loginDigitado) && senha.equalsIgnoreCase(senhaDigitada)) {
				System.out.println("Bem vindo");
				break;
			}
			if (senhaDigitada != senha)
				;
			System.out.println("Senha Digitada Incorreta");

			if (loginDigitado != login)
				;
			System.out.println("Login Incorreto");

			if (i == 2) {
				System.out.println("Cadastro Bloqueado");
			}
		}
	}

}
