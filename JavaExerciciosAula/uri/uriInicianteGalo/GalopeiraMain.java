package uriInicianteGalo;

import java.util.Scanner;

public class GalopeiraMain {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Galopeira galopeira = new Galopeira();
		System.out.println("Preparar para o famoso Galopeira! Apenas para praticar a digita��o! Ap�s o Enter ser� inicializado a contagem!");
		galopeira.setGalo(teclado.nextLine());
	}

}
