package de.htw_berlin.kbe_junit.Controller.impl;

import de.htw_berlin.kbe_junit.View.impl.*;
import de.htw_berlin.kbe_junit.VirtuellerSpieler.export.VirtuellerSpieler;
import de.htw_berlin.kbe_junit.VirtuellerSpieler.export.VirtuellerSpielerInterface;
import de.htw_berlin.kbe_junit.VirtuellerSpieler.impl.VirtuellerSpielerService;
import de.htw_berlin.kbe_junit.Controller.export.ControllerInterface;
import de.htw_berlin.kbe_junit.Exception.impl.DaoException;
import de.htw_berlin.kbe_junit.Exception.impl.FormatException;
import de.htw_berlin.kbe_junit.MauFeld.export.MauFeld;
import de.htw_berlin.kbe_junit.MauFeld.export.MaumauInterface;
import de.htw_berlin.kbe_junit.Sonderregel.export.SonderregelnInterface;
import de.htw_berlin.kbe_junit.karten.export.Figur;
import de.htw_berlin.kbe_junit.karten.export.Karten;
import de.htw_berlin.kbe_junit.karten.export.KartenInterface;
import de.htw_berlin.kbe_junit.karten.export.Werte;
import de.htw_berlin.kbe_junit.spieler.export.Spieler;
import de.htw_berlin.kbe_junit.spieler.export.SpielerInterface;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Controller implements ControllerInterface {

	@Autowired
	private SpielerInterface spielerservice;

	@Autowired
	private KartenInterface kartenservice;

	@Autowired
	private MaumauInterface mauservice;

	@Autowired
	private SonderregelnInterface sondernservice;

	@Autowired
	private VirtuellerSpielerInterface virtuellservice;

	private Werte[] werte;
	private Figur[] figur;
	private ArrayList<Spieler> spielerlist;
	ArrayList<Karten> k;
	Karten cart;

	public void initelement(MauFeld maufeld1, PlayView mau1, StartView sjframe1, Anleitung anleitung1, Figur[] figur1,
			Werte[] werte1) {
		final MauFeld maufeld;
		final PlayView mau;
		final StartView sjframe;
		final Anleitung anleitung;
		final VirtuellerSpieler computer = new VirtuellerSpieler("Computer");
		maufeld = maufeld1;
		mau = mau1;
		anleitung = anleitung1;
		sjframe = sjframe1;
		sjframe.setVisible(true);
		figur = figur1;
		werte = werte1;

		sjframe.getAbsenden().addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				spielerlist = spielerservice.PlayerErzeugen(3);

				spielerlist.get(0).setName(sjframe.getTextname1().getText());
				spielerlist.set(1, computer);
				spielerlist.get(2).setName(sjframe.getTextname2().getText());

				// TimeZone.setDefault( TimeZone.getTimeZone( "UTC" ) );
				EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("manager");

				EntityManager em = entityManagerFactory.createEntityManager();
				try {
					em.getTransaction().begin();

					for (int i = 0; i <= 2; i++) {
						Spieler a = new Spieler(spielerlist.get(i).getName());

						em.persist(a);
					}

					em.getTransaction().commit();
				} catch (PersistenceException ex) {
					throw new DaoException(ex.getMessage());

				} finally {
					em.close();
					entityManagerFactory.close();
				}

				mau.setVisible(true);
				// anleitung.setVisible(true);
				mau.getLabel_name1().setText(spielerlist.get(0).getName());
				mau.getLabel_name2().setText(spielerlist.get(1).getName());
				mau.getLabel_name3().setText(spielerlist.get(2).getName());
				sjframe.dispose();
			}
		});

		mau.getAnleitung1().addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				// Anleitung anleitung=new Anleitung();
				anleitung.setVisible(true);

			}
		});

		mau.getButton_karten_erzeug().addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				k = kartenservice.KartenPileErzeugen(figur, werte);

				mau.getTextarea_verlauf().setText("Kartenstapel von 32 Karten ");
				for (int i = 0; i < k.size(); i++) {

					mau.getTextarea_verlauf().setText(mau.getTextarea_verlauf().getText() + "\n" + k.get(i).toString());

				}
				mau.getButton_karten_erzeug().setEnabled(false);
			}
		});

		mau.getBoutton_verteilen().addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				mauservice.kartenVerteilen(k, spielerlist);

				/*
				 * 
				 * // TimeZone.setDefault( TimeZone.getTimeZone( "UTC" ) ); EntityManagerFactory
				 * entityManagerFactory = Persistence.createEntityManagerFactory("manager");
				 * 
				 * EntityManager em = entityManagerFactory.createEntityManager(); try {
				 * em.getTransaction().begin();
				 * 
				 * Set<Karten> europeCountries = new HashSet<Karten>();
				 * 
				 * europeCountries.add(k.get(1)); europeCountries.add(k.get(2));
				 * europeCountries.add(k.get(2));
				 * 
				 * 
				 * ( spielerlist.get(2)).setKartens(europeCountries);
				 * 
				 * 
				 * 
				 * em.persist(spielerlist);
				 * 
				 * 
				 * 
				 * 
				 * 
				 * 
				 * 
				 * em.getTransaction().commit(); } finally { em.close();
				 * entityManagerFactory.close(); }
				 */

				mauservice.obersteKarteZiehen(maufeld, k);

				mau.getTextArea_spieler1().setBackground(Color.GREEN);
				mau.getTextArea_spieler1().setText(spielerservice.spielerKartenAnzeigen(spielerlist, 0));
				mau.getTextarea_computer().setText("hat noch " + spielerlist.get(1).getCurrentkart().size());
				mau.getTextarea_spieler2().setText(spielerservice.spielerKartenAnzeigen(spielerlist, 2));

				mau.getTextarea_figur().setText(maufeld.getLiegendeKarte().getFigur().toString());
				mau.getTextarea_werte().setText(maufeld.getLiegendeKarte().getWerte().toString());
				mau.getBoutton_verteilen().setEnabled(false);

			}
		});

		mau.getButton_anlegen().addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				int karteindex = 0;
				if (maufeld.getSpielerDranIndex() == 0) {
					try {
						karteindex = Integer.parseInt(mau.getText_kartenindex_1().getText());
					} catch (NumberFormatException ex1) {
						throw new FormatException(ex1.getMessage());
					}
				} else if (maufeld.getSpielerDranIndex() == 2) {
					karteindex = Integer.parseInt(mau.getText_karteindex_3().getText());

				}

				if (!maufeld.spielEntschieden) {
					String mssg = "";
					if (maufeld.getSpielerDranIndex() == 0 || maufeld.getSpielerDranIndex() == 2) {
						mssg = sondernservice.zweikartenerhalten(maufeld, spielerlist, k)
								+ sondernservice.kartenlegen(maufeld, spielerlist, k, karteindex)
								+ sondernservice.konntelegen(maufeld, spielerlist, k)
								+ sondernservice.hatgewonnen(maufeld, spielerlist);
					}

					else {
						mssg = sondernservice.zweikartenerhalten(maufeld, spielerlist, k)
								+ virtuellservice.autokartenlegen(maufeld, computer, k)
								+ sondernservice.konntelegen(maufeld, spielerlist, k)
								+ sondernservice.hatgewonnen(maufeld, spielerlist);
					}
					sondernservice.richtungswechsel(maufeld, spielerlist);
					mau.getTextarea_verlauf().setText(mau.getTextarea_verlauf().getText() + "\n" + mssg);

					mau.getTextArea_spieler1().setText("");
					mau.getTextarea_computer().setText("");
					mau.getTextarea_spieler2().setText("");

					mau.getTextArea_spieler1().setText(spielerservice.spielerKartenAnzeigen(spielerlist, 0));
					mau.getTextarea_computer().setText("hat noch " + spielerlist.get(1).getCurrentkart().size());
					mau.getTextarea_spieler2().setText(spielerservice.spielerKartenAnzeigen(spielerlist, 2));

					mau.getTextarea_figur().setText(maufeld.getLiegendeKarte().getFigur().toString());
					mau.getTextarea_werte().setText(maufeld.getLiegendeKarte().getWerte().toString());

				} else {
					mau.getButton_anlegen().setEnabled(false);
				}
				int dran = maufeld.getSpielerDranIndex();
				/*
				 * // TimeZone.setDefault( TimeZone.getTimeZone( "UTC" ) ); EntityManagerFactory
				 * entityManagerFactory = Persistence.createEntityManagerFactory("manager");
				 * 
				 * EntityManager em = entityManagerFactory.createEntityManager(); try {
				 * em.getTransaction().begin();
				 * 
				 * em.persist(maufeld); em.getTransaction().commit(); }
				 * catch(PersistenceException ex){ throw new DaoException(ex.getMessage());
				 * 
				 * } finally { em.close(); entityManagerFactory.close(); }
				 */

				if (dran == 0) {
					mau.getTextArea_spieler1().setBackground(Color.GREEN);
					mau.getTextarea_computer().setBackground(Color.WHITE);
					mau.getTextarea_spieler2().setBackground(Color.WHITE);
				}
				if (dran == 1) {
					mau.getTextarea_computer().setBackground(Color.GREEN);
					mau.getTextArea_spieler1().setBackground(Color.WHITE);
					mau.getTextarea_spieler2().setBackground(Color.WHITE);
				}
				if (dran == 2) {
					mau.getKarten_spieler3().setBackground(Color.GREEN);
					mau.getTextarea_computer().setBackground(Color.WHITE);
					mau.getTextArea_spieler1().setBackground(Color.WHITE);
				}
				mau.getText_kartenindex_1().setText(null);
				mau.getText_karteindex_3().setText(null);
			}

		});
	}

}
