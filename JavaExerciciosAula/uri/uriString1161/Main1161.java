package uriString1161;

import java.util.Scanner;

public class Main1161 {

	public static void main(String[] args) {

		FatorialSoma1161 fatSum = new FatorialSoma1161();
		Scanner scan = new Scanner(System.in);
		int primeiroNum = scan.nextInt();
		int segundoNum = scan.nextInt();
		int amostra = fatSum.soma2Fats(primeiroNum, segundoNum);
		System.out.println(amostra);
		scan.close();

	}

}
