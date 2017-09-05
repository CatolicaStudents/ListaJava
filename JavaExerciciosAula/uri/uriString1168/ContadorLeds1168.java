package uriString1168;

import java.util.Scanner;

public class ContadorLeds1168 {

	public void contadorLeds(int firstInput) {
		Scanner scan = new Scanner(System.in);

		int i = 0;
		while (i < firstInput) {
			String ledConfig = scan.nextLine();
			int j = 0;
			int numeroDeLeds = 0;
			while (j < ledConfig.length()) {

				if (ledConfig.charAt(j) == '1') {
					numeroDeLeds += 2;
				} else if (ledConfig.charAt(j) == '7') {
					numeroDeLeds += 3;
				} else if (ledConfig.charAt(j) == '4') {
					numeroDeLeds += 4;
				} else if (ledConfig.charAt(j) == '2'
						|| ledConfig.charAt(j) == '3'
						|| ledConfig.charAt(j) == '5') {
					numeroDeLeds += 5;
				} else if (ledConfig.charAt(j) == '6'
						|| ledConfig.charAt(j) == '9'
						|| ledConfig.charAt(j) == '0') {
					numeroDeLeds += 6;
				} else if (ledConfig.charAt(j) == '8') {
					numeroDeLeds += 7;
				}
				j++;
			}
			System.out.println(numeroDeLeds + " leds");
			i++;
		}
		scan.close();
	}

}
