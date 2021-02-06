package de.htw_berlin.kbe_junit.VirtuellerSpieler.impl;

import java.util.ArrayList;
import java.util.Iterator;

import org.springframework.stereotype.Component;

import de.htw_berlin.kbe_junit.MauFeld.export.MauFeld;
import de.htw_berlin.kbe_junit.VirtuellerSpieler.export.VirtuellerSpieler;
import de.htw_berlin.kbe_junit.VirtuellerSpieler.export.VirtuellerSpielerInterface;
import de.htw_berlin.kbe_junit.karten.export.Karten;
import de.htw_berlin.kbe_junit.spieler.export.Spieler;

@Component
public class VirtuellerSpielerService implements VirtuellerSpielerInterface {

	public String autokartenlegen(MauFeld mf, VirtuellerSpieler computer, ArrayList<Karten> kartenStapel) {
		// TODO Auto-generated method stub
		String mmsg = "";
		// TODO Auto-generated method stub
		Spieler PlayerDran = computer;
		Iterator<Karten> iterator = PlayerDran.currentkart.iterator();
		mf.setKonnteLegen(false);
		while (iterator.hasNext()) {
			Karten karte = iterator.next();
			if (karte.getFigur().equals(mf.getLiegendeKarte().getFigur())
					|| karte.getWerte().equals(mf.getLiegendeKarte().getWerte())) {
				mf.setLiegendeKarte(karte);
				kartenStapel.add(karte);
				PlayerDran.getCurrentkart().remove(karte);
				mmsg = mmsg + (PlayerDran.name + " legt " + karte.getFigur() + "," + karte.getWerte()
						+ " und hat jetzt noch " + PlayerDran.currentkart.size() + " Karten \n");

				mf.setKonnteLegen(true);
				mf.setTest(mf.isKonnteLegen());
				break;
			}
		}
		return mmsg;
	}

}
