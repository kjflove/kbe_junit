package de.htw_berlin.kbe_junit.karten.export;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import de.htw_berlin.kbe_junit.spieler.export.Spieler;

/**
 * 
 * Klasse Karten fuer Intanz eines Objekts Karte.
 * 
 * @author Jean, Alain und Niekema.
 */

@Entity
public class Karten implements Serializable {

	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name = "spieler_id")
	private Spieler spieler;

	public Spieler getSpieler() {
		return spieler;
	}

	public void setSpieler(Spieler spieler) {
		this.spieler = spieler;
	}

	@Id

	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	Werte werte;
	Figur figur;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(nullable = false)
	public Werte getWerte() {
		return werte;
	}

	public void setWerte(Werte werte) {
		this.werte = werte;
	}

	@Column(nullable = false)
	public Figur getFigur() {
		return figur;
	}

	public void setFigur(Figur figur) {
		this.figur = figur;
	}

	public Karten(Figur figur, Werte werte) {

		this.werte = werte;
		this.figur = figur;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return figur + "," + werte;
	}

}