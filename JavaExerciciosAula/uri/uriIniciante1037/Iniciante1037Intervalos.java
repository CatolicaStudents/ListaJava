package uriIniciante1037;

public class Iniciante1037Intervalos {
	public static final String Q1 = "Intervalo [0,25]";
	public static final String Q2 = "Intervalo (25,50]";
	public static final String Q3 = "Intervalo (50,100]";
	
	public String intervalo100(double entrada) {
		String primeiroQuartil = "Intervalo [0,25]";
		String segundoQuartil = "Intervalo (25,50]";
		String terceiroQuartil = "Intervalo (25,50]";
		return (entrada >= 0 && entrada <= 25) ? primeiroQuartil
				: (entrada > 25 && entrada <= 50) ? segundoQuartil
						: (entrada > 50 && entrada <= 100) ? terceiroQuartil
								: "erro";

	}
	
	
	public String intervaloV2(double entrada) {
		String quartil[] = {"Intervalo [0,25]", "Intervalo (25,50]","Intervalo (50,100]"};
		int indice = (int) (entrada / 25);
		System.out.println( "Posicao " + indice );
		return quartil[ indice ];
	}
}
