package testeAngajati;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;

import clase.Firma;

import javax.naming.directory.InvalidAttributesException;

import org.junit.Test;




import clase.Angajat;
import clase.AngajatBuilder;
import clase.AngajatInexistentException;
import exceptions.NullAttributeException;

public class TestAngajat {

	@Test
	public void testBool(){
		String nume ="Maria",
				prenume = "Prichici";
		String cnp = "2857332221";
		Date acum = new Date();
		String telefonMobil = null;
		Angajat a = new Angajat(nume, prenume, cnp, acum, telefonMobil),
				b = new Angajat(nume, prenume, cnp, acum, telefonMobil);
		assertTrue(a.equals(b));
		b.setCnp("124123");
		assertFalse(a.equals(b));
		}
	
	@Test
	public void testConstructor(){
		String nume ="Maria",
				prenume = "Prichici";
		String cnp = "2857332221";
		Date acum = new Date();
		String telefonMobil = null;
		Angajat a = new Angajat(nume, prenume, cnp, acum, telefonMobil);
		assertEquals(a.getCnp(), "2857332221");
		assertEquals(a.getNume(), "Maria");
		assertEquals(a.getPrenume(), "Prichici");
		}
	
	@Test
	public void LungimeCnp(){
		String nume ="Maria",
				prenume = "Prichici";
		String cnp = "2857332221";
		Date acum = new Date();
		String telefonMobil = null;
		Angajat a = new Angajat(nume, prenume, cnp, acum, telefonMobil);
		assertFalse(a.CnpValidLungime());
		a.setCnp("1234567891234");
		assertTrue(a.CnpValidLungime());
		}
	@Test
	public void SexCnp(){
		String nume ="Maria",
				prenume = "Prichici";
		String cnp = "0234567891234";
		Date acum = new Date();
		String telefonMobil = null;
		Angajat a = new Angajat(nume, prenume, cnp, acum, telefonMobil);
		assertFalse(a.CnpPrimaLitera());
		a.setCnp("2857332221");
		assertTrue(a.CnpPrimaLitera());
		}
	@Test
	public void TelefonValid(){
		String nume ="Sergiu",
				prenume = "Stefan";
		String cnp = "2857332221";
		String telefonMobil = "0656456565565";	
		Date acum = new Date();
		Angajat a = new Angajat(nume, prenume, cnp, acum, telefonMobil);
		assertFalse(a.Telefonvalids());
		a.setTelefonMobil("0749605208");
		assertTrue(a.Telefonvalids());
		}
	
	@Test
	public void TelefonMobilPrimele(){
		String nume ="Sergiu",
				prenume = "Stefan";
		String cnp = "2857332221";
		String telefonMobil = "0656456565565";	
		Date acum = new Date();
		Angajat a = new Angajat(nume, prenume, cnp, acum, telefonMobil);
		assertFalse(a.TelefonPrimeleCifre());
		a.setTelefonMobil("0749605208");
		assertTrue(a.TelefonPrimeleCifre());
		}
	

	
	@Test
	public void DataAngajare(){
		String nume ="Sergiu",
				prenume = "Stefan";
		String cnp = "2857332221";
		String telefonMobil = "0656456565565";	
		Date acum = new Date(2014,01,01);
		Angajat a = new Angajat(nume, prenume, cnp, acum, telefonMobil);
		//assertTrue(a.DataAngajareValida());
		a.setDataAngajare(new Date(2016, 12,29));;
		assertFalse(a.DataAngajareValida());
		}
	@Test
	public void testEmailValid(){
		Angajat a = new Angajat(null, null, null, null, null);
		try {
			a.setEmail("polivanez@softem.ro");
			assertTrue(true);
		} catch (InvalidAttributesException e) {
			assertTrue(false);
			e.printStackTrace();
		}
	}
	@Test
	public void testEmailGresit(){
		Angajat a = new Angajat(null, null, null, null, null);
		try {
			a.setEmail("polivanez");
			assertTrue(false);
		} catch (InvalidAttributesException e) {
			assertTrue(true);
			e.printStackTrace();
		}
	}
	
	
	@Test
	public void testEliminaAngajatException() throws AngajatInexistentException {
		Angajat a = new Angajat("Popescu", "John", "12515");
		Firma.getInstance().eliminaAngajat(a);
		assertFalse("NU a fost aruncata exceptia", false);
	}
//	@Test
//	public void testAdaugaAngajat() {
//		Angajat b1 = new Angajat("poli", "rege", "1231231");
//		Firma.getInstance().adaugaAngajat(b1);
////		assertEquals(Firma.getInstance().getListaAngajati().size(), 1);
////	}

	
	
	
}
