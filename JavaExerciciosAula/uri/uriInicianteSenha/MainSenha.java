package uriInicianteSenha;

import java.util.Scanner;

public class MainSenha {

	public static void main(String[] args) {
		Senha senha = new Senha();
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite a senha:");
		senha.setSenhadigitada(teclado.nextLine());
		
	}

}
