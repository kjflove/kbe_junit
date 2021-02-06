package de.htw_berlin.kbe_junit.SchnittstellenTest.impl;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import de.htw_berlin.kbe_junit.karten.export.KartenInterface;
import de.htw_berlin.kbe_junit.spieler.export.Spieler;
import de.htw_berlin.kbe_junit.spieler.export.SpielerInterface;
import de.htw_berlin.kbe_junit.spieler.impl.SpielerService;

public class SpielerServiceTest {
	private static SpielerInterface spielerservice;


	@BeforeClass
	public static void initialisieren(){
		spielerservice=new SpielerService();
	
	}
	

	@Test
	public void spielerEreugenTest() {
		String name1="Tom";
		String name2="Marvin";
		ArrayList<Spieler> list=spielerservice.PlayerErzeugen(2);
		list.get(0).setName(name1);
		list.get(1).setName(name2);
		assertTrue(list.get(0).getName().equals(name1) && list.get(1).getName().equals(name2));
	}
	
	@Test
	public void spielerKartenAnzeigenTest() {
		String name1="Tom";
		String name2="Marvin";
		ArrayList<Spieler> list=spielerservice.PlayerErzeugen(2);
		list.get(0).setName(name1);
		list.get(1).setName(name2);	
		assertTrue(spielerservice.spielerKartenAnzeigen(list, 0).equals(""));
	}
	
}
