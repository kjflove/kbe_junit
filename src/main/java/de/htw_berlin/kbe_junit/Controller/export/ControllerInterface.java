package de.htw_berlin.kbe_junit.Controller.export;

import de.htw_berlin.kbe_junit.MauFeld.export.MauFeld;
import de.htw_berlin.kbe_junit.View.impl.Anleitung;

import de.htw_berlin.kbe_junit.View.impl.PlayView;

import de.htw_berlin.kbe_junit.View.impl.StartView;
import de.htw_berlin.kbe_junit.karten.export.Figur;
import de.htw_berlin.kbe_junit.karten.export.Werte;

public interface ControllerInterface {
	public void initelement(MauFeld maufeld, PlayView mau, StartView sjframe, Anleitung anleitung, Figur[] figur,
			Werte[] werte);

}
