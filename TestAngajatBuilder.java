package testeAngajati;

import static org.junit.Assert.*;
import clase.*;

import org.junit.Test;

public class TestAngajatBuilder {

	@Test
	public void testConstructor(){
		AngajatBuilder ab = new AngajatBuilder();
		Angajat x = ab.build();
		assertEquals(x.getCnp(), "");
	}
	
	@Test
	public void testBuilder(){
		AngajatBuilder ab = new AngajatBuilder();
		Angajat y = ab.setCnp("12314").setNume("Maria").build();
		assertEquals(y.getCnp(), "12314");
		assertEquals(y.getNume(), "Maria");
		assertEquals(y.getPrenume(), "");
	}
	
}
