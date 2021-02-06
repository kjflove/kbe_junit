package de.htw_berlin.kbe_junit.MauFeld.impl;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import de.htw_berlin.kbe_junit.MauFeld.export.MauFeld;
import de.htw_berlin.kbe_junit.MauFeld.export.MaumauInterface;
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

@Component
public class MauService implements MaumauInterface {
	@Autowired
	private KartenInterface kartenservice;
	@Autowired
	private SpielerInterface spielerservice;
	@Autowired
	private SonderregelnInterface sondernservice;

	public MauService(KartenInterface kartenservice, SpielerInterface spielerservice,
			SonderregelnInterface sondernservice) {
		super();
		this.kartenservice = kartenservice;
		this.spielerservice = spielerservice;
		this.sondernservice = sondernservice;

	}

	public void kartenVerteilen(ArrayList<Karten> kartenStapel, ArrayList<Spieler> spielerlist) {
		// TODO Auto-generated method stub
		Iterator<Spieler> iterator = spielerlist.iterator();
		while (iterator.hasNext()) {
			Spieler spieler = iterator.next();
			spieler.currentkart = new ArrayList<Karten>();
		}

		int jederPlayerHat = 0;
		while (jederPlayerHat < 5) {
			iterator = spielerlist.iterator();
			while (iterator.hasNext()) {
				Spieler Spieler = iterator.next();
				Spieler.getCurrentkart().add(kartenStapel.get(0));
				kartenStapel.remove(0);
			}
			jederPlayerHat++;
		}

	}

	public Karten obersteKarteZiehen(MauFeld mf, ArrayList<Karten> kartenStapel) {
		// TODO Auto-generated method stub
		mf.setLiegendeKarte(kartenStapel.get(0));
		return kartenStapel.remove(0);

	}

	public void spielstarten(MauFeld mf, int zahl, Figur[] figur, Werte[] werte) {

		ArrayList<Spieler> spielerlist = spielerservice.PlayerErzeugen(zahl);
		ArrayList<Karten> kartenStapel = kartenservice.KartenPileErzeugen(figur, werte);
		kartenVerteilen(kartenStapel, spielerlist);
		obersteKarteZiehen(mf, kartenStapel);
		System.out.println("Es liegt " + mf.getLiegendeKarte());

		while (!mf.spielEntschieden) {
			sondernservice.richtungswechsel(mf, spielerlist);
			System.out.print(sondernservice.zweikartenerhalten(mf, spielerlist, kartenStapel));
			System.out.print(sondernservice.hatgewonnen(mf, spielerlist));
			System.out.print(sondernservice.autokartenlegen(mf, spielerlist, kartenStapel));
			System.out.print(sondernservice.konntelegen(mf, spielerlist, kartenStapel));
		}
	}

}
