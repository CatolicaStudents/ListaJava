package TestIniciante;

import static org.junit.Assert.*;

import org.junit.Test;

import InicianteTres.Circulo;


public class TesteExercicio3 {

	@Test
	public void testUm() {
		Circulo oi = new Circulo();
		oi.setRaio(2);
		assertTrue(Math.PI*Math.pow(2,2) == oi.calculaArea());
	}
	@Test
	public void testDois() {
		Circulo oi = new Circulo();
		oi.setRaio(100.64);
		assertTrue(Math.PI*Math.pow(100.64,2) == oi.calculaArea());
	}
	@Test
	public void testTres() {
		Circulo oi = new Circulo();
		oi.setRaio(150);
		assertTrue(Math.PI*Math.pow(150,2) == oi.calculaArea());
	}

}
