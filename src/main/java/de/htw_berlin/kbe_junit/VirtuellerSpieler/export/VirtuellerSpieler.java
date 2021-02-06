package de.htw_berlin.kbe_junit.VirtuellerSpieler.export;

import java.util.ArrayList;

import javax.persistence.Entity;

import de.htw_berlin.kbe_junit.karten.export.Karten;
import de.htw_berlin.kbe_junit.spieler.export.Spieler;

@Entity
public class VirtuellerSpieler extends Spieler {

	public VirtuellerSpieler(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

}
