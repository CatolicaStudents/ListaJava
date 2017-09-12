package AvançadoUm;

public class Binario {
	public void binario( int numero) {
		int aux = numero;
		StringBuffer binario = new StringBuffer();
		while(aux > 0 ){
			int aux2 = aux % 2;
			binario.append(aux2);
			aux = aux >>1;
		}
		System.out.println(binario.reverse().toString());
	}
}