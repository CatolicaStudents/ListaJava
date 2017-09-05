package InicianteOito;

import java.util.Scanner;

public class MainOito {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		NumeroExtenso numero = new NumeroExtenso();
		System.out.println("Digite um valor:");
		int valor = teclado.nextInt();
		numero.setValor(valor);
		System.out.println(numero.getValorPorExtenso() + " reais");
		teclado.close();
	}
}
