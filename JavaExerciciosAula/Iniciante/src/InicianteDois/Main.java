package InicianteDois;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Vendedor vendedor = new Vendedor();
		System.out.println("Insira o nome:");
		vendedor.setNome(scan.nextLine()); 
		System.out.println("Insira o salario bruto:");
		vendedor.setSalarioFixo(scan.nextDouble()); 
		System.out.println("Valor total de vendas:");
		vendedor.setSalarioVendas(scan.nextDouble());
		
		vendedor.CalcularSalario(vendedor.getSalarioFixo(),vendedor.getSalarioVendas());
		System.out.println("Salario total "+vendedor.getSalarioTotal());
	}

}
