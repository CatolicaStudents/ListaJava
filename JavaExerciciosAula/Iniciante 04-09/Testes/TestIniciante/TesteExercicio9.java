package TestIniciante;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;

import InicianteNove.Nota;
import InicianteSeis.Impares;
import InicianteSete.Sequencia;
import InicianteUm.Soma;

public class TesteExercicio9 {

	@Test
	public void testeum() {
		int valorSaque;
		valorSaque = 576;
		Nota notas = new Nota();
		notas.exibeQtdNotas(valorSaque);
		assertTrue(5 == notas.getNota100());
		assertTrue(0 == notas.getNota10());
		assertTrue(1 == notas.getNota1());
	}

	@Test
	public void testeDois() {
		int valorSaque;
		valorSaque = 11257;
		Nota notas = new Nota();
		notas.exibeQtdNotas(valorSaque);
		assertTrue(112 == notas.getNota100());
		assertTrue(0 == notas.getNota10());
		assertTrue(0 == notas.getNota1());
	}

	@Test
	public void testeTres() {
		int valorSaque;
		valorSaque = 503;
		Nota notas = new Nota();
		notas.exibeQtdNotas(valorSaque);
		assertTrue(5 == notas.getNota100());
		assertTrue(0 == notas.getNota50());
		assertTrue(1 == notas.getNota2());
	}

}
