package InicianteCinco;

import java.util.Scanner;

public class MainCinco {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Sequencia sequencia = new Sequencia();
		System.out.println("Numero:");
		sequencia.preencher(scan.nextInt());
		int valores[] = sequencia.getSequencia();

		for (int i = 0; i < valores.length; i++) {
			System.out.println(i+ " " + valores[i]);
		}

	}

}
