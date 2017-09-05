package InicianteUm;
import java.util.Scanner;

public class MainCalcular {

	public static void main(String[] args) {
		int a,b;
		Scanner scan = new Scanner(System.in);
		System.out.println("Valor A:");
		a = scan.nextInt();
		System.out.println("Valor B:");
		b = scan.nextInt();
		Soma soma = new Soma();
		soma.soma(a, b);
		System.out.println(soma.getResultado());
		
		
	}

}
