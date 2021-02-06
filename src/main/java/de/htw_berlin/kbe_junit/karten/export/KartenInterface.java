package de.htw_berlin.kbe_junit.karten.export;

import java.util.ArrayList;

import de.htw_berlin.kbe_junit.MauFeld.export.MauFeld;

public interface KartenInterface {

	/**
	 * erzeugt den KartenStapel fuer den Spiel.
	 * 
	 * @param figur,
	 *            eine Tabelle von Figuren der Karten .
	 * @param werte,
	 *            eine Tabelle von Werten der Karten
	 * @return ein ArrayList, gibt eine Liste der Karten in KartenStapel zurueck.
	 */
	public ArrayList<Karten> KartenPileErzeugen(Figur[] figur, Werte[] werte);

}
