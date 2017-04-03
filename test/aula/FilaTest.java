package aula;

import static org.junit.Assert.*;

import org.junit.Test;

public class FilaTest {
	
	Fila fila;

	@Test
	public void testb() throws Exception{
		fila = new Fila();
		fila.add("Ana");
		assertEquals("Ana", fila.getFinal());
	}
	
	@Test(expected = NullPointerException.class)
	public void testc() throws Exception{
		fila = new Fila();
		fila.add("Ana");
		fila.remover();
		assertNull(fila.getFinal());
	}
	
	@Test
	public void testd() throws Exception{
		fila = new Fila();
		fila.add("Ana");
		assertEquals("Ana", fila.getFinal());
	}	
}
