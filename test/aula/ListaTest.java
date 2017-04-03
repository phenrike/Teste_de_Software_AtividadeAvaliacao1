package aula;

import static org.junit.Assert.*;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.Test;

public class ListaTest {

	Lista lista;
	No no;

	@Test
	public void testAdd() {
		try {

			lista = new Lista();

			lista.add(2);
			lista.add(3);
			lista.add(0);
			lista.add(1);

			Method getMostLeft = Lista.class.getDeclaredMethod("getMostLeft");
			getMostLeft.setAccessible(true);
			no = (No) getMostLeft.invoke(lista);
			assertEquals(0, no.valor);

		} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException
				| InvocationTargetException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testOrdemCrescente() {
		try {

			lista = new Lista();

			lista.add(2);
			lista.add(3);
			lista.add(0);
			lista.add(1);

			Method getMostLeft = Lista.class.getDeclaredMethod("getMostLeft");
			getMostLeft.setAccessible(true);
			no = (No) getMostLeft.invoke(lista);
			assertTrue(no.valor == 0 && no.proximo.valor == 1);

		} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException
				| InvocationTargetException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testOrdemDecrescente() {
		try {

			lista = new Lista();

			lista.add(20);
			lista.add(30);
			lista.add(0);
			lista.add(10);

			Method getMostRight = Lista.class.getDeclaredMethod("getMostRight");
			getMostRight.setAccessible(true);
			no = (No) getMostRight.invoke(lista);
			assertTrue(no.valor == 30 && no.anterior.valor == 20);

		} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException
				| InvocationTargetException e) {
			e.printStackTrace();
		}
	}
}