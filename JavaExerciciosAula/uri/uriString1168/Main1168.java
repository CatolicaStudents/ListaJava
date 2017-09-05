package uriString1168;

import java.util.Scanner;

public class Main1168 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int firstInput = scan.nextInt();
		ContadorLeds1168 contLeds = new ContadorLeds1168();
		contLeds.contadorLeds(firstInput);
		scan.close();
	}

}
