package de.htw_berlin.kbe_junit.Dep_Injection.impl;

import de.htw_berlin.kbe_junit.MauFeld.export.MauFeld;
import de.htw_berlin.kbe_junit.MauFeld.export.MaumauInterface;
import de.htw_berlin.kbe_junit.karten.export.Figur;
import de.htw_berlin.kbe_junit.karten.export.Werte;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class InjectionMain {

	private static ConfigurableApplicationContext container = new AnnotationConfigApplicationContext(
			"de.htw_berlin.kbe_junit");

	public static void main(String[] args) {

		Werte[] werte = new Werte[8];
		Figur[] figure = new Figur[4];

		werte[0] = Werte.ASS;
		werte[1] = Werte.Koenig;
		werte[2] = Werte.Dame;
		werte[3] = Werte.Bube;
		werte[4] = Werte.teen;
		werte[5] = Werte.nine;
		werte[6] = Werte.eight;
		werte[7] = Werte.seven;
		figure[0] = Figur.Kreuz;
		figure[1] = Figur.Pik;
		figure[2] = Figur.Herz;
		figure[3] = Figur.Karo;

		MauFeld spielfeld = new MauFeld(0);

		MaumauInterface ui = container.getBean(MaumauInterface.class);

		ui.spielstarten(spielfeld, 3, figure, werte);

	}

}