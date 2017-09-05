package uriIniciante2006;

import java.util.Scanner;

public class UriIncianteTea {
	private final int numberOfPlayers = 5;
	
	public int sumOfCorrectTea(int correctTea){
		int sumOfCorrectAnswer = 0;
		int i =0;
		Scanner scan = new Scanner(System.in);
		while(i < numberOfPlayers){
			int answer = scan.nextInt();
			if(answer == correctTea){
				sumOfCorrectAnswer++;
			}
			i++;
		}
		scan.close();
		return sumOfCorrectAnswer;
	}
}
