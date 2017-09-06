package TestIniciante;

import static org.junit.Assert.*;

import org.junit.Test;

import InicianteCinco.Sequencia;
import InicianteTres.Circulo;


public class TesteExercicio5 {

	@Test
	public void testUm() {
		final int CORRETO = 3;
		Sequencia test = new Sequencia();
		test.preencher(3);
	
		assertTrue(CORRETO ==	test.getSequencia()[1]);
		
	}
	@Test
	public void testDois() {
		final int CORRETO = 2997;
		Sequencia test = new Sequencia();
		test.preencher(3);
	
		assertTrue(CORRETO ==	test.getSequencia()[999]);
		
	}
	@Test
	public void testTres() {
		final int CORRETO = 9;
		Sequencia test = new Sequencia();
		test.preencher(3);
	
		assertTrue(CORRETO ==	test.getSequencia()[3]);
		
	}	

}
