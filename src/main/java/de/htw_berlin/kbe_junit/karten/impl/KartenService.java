package de.htw_berlin.kbe_junit.karten.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import org.springframework.stereotype.Component;

import de.htw_berlin.kbe_junit.Exception.impl.DaoException;
import de.htw_berlin.kbe_junit.karten.export.Figur;
import de.htw_berlin.kbe_junit.karten.export.Karten;
import de.htw_berlin.kbe_junit.karten.export.KartenInterface;
import de.htw_berlin.kbe_junit.karten.export.Werte;

@Component
public class KartenService implements KartenInterface {

	Karten k;

	public ArrayList<Karten> KartenPileErzeugen(Figur[] figur, Werte[] werte) {
		// TODO Auto-generated method stub
		ArrayList<Karten> kartenStapel = new ArrayList<Karten>();
		for (int i = 0; i < figur.length; i++) {
			for (int j = 0; j < werte.length; j++) {
				k = new Karten(figur[i], werte[j]);
				kartenStapel.add(k);

				// TimeZone.setDefault( TimeZone.getTimeZone( "UTC" ) );
				EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("manager");

				EntityManager em = entityManagerFactory.createEntityManager();
				try {
					em.getTransaction().begin();

					// em.remove(em.find(Karten.class, 1L));
					// em.persist(k);

					em.persist(k);

					em.getTransaction().commit();
				} catch (PersistenceException ex) {
					throw new DaoException(ex.getMessage());

				} finally {
					em.close();
					entityManagerFactory.close();
				}

			}

		}
		Random zufall = new Random(System.currentTimeMillis());
		for (int i = 0; i < 1000; i++) {
			int index1 = zufall.nextInt(kartenStapel.size());
			int index2 = zufall.nextInt(kartenStapel.size());
			Collections.swap(kartenStapel, index1, index2);
		}
		return kartenStapel;
	}

}
