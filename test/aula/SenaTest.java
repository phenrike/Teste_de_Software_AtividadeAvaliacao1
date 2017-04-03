package aula;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class SenaTest {

	Sena sena;

	@Test(expected = Exception.class)
	public void a1() throws Exception {
		sena = new Sena(5);
	}

	@Test
	public void a2() throws Exception {
		sena = new Sena(6);
		assertNotNull(sena);
	}

	@Test
	public void a3() throws Exception {
		sena = new Sena(11);
		assertNotNull(sena);
	}

	@Test
	public void a4() throws Exception {
		sena = new Sena(12);
		assertNotNull(sena);
	}

	@Test(expected = Exception.class)
	public void a5() throws Exception {
		sena = new Sena(13);
	}

	@Test
	public void b() throws Exception {
		sena = new Sena(12);
		String[] nros = sena.toString().split(";");
		for (int i = 0; i < nros.length; i++) {
			assertTrue(Integer.parseInt(nros[i]) >= 1 && Integer.parseInt(nros[i]) <= 60);
			// System.out.println(nros[i]);
		}
	}

	@Test
	public void c() throws Exception {
		sena = new Sena(12);
		String[] nros = sena.toString().split(";");
		int numeroAnterior = Integer.parseInt(nros[0]);
		for (int i = 1; i < nros.length; i++) {
			if (Integer.parseInt(nros[i]) < numeroAnterior) {
				fail("A lista não está ordenada.");
			}
		}
	}

	@Test
	public void d() throws Exception {
		sena = new Sena(12);
		String[] nros = sena.toString().split(";");
		System.out.println(Arrays.toString(nros));
		int qtdDeRepeticao = 0;
		
		for (int i = 0; i < nros.length; i++) {
			for (int j = 0; j < nros.length; j++) {
				if (Integer.parseInt(nros[i]) == Integer.parseInt(nros[j])) {
					qtdDeRepeticao += 1;
				}
			}

			if (qtdDeRepeticao > 1) {
				fail("O array possui números repetidos");
			}

			qtdDeRepeticao = 0;
		}
	}

}