package InicianteSete;

public class Sequencia {
	private final int TAMANHO = 1000;
	private int [] sequencia = new int[TAMANHO];
	
	public int[] getSequencia() {
		return sequencia;
	}

	public void setSequencia(int[] sequencia) {
		this.sequencia = sequencia;
	}

	public void preencher(int entrada) {
		int j = 0;
		int i = 0;
		while (j < 1000) {
			sequencia[j] = i;
			i++;
			j++;
			if(i > entrada){
				i = 0;
			}
		}	
	}
}

