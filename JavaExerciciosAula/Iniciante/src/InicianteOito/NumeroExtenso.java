package InicianteOito;

public class NumeroExtenso {
	private int valor;
	private int centena = 0;
	private int dezena = 0;
	private int unidade = 0;
	private int dezenasirregulares = 0; 
	private int cento = 0;

	private String descricaoCentena[] = { "", "cento", "duzentos", "trezentos",
			"quatrocentos", "quinhentos", "seiscentos", "setecentos",
			"oitocentos", "novecentos" };

	private String descricaoDezena[] = { "", "dez", "vinte", "trinta",
			"quarebta", "cinquenta", "sessenta", "setenta", "oitenta",
			"noventa" };

	private String descricaoUnidade[] = { "", "um", "dois", "três", "quatro",
			"cinco", "seis", "sete", "oito", "nove", "dez", "onze" };

	private String descricaoDezenasirregulares[] = { "", "onze", "doze",
			"treze", "quatorze", "quinze", "dezesseis", "dezessete", "dezoito",
			"dezenove" };
	
	private String descricaoCento[] = { "", "cem" };

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
		this.determinaQuantidade();
	}

	public String getValorPorExtenso() {
		StringBuilder builder = new StringBuilder();


		if( centena == 1 && (dezena == 0 && unidade == 0 && dezenasirregulares == 0) ) {
			builder.append(descricaoCento[centena]);
		} else {
			builder.append(descricaoCentena[centena]);
		}

		if (centena > 0 && (dezena > 0 || unidade > 0 || dezenasirregulares > 0 )) {
			builder.append(" e ");
		}

		builder.append(descricaoDezena[dezena]);
		if (centena > 0 && dezenasirregulares != 0 && unidade > 0) {
			builder.append(" e ");
		}
		
		builder.append(descricaoDezenasirregulares[dezenasirregulares]);
		if (centena > 0 && dezenasirregulares >= 0) {
		}
		builder.append(descricaoCento[cento]);
		builder.append(" e ");
		
		builder.append(descricaoUnidade[unidade]);
		return builder.toString();
	}

	private void determinaQuantidade() {
		while (valor >= 100) {
			valor = valor - 100;
			centena++; 
		}

		while (valor >= 10) {
			valor = valor - 10;
			dezena++;
		}
		while (valor >= 1) {
			valor = valor - 1;
			unidade++;
		}
		if (dezena == 1 && unidade >= 1) {
			dezenasirregulares = unidade;// pega posição do array
			dezena = 0;// zerou dezena
			unidade = 0;
		}
	}
}
