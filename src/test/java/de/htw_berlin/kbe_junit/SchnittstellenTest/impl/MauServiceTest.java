package de.htw_berlin.kbe_junit.SchnittstellenTest.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import de.htw_berlin.kbe_junit.MauFeld.export.MauFeld;
import de.htw_berlin.kbe_junit.MauFeld.export.MaumauInterface;
import de.htw_berlin.kbe_junit.MauFeld.impl.MauService;
import de.htw_berlin.kbe_junit.Sonderregel.export.SonderregelnInterface;
import de.htw_berlin.kbe_junit.karten.export.Figur;
import de.htw_berlin.kbe_junit.karten.export.Karten;
import de.htw_berlin.kbe_junit.karten.export.KartenInterface;
import de.htw_berlin.kbe_junit.karten.export.Werte;
import de.htw_berlin.kbe_junit.spieler.export.Spieler;
import de.htw_berlin.kbe_junit.spieler.export.SpielerInterface;
@RunWith(MockitoJUnitRunner.class)
public class MauServiceTest {
	private static MaumauInterface mauservice;
	private  static MauFeld mf;
	private static Werte[] werte ;
	private static Figur[] figure ;
	private static ArrayList<Spieler> spielerlist ;
	@Mock
	private static SpielerInterface spielerservice;
	@Mock
	private static KartenInterface kartenservice;
	@Mock
	 private static SonderregelnInterface sondernservice;


	@BeforeClass
	public static void setUpBeforeClass()  {
		
		spielerservice = Mockito.mock(SpielerInterface.class);
		kartenservice = Mockito.mock(KartenInterface.class);
		SonderregelnInterface sondernservice = Mockito.mock(SonderregelnInterface.class);

		mauservice = new MauService(kartenservice, spielerservice, sondernservice );
		
		  ArrayList<Spieler> sl = new ArrayList<Spieler>();
	        sl.add(new Spieler("Tom"));
	        sl.add(new Spieler("Marvin"));
	        Mockito.when(spielerservice.PlayerErzeugen(2)).thenReturn(  sl );
	         spielerlist = new ArrayList<Spieler>();
	        spielerlist= spielerservice.PlayerErzeugen(2);
		 mf=new MauFeld(0);

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
	public void obersteKarteZiehenTest() {
		// Arrange
	ArrayList<Karten> kartenStapel = new ArrayList<Karten>();
    ArrayList<Karten> Karte = new ArrayList<Karten>();

	Karte.add(new Karten(figure[0],werte[0]));
	Karte.add(new Karten(figure[0],werte[0]));
	Karte.add(new Karten(figure[0],werte[0]));
	Karte.add(new Karten(figure[0],werte[0]));
    Mockito.when(kartenservice.KartenPileErzeugen(figure, werte)).thenReturn( Karte );
    kartenStapel =kartenservice.KartenPileErzeugen(figure, werte);

	
	MauFeld mf=new MauFeld(0);
	
	mauservice.obersteKarteZiehen(mf, kartenStapel);
	assertTrue(mf.getLiegendeKarte().getFigur()!=null && mf.getLiegendeKarte().getWerte()!=null);
		
	}


	
	@Test
	public void kartenVerteilenTest() {
		ArrayList<Karten> kartenStapel = new ArrayList<Karten>();
	    ArrayList<Karten> Karte = new ArrayList<Karten>();

		Karte.add(new Karten(figure[0],werte[0]));
		Karte.add(new Karten(figure[0],werte[0]));
		Karte.add(new Karten(figure[0],werte[0]));
		Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));
	    Mockito.when(kartenservice.KartenPileErzeugen(figure, werte)).thenReturn( Karte );
	    kartenStapel =kartenservice.KartenPileErzeugen(figure, werte);
	    System.out.println(  kartenStapel.get(2).getFigur());

	   
        System.out.println( spielerlist.get(1).getName());

		mauservice.kartenVerteilen(kartenStapel, spielerlist);
		assertEquals(spielerlist.get(0).getCurrentkart().size(),5);
		assertEquals(spielerlist.get(1).getCurrentkart().size(),5);
		
	}
	
	@Test
	public void spielstartenTest() {
	
		assertTrue(!mf.isSpielEntschieden());
		
	}

}
