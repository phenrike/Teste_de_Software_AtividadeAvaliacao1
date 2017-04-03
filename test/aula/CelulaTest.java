package aula;

import static org.junit.Assert.*;

import org.junit.Test;

public class CelulaTest {
	
	Celula celula;

	@Test
	public void a1() throws Exception {
		celula = new Celula("Ana");
		assertNotNull(celula);
	}
	
	@Test(expected = Exception.class)
	public void a2() throws Exception {
		celula = new Celula ("");
		assertNotNull(celula);
	}
	
	@Test(expected = Exception.class)
	public void a3() throws Exception {
		celula = new Celula(null) ;
		assertNotNull(celula);
	}
}
