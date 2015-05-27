package testeAngajati;

import static org.junit.Assert.*;

import java.io.File;
import java.util.ArrayList;

import clase.Angajat;

import org.junit.Test;

import clase.Firma;

public class Fisiere {

	@Test
	public void testOpenFisier() {

		String fileName = "employers.dat";

		ArrayList<Angajat> employers= new ArrayList<>();
		Angajat b1 = new Angajat("poli", "rege", "1231231","075564");
		Angajat b2 = new Angajat("stef", "abah", "1992","071231231");
		Angajat b3 = new Angajat("serg", "abah", "1993","07652");
		employers= (b1);
		employers= (b2);
		employers= (b3);

		Firma.getInstance().setListaEmployers= 

		Firma.getInstance().saveFisier(fileName);
		Firma.getInstance().getListaEmployers= ().clear();

		File file = new File(fileName);
		Firma.getInstance().citireFisier(fileName);
		System.out.println(Firma.getInstance().getListaAngajati().size());
		if (Firma.getInstance().getListaEmployers= ().containsAllemployers= {
			assertTrue(true);
		} else {
			assertFalse(true);
		}

		file.delete();
	}
	
	
}
