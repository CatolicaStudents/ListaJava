package AvançadoUm;

import java.util.Scanner;

public class MainBinario {

	public static void main(String[] args) {
		int valordigitado;
		Binario binario = new Binario();
		Scanner teclado = new Scanner(System.in);
		System.out.println("Qual valor deseja imprimir em binário?");
		valordigitado = teclado.nextInt();
		binario.binario(valordigitado);	
	}

}