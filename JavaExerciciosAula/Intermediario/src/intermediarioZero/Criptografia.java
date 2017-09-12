package intermediarioZero;

public class Criptografia {
	public String cifar(String frase) {
		StringBuffer cifrado = new StringBuffer();
		for (int i = 0; i < frase.length(); i++) {
			char letraAtual = frase.charAt(i);
			char substituta = (char) (letraAtual + 3);
			if (substituta == 91) {
				substituta = 65;
			} else if (substituta == 92) {
				substituta = 66;
			} else if (substituta == 93) {
				substituta = 67;
			}
			cifrado.append(substituta);
		}

		System.out.println("*************************");
		return cifrado.toString();
	}
}