package uriIniciante1037;

import static org.junit.Assert.*;

import org.junit.Test;

public class Iniciante1037IntervalosTest {

	@Test
	public void testQuartil3() {
		Iniciante1037Intervalos intervalos = new Iniciante1037Intervalos();
		String resultado = intervalos.intervaloV2(60);
		assertTrue( resultado.equals(Iniciante1037Intervalos.Q3));
	}
	
	@Test
	public void testQuartil2() {
		Iniciante1037Intervalos intervalos = new Iniciante1037Intervalos();
		String resultado = intervalos.intervaloV2(40);
		assertTrue( resultado.equals(Iniciante1037Intervalos.Q2));
	}
	
	
	@Test
	public void testQuartil1() {
		Iniciante1037Intervalos intervalos = new Iniciante1037Intervalos();
		String resultado = intervalos.intervaloV2(20);
		assertTrue( resultado.equals(Iniciante1037Intervalos.Q1));
	}
	
	@Test
	public void testQuartil3a() {
		Iniciante1037Intervalos intervalos = new Iniciante1037Intervalos();
		String resultado = intervalos.intervalo100(60);
		assertTrue( resultado.equals(Iniciante1037Intervalos.Q3));
	}
	
	@Test
	public void testQuartil2a() {
		Iniciante1037Intervalos intervalos = new Iniciante1037Intervalos();
		String resultado = intervalos.intervalo100(40);
		assertTrue( resultado.equals(Iniciante1037Intervalos.Q2));
	}
	
	
	@Test
	public void testQuartil1a() {
		Iniciante1037Intervalos intervalos = new Iniciante1037Intervalos();
		String resultado = intervalos.intervalo100(20);
		assertTrue( resultado.equals(Iniciante1037Intervalos.Q1));
	}


}
