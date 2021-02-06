package de.htw_berlin.kbe_junit.spieler.export;

import java.util.ArrayList;

import de.htw_berlin.kbe_junit.MauFeld.export.MauFeld;

/**
 * 
 * Interface fuer die Klasse Spieler.
 * 
 * @author Jean, Alain und Niekema.
 */
public interface SpielerInterface {

	/**
	 * erzeugt eine Liste von Spielern.
	 * 
	 * @param zahl,
	 *            entspricht der Anzahl der Spieler.
	 * @return ein ArrayList, gibt eine Liste von Spielern zurueck.
	 */
	public ArrayList<Spieler> PlayerErzeugen(int zahl);

	/**
	 * zeigt die Karten eines Spielers.
	 * 
	 * @param spielerlist,
	 *            entspricht die Liste der Spieler.
	 * @param index,
	 *            entspricht die index des Spielersvon der Liste.
	 * @return ein String, gibt eine die Karten eines Spielers zurueck.
	 */
	String spielerKartenAnzeigen(ArrayList<Spieler> spielerlist, int index);

}
