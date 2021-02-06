package de.htw_berlin.kbe_junit.SchnittstellenTest.impl;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.BeforeClass;
import org.junit.Test;

import de.htw_berlin.kbe_junit.karten.export.Figur;
import de.htw_berlin.kbe_junit.karten.export.Karten;
import de.htw_berlin.kbe_junit.karten.export.KartenInterface;
import de.htw_berlin.kbe_junit.karten.export.Werte;
import de.htw_berlin.kbe_junit.karten.impl.KartenService;

public class KartenServiceTest {
	private static KartenInterface kartenservice;
	private static Werte[] werte ;
	private static Figur[] figure ;

	@BeforeClass
	public static void initialisieren(){
		
		
		kartenservice=new KartenService ();
		werte = new Werte[8];
		figure = new Figur[4];
		werte[0] = Werte.ASS;
		werte[1] = Werte.Koenig;
		werte[2] = Werte.Dame;
		werte[3] = Werte.Bube;
		werte[4] = Werte.teen;
		werte[5] = Werte.nine;
		werte[6] = Werte.eight;
		werte[7] = Werte.seven;
		figure[0] = Figur.Kreuz;
		figure[1] = Figur.Pik;
		figure[2] = Figur.Herz;
		figure[3] = Figur.Karo;
		
	}

	@Test
	public void kartenPileErzeugenTest() {
		ArrayList<Karten> list=kartenservice.KartenPileErzeugen(figure, werte);
		assertTrue(list.size()==32);
		assertTrue(!list.get(0).getFigur().equals(null) && !list.get(0).getWerte().equals(null) );
		assertTrue(!list.get(31).getFigur().equals(null) && !list.get(0).getWerte().equals(null) );
	}

}
