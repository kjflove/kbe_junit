package de.htw_berlin.kbe_junit.Exception.impl;

import java.awt.Component;

import javax.persistence.PersistenceException;
import javax.swing.JOptionPane;

public class DaoException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DaoException(PersistenceException e) {
		super(e);
	}

	public DaoException(String mssg) {
		super(mssg);
		Component parentComponent = null;
		JOptionPane.showMessageDialog(parentComponent, mssg);
	}

}
