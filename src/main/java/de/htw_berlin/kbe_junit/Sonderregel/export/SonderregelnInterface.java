package de.htw_berlin.kbe_junit.Sonderregel.export;

import java.util.ArrayList;

import de.htw_berlin.kbe_junit.MauFeld.export.MauFeld;
import de.htw_berlin.kbe_junit.karten.export.Karten;
import de.htw_berlin.kbe_junit.spieler.export.Spieler;

public interface SonderregelnInterface {

	/**
	 * prüft ob, ein Spieler gewonnen hat und beendet das Spiel .
	 * 
	 * @param mf
	 *            Intanz der Klasse MauFeld .
	 * @param spielerlist,
	 *            Liste der Spieler.
	 * @return ein String, entspricht die Meldung zum gewinnenden Spieler .
	 */
	public String hatgewonnen(MauFeld mf, ArrayList<Spieler> spielerlist);

	/**
	 * ein Spieler bekommt zwei Karten, wenn die gerade liegende Karte mit wert
	 * seven ist .
	 * 
	 * @param mf
	 *            Intanz der Klasse MauFeld .
	 * @param spielerlist,
	 *            Liste der Spieler.
	 * @param kartenStapel,
	 *            Stapel der Karten .
	 * @return ein String, entspricht die Meldung .
	 */
	public String zweikartenerhalten(MauFeld mf, ArrayList<Spieler> spielerlist, ArrayList<Karten> kartenStapel);

	/**
	 * führt die Sonderregeln zu der gelegten Karte aus .
	 * 
	 * @param mf
	 *            Intanz der Klasse MauFeld .
	 * @param spielerlist,
	 *            Liste der Spieler.
	 * @param kartenStapel,
	 *            Stapel der Karten .
	 * @return ein String, entspricht die Meldung der ausgeführten Sonderregeln.
	 */
	public String konntelegen(MauFeld mf, ArrayList<Spieler> spielerlist, ArrayList<Karten> kartenStapel);

	/**
	 * der Dran Spieler legt automatisch eine Karte .
	 * 
	 * @param mf
	 *            Intanz der Klasse MauFeld .
	 * @param spielerlist,
	 *            Liste der Spieler.
	 * @param kartenStapel,
	 *            Stapel der Karten .
	 * @return ein String, entspricht die Meldung ob die Karte gelegt wurde.
	 */

	public String autokartenlegen(MauFeld mf, ArrayList<Spieler> spielerlist, ArrayList<Karten> kartenStapel);

	/**
	 * der Dran Spieler legt eine Karte .
	 * 
	 * @param mf
	 *            Intanz der Klasse MauFeld .
	 * @param spielerlist,
	 *            Liste der Spieler.
	 * @param kartenStapel,
	 *            Stapel der Karten .
	 * @param karteindex,
	 *            index der zu legenden Karte.
	 * @return ein String, entspricht die Meldung ob die Karte gelegt wurde.
	 */
	public String kartenlegen(MauFeld mf, ArrayList<Spieler> spielerlist, ArrayList<Karten> kartenStapel,
			int karteindex);

	/**
	 * wechselt die Richtung des Spieles.
	 * 
	 * @param mf
	 *            Intanz der Klasse MauFeld .
	 * @param spielerlist,
	 *            Liste der Spieler.
	 */
	public void richtungswechsel(MauFeld mf, ArrayList<Spieler> spielerlist);

	/**
	 * geht zu dem naechsten Spieler.
	 * 
	 * @param mf
	 *            Intanz der Klasse MauFeld .
	 * @param spielerlist,
	 *            Liste der Spieler.
	 * @return ein Integer-Wert, entspricht der Spielerindex ,der dran ist..
	 */

	public int naechsteSpieler(MauFeld mf, ArrayList<Spieler> spielerlist);

	/**
	 * geht zu dem vorigen Spieler.
	 * 
	 * @param mf
	 *            Intanz der Klasse MauFeld .
	 * @param spielerlist,
	 *            Liste der Spieler.
	 * @return ein Integer-Wert, entspricht der Spielerindex ,der dran war.
	 */
	public int vorigeSpieler(MauFeld mf, ArrayList<Spieler> spielerlist);

	/**
	 * der dran Spieler zieht eine Karte auf dem Stapel.
	 * 
	 * @param spieler
	 *            Intanz der Klasse Spieler .
	 * @param kartenStapel,
	 *            Stapel der Karten .
	 * @return eine Karte, entspricht der gezogenen Karte.
	 */

	public Karten kartenZiehen(Spieler spieler, ArrayList<Karten> kartenStapel);

}
