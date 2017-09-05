package InicianteTres;

public class Circulo {
	private double raio;
	private double area;

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public double calculaArea() {
		this.area = Math.PI * Math.pow(getRaio(), 2);
		return this.area;
	}

}
