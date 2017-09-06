package TestIniciante;

import static org.junit.Assert.*;

import org.junit.Test;

import InicianteDois.Vendedor;

public class TesteExercicio2 {

	@Test
	public void testeUm() {
		final double CORRETO = 184.5;
		Vendedor vendedor = new Vendedor();
		vendedor.setSalarioTotal(500);
		vendedor.setSalarioVendas(1230);
		vendedor.CalcularSalario(vendedor.getSalarioFixo(),
				vendedor.getSalarioVendas());
		assertTrue(CORRETO == vendedor.getSalarioTotal());

	}

	@Test
	public void testeDois() {
		final double CORRETO = 0;
		Vendedor vendedor = new Vendedor();
		vendedor.setSalarioTotal(700);
		vendedor.setSalarioVendas(0.0);
		vendedor.CalcularSalario(vendedor.getSalarioFixo(),
				vendedor.getSalarioVendas());
		assertTrue(CORRETO == vendedor.getSalarioTotal());

	}

	@Test
	public void testeTres() {
		final double CORRETO = 184.575;
		Vendedor vendedor = new Vendedor();
		vendedor.setSalarioTotal(1700);
		vendedor.setSalarioVendas(1230.50);
		vendedor.CalcularSalario(vendedor.getSalarioFixo(),
				vendedor.getSalarioVendas());
		assertTrue(CORRETO == vendedor.getSalarioTotal());

	}

}
