package intermediarioTres;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Consoantes retornaConsoantes = new Consoantes();
		Scanner scan = new Scanner(System.in);
		String frase = scan.nextLine();
		frase = retornaConsoantes.consoantes(frase);
		scan.close();
		System.out.println(frase);
	}

}
