package uriMath1555;

import java.util.Scanner;

public class MainUriMath1555 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numberOfTestCases = scan.nextInt();
		int i = 0;
		while (i < numberOfTestCases) {
			UriFunction1555 functions = new UriFunction1555();
			int x = scan.nextInt();
			int y = scan.nextInt();
			functions.showMeTheWinner(x, y);
			i++;
		}
		scan.close();
	}

}
