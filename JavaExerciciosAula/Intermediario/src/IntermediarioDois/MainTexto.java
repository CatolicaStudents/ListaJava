package IntermediarioDois;

import java.util.Scanner;

public class MainTexto {

	public static void main(String[] args) {
				
		Scanner scan = new Scanner(System.in);
		System.out.println("Frase: ");
		Texto texto = new Texto ();
		texto.setFrase(scan.nextLine());
		
		System.out.println("   Inverso: " +texto.getInverso());
		System.out.println("Palindromo: " +texto.palindromo());
	}

}