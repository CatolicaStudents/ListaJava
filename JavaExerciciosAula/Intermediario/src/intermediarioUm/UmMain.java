package intermediarioUm;
import java.util.Scanner;
public class UmMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		QtdCaracteres qtdChar = new QtdCaracteres();
		String str = scan.nextLine();
		qtdChar.qtdCaracteres(str);
		scan.close();
	}

}
