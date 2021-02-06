package de.htw_berlin.kbe_junit.MauFeld.export;

import java.util.ArrayList;

import de.htw_berlin.kbe_junit.MauFeld.impl.*;
import de.htw_berlin.kbe_junit.Sonderregel.export.SonderregelnInterface;
import de.htw_berlin.kbe_junit.karten.export.Figur;
import de.htw_berlin.kbe_junit.karten.export.Karten;
import de.htw_berlin.kbe_junit.karten.export.Werte;
import de.htw_berlin.kbe_junit.spieler.export.Spieler;
import de.htw_berlin.kbe_junit.spieler.impl.*;

/**
 * 
 * Interface der Klasse MauFeld.
 * 
 * @author Jean, Alain und Niekema.
 */

public interface MaumauInterface {

	/**
	 * teil den Spieler die karten aus.
	 * 
	 * @param kartenStapel,
	 *            Stapel der Karten.
	 * @param spieler,
	 *            Liste der Spieler.
	 */
	public void kartenVerteilen(ArrayList<Karten> kartenStapel, ArrayList<Spieler> spieler); /// umschreiben in
																								/// Mausrvice

	/**
	 * nimmt die oberste Karte auf den KartenStapel.
	 * 
	 * @param mf
	 *            ein Objekt der Datentyp Maufeld .
	 * @param kartenStapel,
	 *            Stapel der Karten.
	 * @return liefert die oberste Karte des Stapels.
	 */
	public Karten obersteKarteZiehen(MauFeld mf, ArrayList<Karten> kartenStapel);

	/**
	 * Spielzustand starten.
	 * 
	 * @param mf
	 *            ein Objekt der Datentyp Maufeld .
	 * @param zahl,
	 *            Anzahl der Spieler.
	 * @param figur,
	 *            eine Tabelle für die Karten-Figure
	 * @param werte,
	 *            eine Tabelle für die Karten-Werte
	 */
	public void spielstarten(MauFeld mf, int zahl, Figur[] figur, Werte[] werte);

}
