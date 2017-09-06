package TestIniciante;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;

import InicianteSeis.Impares;
import InicianteUm.Soma;

public class TesteExercicio6 {
	
	@Test
	public void testeum () {
		final int CORRETO = 0;
		Impares impar = new Impares ();
		impar.setNum1(12);
		impar.setNum2(12);
		assertTrue(CORRETO == impar.soma());
	}
	@Test
	public void testeDois () {
		final int CORRETO = 13;
		Impares impar = new Impares ();
		impar.setNum1(12);
		impar.setNum2(15);
		assertTrue(CORRETO == impar.soma());
	}
	@Test
	public void testeTres () {
		final int CORRETO = 24;
		Impares impar = new Impares ();
		impar.setNum1(3);
		impar.setNum2(10);
		assertTrue(CORRETO == impar.soma());
	}
}
