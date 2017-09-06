package uriInicianteGalo;

import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;


public class Galopeira {
	
	private String Galo;
	
	public String getGalo() {
		return Galo;
	}
	public void setGalo(String galo) {
		Scanner teclado = new Scanner(System.in);
		long tempoinicio = System.currentTimeMillis();
		System.out.println("Preparar para Galopeira, Valendo!!");
		teclado.hasNextLine();
		long tempodif = (System.currentTimeMillis() - tempoinicio);
		String tempoaux = Long.toString(tempodif);
        tempoaux = SimpleDateFormat.getTimeInstance(SimpleDateFormat.MEDIUM).format(tempodif);
        System.out.println("Tempo em segundos " + new SimpleDateFormat("mm:ss").format(new Date(tempodif)));
	}		
}
