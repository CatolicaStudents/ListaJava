package InicianteTres;

import java.util.Scanner;

public class MainRaio {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Circulo circulo = new Circulo();
		System.out.println("Insira o raio:");
		circulo.setRaio(scan.nextDouble());
		System.out.println(circulo.calculaArea());
	}
}