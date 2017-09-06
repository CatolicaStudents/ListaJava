package uriInicianteSenha;

import java.util.Scanner;

public class Senha {
	private String senha = "glauco2017";
	private String senhadigitada;
	public String getSenha() {
		
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getSenhadigitada() {
		return senhadigitada;
	}
	public void setSenhadigitada(String senhadigitada) {
		if (senha.equals(senhadigitada)) {
			System.out.println("Senha Correta!");
		}
		while(!senhadigitada.equals(senha)){
		System.out.println("Digite a senha novamente!");
		Scanner teclado = new Scanner(System.in);
		senhadigitada = teclado.nextLine();
		}
	}
}


