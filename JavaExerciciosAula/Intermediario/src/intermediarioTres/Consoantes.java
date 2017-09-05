package intermediarioTres;

public class Consoantes {
	public String consoantes(String original) {
		String retorno = original;
		retorno = retorno.toLowerCase();
		retorno = retorno.replaceAll("a", "").replaceAll("e", "")
				.replaceAll("i", "").replaceAll("o", "").replaceAll("u","");
		return retorno;
	}
}