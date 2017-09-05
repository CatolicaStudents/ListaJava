package uriString2484;
import java.util.Scanner;

public class Main2484 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a frase");
		String frase = scan.nextLine();
		Abracadabra2484 abracadabra = new Abracadabra2484();
		System.out.println(abracadabra.abra(frase));
		scan.close();
		
	}

}
