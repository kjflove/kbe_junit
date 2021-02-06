package de.htw_berlin.kbe_junit.spieler.impl;

import java.util.ArrayList;
import java.util.Scanner;

import org.springframework.stereotype.Component;

import de.htw_berlin.kbe_junit.MauFeld.export.MauFeld;
import de.htw_berlin.kbe_junit.spieler.export.Spieler;
import de.htw_berlin.kbe_junit.spieler.export.SpielerInterface;

@Component
public class SpielerService implements SpielerInterface {

	public ArrayList<Spieler> PlayerErzeugen(int anzahl) {
		// TODO Auto-generated method stub
		ArrayList<Spieler> list = new ArrayList<Spieler>();

		for (int i = 0; i < anzahl; i++) {

			list.add(new Spieler(""));

		}
		return list;
	}

	public String spielerKartenAnzeigen(ArrayList<Spieler> spielerlist, int index) {
		// TODO Auto-generated method stub
		String rueckgabe = "";
		for (int i = 0; i < spielerlist.get(index).getCurrentkart().size(); i++) {

			rueckgabe = rueckgabe + i + ": " + spielerlist.get(index).getCurrentkart().get(i).toString() + "\n";
		}
		return rueckgabe;
	}

}
