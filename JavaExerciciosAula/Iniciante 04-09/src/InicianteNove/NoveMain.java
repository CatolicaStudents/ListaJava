package InicianteNove;

import java.util.Scanner;

public class NoveMain {

	public static void main(String[] args) {
		int valorSaque;
		Scanner scan = new Scanner(System.in);
		System.out.println("Valor saque:");
		valorSaque = scan.nextInt();
		Nota notas = new Nota();
		notas.exibeQtdNotas(valorSaque);
		scan.close();
		
		System.out.println("Notas de 100:" + notas.getNota100() + "\nNotas de 50:"
				+ notas.getNota50() + "\nNotas de 20:" + notas.getNota20() + "\nNotas de 10:"
				+ notas.getNota10() + "\nNotas de 5:" + notas.getNota5()   + "\nNotas de 2:"
				+ notas.getNota2()  + "\nNotas 1:" + notas.getNota1());
		
	}

}
