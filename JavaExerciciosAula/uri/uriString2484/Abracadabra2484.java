package uriString2484;

public class Abracadabra2484 {
	public String abra(String texto) {
		StringBuffer buffer = new StringBuffer();
		int i = 0;
		int j = 0;
		int z = 0;
		int espacos = 1;
		char strChar[] = texto.toCharArray();
		int tamanho = texto.length();
		int fim = texto.length();
		while (z < tamanho) {
			while (j <= espacos) {
				buffer.append(" ");
				j++;
			}

			while (i < fim) {
				char charDavez = strChar[i];
				buffer.append(charDavez);
				buffer.append(" ");
				i++;
			}
			i = 0;
			j = 0;
			fim--;
			espacos++;
			z++;
			buffer.append("\n");
		}
		return buffer.toString();
	}
}
