package InicianteQuatro;

import java.util.Calendar;
import java.util.Date;

public class MainQuatroIniciante {
	private static Date dataInicial;
	private static Date dataFinal;
	private static final int MILI_SEGUNDOS = 1000;
	private static final int SEGUNDOS  = 60;
	private static final int MINUTOS   = 60;
	private static final int HORAS     = 24;
	
	
	public static void main(String[] args){
		
		Calendar calendario = Calendar.getInstance();
		calendario.setTimeInMillis(0);
		calendario.set(2017, 8, 15);
		dataInicial = calendario.getTime();
		calendario.set(2017, 8, 17);
		dataFinal = calendario.getTime();
		System.out.println("a data := " +  dataFinal.getTime());
		long diferencaEmMilisegundos = dataFinal.getTime() - dataInicial.getTime();
		System.out.println("Diferenca em mili := " + diferencaEmMilisegundos);
		int diferencaEmDias = (int) ( (dataFinal.getTime() - dataInicial.getTime()) 
                / (MILI_SEGUNDOS * SEGUNDOS * MINUTOS * HORAS) );
		System.out.print("Diferenca em dias := " + diferencaEmDias);
	}	
}