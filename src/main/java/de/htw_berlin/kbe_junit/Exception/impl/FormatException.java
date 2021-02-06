package de.htw_berlin.kbe_junit.Exception.impl;

import java.awt.Component;

import javax.swing.JOptionPane;

public class FormatException extends NumberFormatException {
	private static final long serialVersionUID = 1L;

	public FormatException(NumberFormatException e) {
		super();
	}

	public FormatException(String mssg) {
		super(mssg);
		Component parentComponent = null;
		JOptionPane.showMessageDialog(parentComponent, mssg);
	}
}
