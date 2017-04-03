package aula;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

public class CadastroTest {

	Cadastro cadastro;

	@Test
	public void a1() throws IOException {
		cadastro = new Cadastro("teste.txt");
		assertNotNull(cadastro);
	}

	@Test(expected = NullPointerException.class)
	public void a2() throws IOException {
		cadastro = new Cadastro(null);
		assertNotNull(cadastro);
	}

	@Test(expected = IOException.class)
	public void a3() throws IOException {
		cadastro = new Cadastro("");
		assertNotNull(cadastro);
	}

	@Test
	public void b1() throws IOException {
		cadastro = new Cadastro("testB.txt");
		assertTrue(cadastro.insert(1, "De volta para o futuro I"));
	}
	
	@Test
	public void b2() throws IOException {
		cadastro = new Cadastro("testB.txt");
		assertFalse(cadastro.insert(0, "Missão impossível I"));
	}
	
	@Test
	public void b3() throws IOException {
		cadastro = new Cadastro("testB.txt");
		assertFalse(cadastro.insert(2, null));
	}
	
	@Test
	public void b() throws IOException {
		cadastro = new Cadastro("testB.txt");
		assertFalse(cadastro.insert(3, ""));
	}
}
