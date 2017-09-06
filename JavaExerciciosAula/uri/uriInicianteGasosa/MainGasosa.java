package uriInicianteGasosa;

import java.util.Scanner;

public class MainGasosa {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Gasosa gasosa = new Gasosa();
		System.out.println("Digite a quantidade de horas na viagem");	
		gasosa.setTmpgst(teclado.nextDouble());
		System.out.println("Digite a velocidade média em KM/H");
		gasosa.setVelmed(teclado.nextDouble());
		System.out.println(gasosa.getGasosa(0));	
	}

}
