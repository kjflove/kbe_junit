package de.htw_berlin.kbe_junit.SchnittstellenTest.impl;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

import de.htw_berlin.kbe_junit.MauFeld.export.MauFeld;
import de.htw_berlin.kbe_junit.MauFeld.impl.MauService;
import de.htw_berlin.kbe_junit.Sonderregel.export.SonderregelnInterface;
import de.htw_berlin.kbe_junit.Sonderregel.impl.SonderregelService;
import de.htw_berlin.kbe_junit.karten.export.Figur;
import de.htw_berlin.kbe_junit.karten.export.Karten;
import de.htw_berlin.kbe_junit.karten.export.KartenInterface;
import de.htw_berlin.kbe_junit.karten.export.Werte;
import de.htw_berlin.kbe_junit.karten.impl.KartenService;
import de.htw_berlin.kbe_junit.spieler.export.Spieler;
import de.htw_berlin.kbe_junit.spieler.export.SpielerInterface;
import de.htw_berlin.kbe_junit.spieler.impl.SpielerService;

public class SonderregelServiceTest {
	
	private static SonderregelnInterface sondernservice;
	@Mock
	private static SpielerInterface spielerservice;
	@Mock
	private static KartenInterface kartenservice;
	
	private static Werte[] werte ;
	private static Figur[] figure ;
	private static ArrayList<Spieler> spielerlist ;

 
	// @Before, @After, @BeforeClass, @AfterClass
	@BeforeClass
	public static void initialize() {
		spielerservice = Mockito.mock(SpielerInterface.class);
		kartenservice = Mockito.mock(KartenInterface.class);
		sondernservice=new SonderregelService ();
		new MauService(kartenservice, spielerservice, sondernservice);

		ArrayList<Spieler> sl = new ArrayList<Spieler>();
        sl.add(new Spieler("Tom"));
        sl.add(new Spieler("Marvin"));
        Mockito.when(spielerservice.PlayerErzeugen(2)).thenReturn(  sl );
         spielerlist = new ArrayList<Spieler>();
        spielerlist= spielerservice.PlayerErzeugen(2);

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
	public void naechsteSpielerTest() {
		MauFeld mf=new MauFeld(0);
		int index=sondernservice.naechsteSpieler(mf, spielerlist);
		assertTrue(index==1);	
	}
	
	@Test
	public void vorigeSpielerTest() {
		MauFeld mf=new MauFeld(1);
		int index=sondernservice.vorigeSpieler(mf, spielerlist);
		assertTrue(index==0);	
	}
	
	@Test
	public void kartenZiehenTest() {		
		ArrayList<Karten> kartenStapel = new ArrayList<Karten>();
	    ArrayList<Karten> Karte = new ArrayList<Karten>();

		Karte.add(new Karten(figure[0],werte[0]));
		Karte.add(new Karten(figure[0],werte[0]));
		Karte.add(new Karten(figure[0],werte[0]));
		Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));
	    Mockito.when(kartenservice.KartenPileErzeugen(figure, werte)).thenReturn( Karte );
	    kartenStapel =kartenservice.KartenPileErzeugen(figure, werte);
		sondernservice.kartenZiehen(spielerlist.get(0),kartenStapel);
		sondernservice.kartenZiehen(spielerlist.get(1),kartenStapel);
		assertTrue(kartenStapel.size()!=31);
		
		assertTrue(spielerlist.get(1).getCurrentkart().size()==1);
       	
	}
	
	@Test
	public void hatgewonnenTest() {

		MauFeld mf=new MauFeld(0);
		String msg=sondernservice.hatgewonnen(mf, spielerlist);
		assertTrue(msg=="");	
	}
	
	
	@Test
	public void zweikartenerhaltenTest() {
		MauFeld mf=new MauFeld(0);	
		ArrayList<Karten> kartenStapel = new ArrayList<Karten>();
	    ArrayList<Karten> Karte = new ArrayList<Karten>();

		Karte.add(new Karten(figure[0],werte[0]));
		Karte.add(new Karten(figure[0],werte[0]));
		Karte.add(new Karten(figure[0],werte[0]));
		Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));
	    Mockito.when(kartenservice.KartenPileErzeugen(figure, werte)).thenReturn( Karte );
	    kartenStapel =kartenservice.KartenPileErzeugen(figure, werte);
		mf.setLiegendeKarte(kartenStapel.get(0));
		String msg=sondernservice.zweikartenerhalten(mf, spielerlist, kartenStapel);
		assertTrue(msg=="");
		
	}

	
	@Test
	public void autokartenLegenTest() {
		MauFeld mf=new MauFeld(0);	
		ArrayList<Karten> kartenStapel = new ArrayList<Karten>();
	    ArrayList<Karten> Karte = new ArrayList<Karten>();

		Karte.add(new Karten(figure[0],werte[0]));
		Karte.add(new Karten(figure[0],werte[0]));
		Karte.add(new Karten(figure[0],werte[0]));
		Karte.add(new Karten(figure[0],werte[0]));
		Karte.add(new Karten(figure[0],werte[0]));
		Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));
	    Mockito.when(kartenservice.KartenPileErzeugen(figure, werte)).thenReturn( Karte );
	    kartenStapel =kartenservice.KartenPileErzeugen(figure, werte);
		mf.setLiegendeKarte(kartenStapel.get(0));
		spielerlist.get(0).getCurrentkart().add(kartenStapel.remove(0));
		spielerlist.get(0).getCurrentkart().add(kartenStapel.remove(0));
		String msg=sondernservice.autokartenlegen(mf, spielerlist, kartenStapel);
		assertTrue(msg!="");
		
	}
	
	@Test
	public void kartenLegenTest() {
		MauFeld mf=new MauFeld(0);	
		ArrayList<Karten> kartenStapel = new ArrayList<Karten>();
	    ArrayList<Karten> Karte = new ArrayList<Karten>();

		Karte.add(new Karten(figure[0],werte[0]));
		Karte.add(new Karten(figure[0],werte[0]));
		Karte.add(new Karten(figure[0],werte[0]));
		Karte.add(new Karten(figure[0],werte[0]));
		Karte.add(new Karten(figure[0],werte[0]));
		Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));
	    Mockito.when(kartenservice.KartenPileErzeugen(figure, werte)).thenReturn( Karte );
	    kartenStapel =kartenservice.KartenPileErzeugen(figure, werte);
		mf.setLiegendeKarte(kartenStapel.get(0));
		spielerlist.get(0).getCurrentkart().add(kartenStapel.remove(0));
		spielerlist.get(0).getCurrentkart().add(kartenStapel.remove(0));
		String msg=sondernservice.kartenlegen(mf, spielerlist, kartenStapel,0);
		assertTrue(msg!="");
		
	}
	
	
	@Test
	public void konntelegenTest() {
		MauFeld mf=new MauFeld(0);	
		ArrayList<Karten> kartenStapel = new ArrayList<Karten>();
	    ArrayList<Karten> Karte = new ArrayList<Karten>();

		Karte.add(new Karten(figure[0],werte[0]));
		Karte.add(new Karten(figure[0],werte[0]));
		Karte.add(new Karten(figure[0],werte[0]));
		Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));Karte.add(new Karten(figure[0],werte[0]));
	    Mockito.when(kartenservice.KartenPileErzeugen(figure, werte)).thenReturn( Karte );
	    kartenStapel =kartenservice.KartenPileErzeugen(figure, werte);
		mf.setLiegendeKarte(kartenStapel.get(0));
		spielerlist.get(0).getCurrentkart().add(kartenStapel.remove(0));
		spielerlist.get(0).getCurrentkart().add(kartenStapel.remove(0));
		String msg=sondernservice.konntelegen(mf, spielerlist, kartenStapel);
		assertTrue(msg!="");
		
	
		
	}
	

}
