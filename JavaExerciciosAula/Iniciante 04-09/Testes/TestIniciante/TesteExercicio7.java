package TestIniciante;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;

import InicianteSeis.Impares;
import InicianteSete.Sequencia;
import InicianteUm.Soma;

public class TesteExercicio7 {

	@Test
	public void testeum() {
		final int CORRETO = 3;
		Sequencia seq = new Sequencia();
		seq.preencher(3);
		int valores[] = seq.getSequencia();
		assertTrue(CORRETO == valores[999]);
	}

	@Test
	public void testeDois() {
		final int CORRETO = 0;
		Sequencia seq = new Sequencia();
		seq.preencher(3);
		int valores[] = seq.getSequencia();
		assertTrue(CORRETO == valores[8]);
	}

	@Test
	public void testeTres() {
		final int CORRETO = 3;
		Sequencia seq = new Sequencia();
		seq.preencher(3);
		int valores[] = seq.getSequencia();		
		assertTrue(CORRETO == valores[595]);
	}

}
