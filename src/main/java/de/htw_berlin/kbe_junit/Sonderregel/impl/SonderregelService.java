package de.htw_berlin.kbe_junit.Sonderregel.impl;

import java.util.ArrayList;
import java.util.Iterator;

import javax.persistence.PersistenceException;

import org.springframework.stereotype.Component;

import de.htw_berlin.kbe_junit.Exception.impl.DaoException;
import de.htw_berlin.kbe_junit.Exception.impl.IndexException;
import de.htw_berlin.kbe_junit.MauFeld.export.MauFeld;
import de.htw_berlin.kbe_junit.Sonderregel.export.SonderregelnInterface;
import de.htw_berlin.kbe_junit.karten.export.Karten;
import de.htw_berlin.kbe_junit.karten.export.Werte;
import de.htw_berlin.kbe_junit.spieler.export.Spieler;

@Component
public class SonderregelService implements SonderregelnInterface {

	public void richtungswechsel(MauFeld mf, ArrayList<Spieler> spielerlist) {
		// TODO Auto-generated method stub

		if (mf.richtung) {
			naechsteSpieler(mf, spielerlist);
		} else {
			vorigeSpieler(mf, spielerlist);
		}
	}

	public int naechsteSpieler(MauFeld mf, ArrayList<Spieler> spielerlist) {
		// TODO Auto-generated method stub
		mf.spielerDranIndex = mf.spielerDranIndex + 1;
		if (mf.spielerDranIndex >= spielerlist.size())
			mf.spielerDranIndex = 0;
		return mf.spielerDranIndex;
	}

	public int vorigeSpieler(MauFeld mf, ArrayList<Spieler> spielerlist) {
		// TODO Auto-generated method stub
		if (mf.spielerDranIndex > 0)
			mf.spielerDranIndex = mf.spielerDranIndex - 1;
		else if (mf.spielerDranIndex == 0)
			mf.spielerDranIndex = spielerlist.size() - 1;
		return mf.spielerDranIndex;
	}

	public Karten kartenZiehen(Spieler spieler, ArrayList<Karten> kartenStapel) {
		spieler.getCurrentkart().add(kartenStapel.get(0));
		return kartenStapel.remove(0);
	}

	public String kartenlegen(MauFeld mf, ArrayList<Spieler> spielerlist, ArrayList<Karten> kartenStapel,
			int karteindex) {
		String mmsg = "";
		// TODO Auto-generated method stub
		Spieler PlayerDran = spielerlist.get(mf.getSpielerDranIndex());

		mf.setKonnteLegen(false);
		try {
			Karten karte = PlayerDran.getCurrentkart().get(karteindex);
			if (karte.getFigur().equals(mf.getLiegendeKarte().getFigur())
					|| karte.getWerte().equals(mf.getLiegendeKarte().getWerte())) {
				mf.setLiegendeKarte(karte);
				kartenStapel.add(karte);
				PlayerDran.getCurrentkart().remove(karte);
				mmsg = mmsg + ("Spieler " + PlayerDran.name + " legt " + karte.getFigur() + "," + karte.getWerte()
						+ " und hat jetzt noch " + PlayerDran.currentkart.size() + " Karten \n");

				mf.setKonnteLegen(true);
				mf.setTest(mf.isKonnteLegen());

			}
		} catch (IndexOutOfBoundsException ex) {
			throw new IndexException(ex.getMessage());

		}

		return mmsg;
	}

	public String autokartenlegen(MauFeld mf, ArrayList<Spieler> spielerlist, ArrayList<Karten> kartenStapel) {
		String mmsg = "";
		// TODO Auto-generated method stub
		Spieler PlayerDran = spielerlist.get(mf.getSpielerDranIndex());
		Iterator<Karten> iterator = PlayerDran.currentkart.iterator();
		mf.setKonnteLegen(false);
		while (iterator.hasNext()) {
			Karten karte = iterator.next();
			if (karte.getFigur().equals(mf.getLiegendeKarte().getFigur())
					|| karte.getWerte().equals(mf.getLiegendeKarte().getWerte())) {
				mf.setLiegendeKarte(karte);
				kartenStapel.add(karte);
				PlayerDran.getCurrentkart().remove(karte);
				mmsg = mmsg + ("Spieler " + PlayerDran.name + " legt " + karte.getFigur() + "," + karte.getWerte()
						+ " und hat jetzt noch " + PlayerDran.currentkart.size() + " Karten \n");

				mf.setKonnteLegen(true);
				mf.setTest(mf.isKonnteLegen());
				break;
			}
		}
		return mmsg;
	}

	public String konntelegen(MauFeld mf, ArrayList<Spieler> spielerlist, ArrayList<Karten> kartenStapel) {
		// TODO Auto-generated method stub
		String mmsg = "";
		Spieler PlayerDran = spielerlist.get(mf.getSpielerDranIndex());
		if (mf.isKonnteLegen()) {
			if (mf.getLiegendeKarte().getWerte().equals(Werte.ASS)) {
				naechsteSpieler(mf, spielerlist);
				mmsg = mmsg + (" naechste Spieler wird übersprungen. \n");

			} else if (mf.getLiegendeKarte().getWerte().equals(Werte.Dame)) {
				if (mf.richtung)
					mf.richtung = false;
				else
					mf.richtung = true;
				mmsg = mmsg + (" Spielrichtung wird gewechselt. \n");
			}
		} else {
			mf.setTest(mf.isKonnteLegen());
			kartenZiehen(PlayerDran, kartenStapel);
			// System.out.println("Spieler " + PlayerDran.name + " konnte nicht legen und
			// bekommt eine Karte.");
			mmsg = mmsg + ("Spieler " + PlayerDran.name + " konnte nicht legen und bekommt eine Karte. \n");
		}
		return mmsg;
	}

	public String zweikartenerhalten(MauFeld mf, ArrayList<Spieler> spielerlist, ArrayList<Karten> kartenStapel) {
		String mmsg = "";
		// TODO Auto-generated method stub
		Spieler PlayerDran = spielerlist.get(mf.getSpielerDranIndex());
		if (mf.getLiegendeKarte().getWerte().equals(Werte.seven)) {
			// System.out.println("Spieler " + PlayerDran.name + " bekommt zwei Karten");
			kartenZiehen(PlayerDran, kartenStapel);
			kartenZiehen(PlayerDran, kartenStapel);
			mmsg = mmsg + ("Spieler " + PlayerDran.name + " bekommt zwei Karten \n");
		}
		return mmsg;
	}

	public String hatgewonnen(MauFeld mf, ArrayList<Spieler> spielerlist) {
		// TODO Auto-generated method stub
		String mmsg = "";
		Spieler PlayerDran = spielerlist.get(mf.getSpielerDranIndex());
		if (PlayerDran.getCurrentkart().size() == 0) {
			// System.out.println("Spieler " + PlayerDran.name + " hat gewonnen!");
			mf.spielEntschieden = true;
			mmsg = mmsg + ("Spieler " + PlayerDran.name + " hat gewonnen! \n");

		}
		return mmsg;
	}

}
