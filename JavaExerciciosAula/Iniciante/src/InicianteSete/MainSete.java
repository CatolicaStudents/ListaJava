package InicianteSete;
import java.util.Scanner;

public class MainSete {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Sequencia seq = new Sequencia();
		System.out.println("Insira o numero:");
		seq.preencher(scan.nextInt());
		int valores[] = seq.getSequencia();
		
		for(int i = 0;i< valores.length;i++){
			System.out.println(i+ " " + valores[i]);
			
		}
	}

}
