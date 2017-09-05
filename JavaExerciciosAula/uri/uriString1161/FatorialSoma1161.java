package uriString1161;

public class FatorialSoma1161 {
	public int soma2Fats(int a, int b) {
		int i = a - 1;
		int primeiroFat = a;
		int segundoFat = b;

		while (i > 0) {
			primeiroFat = primeiroFat * i;
			i--;
		}
		int j = b - 1;

		while (j > 0) {
			segundoFat = segundoFat * j;
			j--;
		}
		if (a == 0) {
			primeiroFat = 1;
		}
		if (b == 0) {
			segundoFat = 1;
		}

		return primeiroFat + segundoFat;
	}
}
