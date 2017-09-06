package InicianteDois;

public class Vendedor {
	private String nome;
	private double salarioFixo;
	private double salarioVendas;
	private double salarioTotal;
	public void CalcularSalario(double fixo,double vendas){
		vendas = vendas * 0.15;
		this.salarioTotal = fixo + vendas;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalarioFixo() {
		return salarioFixo;
	}
	public void setSalarioFixo(double salarioFixo) {
		this.salarioFixo = salarioFixo;
	}
	public double getSalarioVendas() {
		return salarioVendas;
	}
	public void setSalarioVendas(double salarioVendas) {
		this.salarioVendas = salarioVendas;
	}
	public double getSalarioTotal() {
		return salarioTotal;
	}
	public void setSalarioTotal(double salarioTotal) {
		this.salarioTotal = salarioTotal;
	}
	
}
