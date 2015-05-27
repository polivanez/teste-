package testeAngajati;

import static org.junit.Assert.*;
import clase.MainFrame;

import org.junit.Test;

import clase.Firma;

public class Singleton {

	

	@Test
	public void testSingletonNotnull() {
		Firma inter1 = Firma.getInstance();
		assertNotNull(inter1);
	}
	
	@Test
	public void test() {
		//fail("Not yet implemented");
	}
	@Test
	public void testMainFrameSingletonNotNull() {
		Main m1 = Main.getInstance();
		assertNotNull(m1);
	}

	@Test
	public void Singleton() {
		Firma inter1= Firma.getInstance();
		assertSame(Firma.getInstance(), inter1);
	}
	
	@Test
	public void testMainSingleton() {
		Main m1 = Main.getInstance();
		Main m2 = Main.getInstance();
		assertSame(m1, m2);
	}

}
