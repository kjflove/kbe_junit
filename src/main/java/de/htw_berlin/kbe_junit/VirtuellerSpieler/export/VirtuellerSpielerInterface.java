package de.htw_berlin.kbe_junit.VirtuellerSpieler.export;

import java.util.ArrayList;

import de.htw_berlin.kbe_junit.MauFeld.export.MauFeld;
import de.htw_berlin.kbe_junit.karten.export.Karten;
import de.htw_berlin.kbe_junit.spieler.export.Spieler;

public interface VirtuellerSpielerInterface {

	/**
	 * der Dran VirtuellerSpieler legt automatisch eine Karte .
	 * 
	 * @param mf
	 *            Intanz der Klasse MauFeld .
	 * @param computer,Intanz
	 *            der VirtuellerSpieler.
	 * @param kartenStapel,
	 *            Stapel der Karten .
	 * @return ein String, entspricht die Meldung ob die Karte gelegt wurde.
	 */

	public String autokartenlegen(MauFeld mf, VirtuellerSpieler computer, ArrayList<Karten> kartenStapel);

}
