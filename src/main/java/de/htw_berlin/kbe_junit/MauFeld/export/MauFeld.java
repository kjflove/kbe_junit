package de.htw_berlin.kbe_junit.MauFeld.export;

import de.htw_berlin.kbe_junit.karten.impl.*;
import de.htw_berlin.kbe_junit.MauFeld.export.*;
import de.htw_berlin.kbe_junit.MauFeld.impl.*;
import de.htw_berlin.kbe_junit.spieler.export.Spieler;
import de.htw_berlin.kbe_junit.spieler.impl.*;
import de.htw_berlin.kbe_junit.karten.export.*;
import de.htw_berlin.kbe_junit.karten.impl.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * 
 * Klasse Maufeld fuer Intanz eines Objekts des Spielfelds.
 * 
 * @author Jean, Alain und Niekema.
 */
@Entity
public class MauFeld {
	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;
	@Column(nullable = false)
	Karten liegendeKarte = null;
	@Column(nullable = false)
	public boolean spielEntschieden = false;
	@Column(nullable = false)
	public int spielerDranIndex;
	@Column(nullable = false)
	public boolean richtung = true;
	@Column(nullable = false)
	boolean test = false;
	@Column(nullable = false)
	boolean konnteLegen = false;

	public MauFeld(int spielerDranIndex) {

		this.spielerDranIndex = spielerDranIndex;

	}

	/**
	 * @return the liegendeKarte
	 */
	public Karten getLiegendeKarte() {
		return liegendeKarte;
	}

	/**
	 * @param liegendeKarte
	 *            the liegendeKarte to set
	 */
	public void setLiegendeKarte(Karten liegendeKarte) {
		this.liegendeKarte = liegendeKarte;
	}

	/**
	 * @return the spielEntschieden
	 */
	public boolean isSpielEntschieden() {
		return spielEntschieden;
	}

	/**
	 * @param spielEntschieden
	 *            the spielEntschieden to set
	 */
	public void setSpielEntschieden(boolean spielEntschieden) {
		this.spielEntschieden = spielEntschieden;
	}

	/**
	 * @return the spielerDranIndex
	 */
	public int getSpielerDranIndex() {
		return spielerDranIndex;
	}

	/**
	 * @param spielerDranIndex
	 *            the spielerDranIndex to set
	 */
	public void setSpielerDranIndex(int spielerDranIndex) {
		this.spielerDranIndex = spielerDranIndex;
	}

	/**
	 * @return the richtung
	 */
	public boolean isRichtung() {
		return richtung;
	}

	/**
	 * @param richtung
	 *            the richtung to set
	 */
	public void setRichtung(boolean richtung) {
		this.richtung = richtung;
	}

	public boolean isTest() {
		return test;
	}

	public void setTest(boolean test) {
		this.test = test;
	}

	public boolean isKonnteLegen() {
		return konnteLegen;
	}

	public void setKonnteLegen(boolean konnteLegen) {
		this.konnteLegen = konnteLegen;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
