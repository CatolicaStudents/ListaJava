package InicianteCinco;

public class Sequencia {
	private final int TAMANHO = 1000;
	private int inicio;
	private int[] sequencia = new int[TAMANHO];

	public void preencher(int valorInicio) {
		for (int i = 0; i < TAMANHO; i++) {
			sequencia[i] = valorInicio * i;
		}
	}
	public int getInicio() {
		return inicio;
	}

	public void setInicio(int inicio) {
		this.inicio = inicio;
	}

	public int[] getSequencia() {
		return sequencia;
	}

	public void setSequencia(int[] sequencia) {
		this.sequencia = sequencia;
	}

}
