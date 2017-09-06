package InicianteSeis;

import java.util.Scanner;

public class MainImpares {

	public static void main(String[] args) {
		Impares impar = new Impares ();
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o primeiro numero: ");
		impar.setNum1( teclado.nextInt());
		System.out.println("Digite o segundo numero: ");
		impar.setNum2(teclado.nextInt());
		System.out.println("Soma dos impares é: "+ impar.soma());
	}

}
