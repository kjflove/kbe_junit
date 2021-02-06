package de.htw_berlin.kbe_junit.Exception.impl;

import java.awt.Component;
import java.awt.Frame;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class IndexException extends IndexOutOfBoundsException {
	private static final long serialVersionUID = 1L;

	public IndexException(IndexOutOfBoundsException e) {
		super();
	}

	public IndexException(String mssg) {
		super(mssg);
		Component parentComponent = null;
		JOptionPane.showMessageDialog(parentComponent, mssg);
	}
}