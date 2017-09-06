package TestIniciante;

import static org.junit.Assert.*;

import org.junit.Test;

import InicianteUm.Soma;

public class TesteExercicio1 {
	
	@Test
	public void testeum () {
		final int CORRETO = 19;
		Soma test = new Soma();
		test.soma(9,10);
		assertTrue(CORRETO == test.getResultado());
		
	}	
	@Test
	public void testedois () {
		final int CORRETO = -6;
		Soma test = new Soma ();
		test.soma(-10, 4);
	}
	@Test
	public void testetres () {
		final int CORRETO = 19;
		Soma test = new Soma ();
		test.soma(15, -7);
	}
}
