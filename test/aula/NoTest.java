package aula;

import static org.junit.Assert.*;

import org.junit.Test;

public class NoTest {
	
	No no;

	@Test
	public void testConstrutor() {
		no = new No(1);
		assertNotNull(no);
	}
	
	@Test
	public void testValor() {
		no = new No(1);
		assertSame(1, no.valor);
	}
	
	@Test
	public void testAnterior() {
		no = new No(0);
		No noAnt = new No(10);
		no.anterior = noAnt;
		assertSame(10, no.anterior.valor);
	}
	
	@Test
	public void testProximo() {
		no = new No(0);
		No noProx = new No(20);
		no.proximo = noProx;
		assertSame(20, no.proximo.valor);
	}
	
	
}
