package de.htw_berlin.kbe_junit.View.impl;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MauMauJFrame extends javax.swing.JFrame {

	SpielerJFrame sjf;
	// Variables declaration - do not modify
	private JButton boutton_verteilen;
	private JButton button_anlegen;
	private JButton button_karten_erzeug;
	private JLabel jLabel1;
	private JLabel jLabel2;
	private JLabel jLabel3;
	private JLabel jLabel4;
	private JLabel jLabel5;
	private JLabel jLabel6;
	private JLabel jLabel7;
	private JLabel jLabel8;
	private JMenuBar jMenuBar1;
	private JMenuItem jMenuItem1;
	private JMenuItem jMenuItem2;
	private JPanel jPanel1;
	private JPanel jPanel2;
	private JPanel jPanel3;
	private JPanel jPanel4;
	private JPanel jPanel5;
	private JScrollPane jScrollPane1;
	private JScrollPane jScrollPane2;
	private JScrollPane jScrollPane3;
	private JScrollPane jScrollPane4;
	private JScrollPane jScrollPane5;
	private JScrollPane jScrollPane6;
	private JScrollPane jScrollPane7;
	private JTextArea jTextArea1;
	private JTextArea karten_spieler1;
	private JTextArea karten_spieler2;
	private JTextArea karten_spieler3;
	private JLabel label_name1;
	private JLabel label_name2;
	private JLabel label_name3;
	private JMenu menu_beenden;
	private JMenu menu_datei;
	private JTextField text_karteindex_2;
	private JTextField text_karteindex_3;
	private JTextField text_kartenindex_1;
	private JTextArea textarea_figur;
	private JTextArea textarea_verlauf;
	private JTextArea textarea_werte;
	// End of variables declaration

	/**
	 * Creates new form MauMauJFrame
	 */
	public MauMauJFrame() {
		initComponents();
	}

	public MauMauJFrame(String n1, String n2, String n3) {
		initComponents();
		label_name1.setText(n1);
		label_name2.setText(n2);
		label_name3.setText(n3);
	}

	private void initComponents() {

		jScrollPane2 = new JScrollPane();
		jTextArea1 = new JTextArea();
		jPanel1 = new JPanel();
		jLabel1 = new JLabel();
		jLabel5 = new JLabel();
		jScrollPane6 = new JScrollPane();
		textarea_figur = new JTextArea();
		jPanel2 = new JPanel();
		jLabel3 = new JLabel();
		jScrollPane1 = new JScrollPane();
		textarea_verlauf = new JTextArea();
		jPanel3 = new JPanel();
		jLabel2 = new JLabel();
		jScrollPane7 = new JScrollPane();
		textarea_werte = new JTextArea();
		jPanel4 = new JPanel();
		jLabel4 = new JLabel();
		jScrollPane3 = new JScrollPane();
		karten_spieler1 = new JTextArea();
		jScrollPane4 = new JScrollPane();
		karten_spieler2 = new JTextArea();
		jScrollPane5 = new JScrollPane();
		karten_spieler3 = new JTextArea();
		label_name1 = new JLabel();
		label_name2 = new JLabel();
		label_name3 = new JLabel();
		text_kartenindex_1 = new JTextField();
		jLabel6 = new JLabel();
		jLabel7 = new JLabel();
		text_karteindex_2 = new JTextField();
		jLabel8 = new JLabel();
		text_karteindex_3 = new JTextField();
		jPanel5 = new JPanel();
		button_anlegen = new JButton();
		button_karten_erzeug = new JButton();
		boutton_verteilen = new JButton();
		jMenuBar1 = new JMenuBar();
		menu_datei = new JMenu();
		jMenuItem1 = new JMenuItem();
		jMenuItem2 = new JMenuItem();
		menu_beenden = new JMenu();

		jTextArea1.setColumns(20);
		jTextArea1.setRows(5);
		jScrollPane2.setViewportView(jTextArea1);

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("MauMau-Spielfeld");
		setLocation(new java.awt.Point(100, 100));

		jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
		jPanel1.setToolTipText("");

		jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
		jLabel1.setText("Liegende Karte");

		jLabel5.setText("Figur");

		textarea_figur.setEditable(false);
		textarea_figur.setColumns(20);
		textarea_figur.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
		textarea_figur.setForeground(new java.awt.Color(255, 0, 0));
		textarea_figur.setRows(5);
		textarea_figur.setAlignmentX(5.0F);
		textarea_figur.setAlignmentY(5.0F);
		textarea_figur.setDisabledTextColor(new java.awt.Color(0, 0, 0));
		jScrollPane6.setViewportView(textarea_figur);

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup()
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 223,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel1).addComponent(jLabel5))));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel1)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel5)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
						.addContainerGap()));

		jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 153)));

		jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
		jLabel3.setText("Spielverlauf");

		textarea_verlauf.setColumns(20);
		textarea_verlauf.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		textarea_verlauf.setRows(5);
		textarea_verlauf.setDisabledTextColor(new java.awt.Color(0, 0, 0));
		textarea_verlauf.setEnabled(false);
		textarea_verlauf.setName("verlauftext"); // NOI18N
		jScrollPane1.setViewportView(textarea_verlauf);

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
				.addGroup(jPanel2Layout.createSequentialGroup().addContainerGap()
						.addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 197,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup().addGap(5, 5, 5).addComponent(jLabel3)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));

		jLabel2.setText("Werte");

		textarea_werte.setEditable(false);
		textarea_werte.setColumns(20);
		textarea_werte.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
		textarea_werte.setForeground(new java.awt.Color(0, 51, 153));
		textarea_werte.setRows(5);
		textarea_werte.setAlignmentX(5.0F);
		textarea_werte.setAlignmentY(5.0F);
		textarea_werte.setDisabledTextColor(new java.awt.Color(0, 0, 0));
		jScrollPane7.setViewportView(textarea_werte);

		javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
		jPanel3.setLayout(jPanel3Layout);
		jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel3Layout.createSequentialGroup().addContainerGap()
						.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 213,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel2))
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel3Layout.createSequentialGroup().addComponent(jLabel2)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 130,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51)));

		jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
		jLabel4.setText("Karten der aktuellen Spieler");

		karten_spieler1.setColumns(20);
		karten_spieler1.setRows(5);
		karten_spieler1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
		karten_spieler1.setEnabled(false);
		karten_spieler1.setName("kartenspieler1"); // NOI18N
		jScrollPane3.setViewportView(karten_spieler1);

		karten_spieler2.setColumns(20);
		karten_spieler2.setRows(5);
		karten_spieler2.setDisabledTextColor(new java.awt.Color(0, 0, 0));
		karten_spieler2.setEnabled(false);
		karten_spieler2.setName("kartenspieler2"); // NOI18N
		jScrollPane4.setViewportView(karten_spieler2);

		karten_spieler3.setColumns(20);
		karten_spieler3.setRows(5);
		karten_spieler3.setDisabledTextColor(new java.awt.Color(0, 0, 0));
		karten_spieler3.setEnabled(false);
		karten_spieler3.setName("kartenspielr3"); // NOI18N
		jScrollPane5.setViewportView(karten_spieler3);

		label_name1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
		label_name1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		label_name1.setText("name1");
		label_name1.setName("spielername1"); // NOI18N

		label_name2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
		label_name2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		label_name2.setText("name2");
		label_name2.setName("spielername2"); // NOI18N

		label_name3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
		label_name3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		label_name3.setText("name3");
		label_name3.setName("spielername3"); // NOI18N

		jLabel6.setText("Karte Nr:=>");

		jLabel7.setText("Karte Nr:=>");

		jLabel8.setText("Karte Nr:=>");

		javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
		jPanel4.setLayout(jPanel4Layout);
		jPanel4Layout.setHorizontalGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel4Layout.createSequentialGroup().addContainerGap()
						.addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
								.addGroup(jPanel4Layout.createSequentialGroup()
										.addComponent(label_name1, javax.swing.GroupLayout.PREFERRED_SIZE, 79,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(jLabel6)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(text_kartenindex_1)))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 213,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGroup(jPanel4Layout.createSequentialGroup()
										.addComponent(label_name2, javax.swing.GroupLayout.PREFERRED_SIZE, 67,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 68,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(text_karteindex_2)))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 175,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGroup(jPanel4Layout.createSequentialGroup()
										.addComponent(label_name3, javax.swing.GroupLayout.PREFERRED_SIZE, 59,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jLabel7)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(text_karteindex_3)))
						.addGap(23, 23, 23))
				.addGroup(jPanel4Layout.createSequentialGroup().addComponent(jLabel4).addContainerGap()));
		jPanel4Layout.setVerticalGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel4Layout.createSequentialGroup().addComponent(jLabel4)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
								.addComponent(jScrollPane4).addComponent(jScrollPane3))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								jPanel4Layout.createSequentialGroup().addGroup(jPanel4Layout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
										.addGroup(jPanel4Layout.createSequentialGroup().addGap(3, 3, 3).addComponent(
												jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
										.addComponent(label_name1, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
										.addGap(1, 1, 1))
								.addComponent(text_kartenindex_1, javax.swing.GroupLayout.DEFAULT_SIZE, 27,
										Short.MAX_VALUE)
								.addComponent(label_name2, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(text_karteindex_2)
								.addComponent(label_name3, javax.swing.GroupLayout.Alignment.TRAILING,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addComponent(text_karteindex_3).addComponent(jLabel7,
										javax.swing.GroupLayout.Alignment.TRAILING,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE))
						.addGap(15, 15, 15)));

		jPanel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

		button_anlegen.setBackground(new java.awt.Color(0, 153, 0));
		button_anlegen.setText("Karte anlegen");
		button_anlegen.setAutoscrolls(true);

		button_karten_erzeug.setBackground(new java.awt.Color(102, 255, 255));
		button_karten_erzeug.setText("Karten Erzeugen");

		boutton_verteilen.setBackground(new java.awt.Color(102, 102, 255));
		boutton_verteilen.setText("Karten verteilen");

		javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
		jPanel5.setLayout(jPanel5Layout);
		jPanel5Layout.setHorizontalGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel5Layout.createSequentialGroup().addContainerGap()
						.addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addComponent(button_karten_erzeug, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(button_anlegen, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(boutton_verteilen, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addContainerGap(96, Short.MAX_VALUE)));
		jPanel5Layout.setVerticalGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel5Layout.createSequentialGroup().addContainerGap()
						.addComponent(button_karten_erzeug, javax.swing.GroupLayout.PREFERRED_SIZE, 44,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addComponent(boutton_verteilen, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addComponent(button_anlegen, javax.swing.GroupLayout.PREFERRED_SIZE, 34,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(21, 21, 21)));

		menu_datei.setText("datei");
		menu_datei.setName("datei"); // NOI18N

		jMenuItem1.setText("new Spiel");
		jMenuItem1.setName("newspiel"); // NOI18N
		menu_datei.add(jMenuItem1);

		jMenuItem2.setText("Spielanleitung");
		jMenuItem2.setName("anleitung"); // NOI18N
		menu_datei.add(jMenuItem2);

		jMenuBar1.add(menu_datei);

		menu_beenden.setText("beenden");
		menu_beenden.setName("beenden"); // NOI18N
		jMenuBar1.add(menu_beenden);

		setJMenuBar(jMenuBar1);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup()
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
								.addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addGroup(layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
						.addGroup(layout.createSequentialGroup()
								.addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(18, 18, 18).addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGroup(layout.createSequentialGroup()
								.addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(18, 18, 18).addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addGap(23, 23, 23)));

		pack();
	}// </editor-fold>

	public SpielerJFrame getSjf() {
		return sjf;
	}

	public void setSjf(SpielerJFrame sjf) {
		this.sjf = sjf;
	}

	public JButton getButton_karten_erzeug() {
		return button_karten_erzeug;
	}

	public void setButton_karten_erzeug(JButton button_karten_erzeug) {
		this.button_karten_erzeug = button_karten_erzeug;
	}

	public JButton getBoutton_verteilen() {
		return boutton_verteilen;
	}

	public void setBoutton_verteilen(JButton boutton_verteilen) {
		this.boutton_verteilen = boutton_verteilen;
	}

	public JButton getButton_anlegen() {
		return button_anlegen;
	}

	public void setButton_anlegen(JButton button_anlegen) {
		this.button_anlegen = button_anlegen;
	}

	public JTextArea getKarten_spieler1() {
		return karten_spieler1;
	}

	public void setKarten_spieler1(JTextArea karten_spieler1) {
		this.karten_spieler1 = karten_spieler1;
	}

	public JTextArea getKarten_spieler2() {
		return karten_spieler2;
	}

	public void setKarten_spieler2(JTextArea karten_spieler2) {
		this.karten_spieler2 = karten_spieler2;
	}

	public JTextArea getKarten_spieler3() {
		return karten_spieler3;
	}

	public void setKarten_spieler3(JTextArea karten_spieler3) {
		this.karten_spieler3 = karten_spieler3;
	}

	public JLabel getLabel_name1() {
		return label_name1;
	}

	public void setLabel_name1(JLabel label_name1) {
		this.label_name1 = label_name1;
	}

	public JLabel getLabel_name2() {
		return label_name2;
	}

	public void setLabel_name2(JLabel label_name2) {
		this.label_name2 = label_name2;
	}

	public JLabel getLabel_name3() {
		return label_name3;
	}

	public void setLabel_name3(JLabel label_name3) {
		this.label_name3 = label_name3;
	}

	public JMenu getMenu_beenden() {
		return menu_beenden;
	}

	public void setMenu_beenden(JMenu menu_beenden) {
		this.menu_beenden = menu_beenden;
	}

	public JMenu getMenu_datei() {
		return menu_datei;
	}

	public void setMenu_datei(JMenu menu_datei) {
		this.menu_datei = menu_datei;
	}

	public JTextArea getTextarea_figur() {
		return textarea_figur;
	}

	public void setTextarea_figur(JTextArea textarea_figur) {
		this.textarea_figur = textarea_figur;
	}

	public JTextArea getTextarea_verlauf() {
		return textarea_verlauf;
	}

	public void setTextarea_verlauf(JTextArea textarea_verlauf) {
		this.textarea_verlauf = textarea_verlauf;
	}

	public JTextArea getTextarea_werte() {
		return textarea_werte;
	}

	public void setTextarea_werte(JTextArea textarea_werte) {
		this.textarea_werte = textarea_werte;
	}

	public JTextField getText_karteindex_2() {
		return text_karteindex_2;
	}

	public void setText_karteindex_2(JTextField text_karteindex_2) {
		this.text_karteindex_2 = text_karteindex_2;
	}

	public JTextField getText_karteindex_3() {
		return text_karteindex_3;
	}

	public void setText_karteindex_3(JTextField text_karteindex_3) {
		this.text_karteindex_3 = text_karteindex_3;
	}

	public JTextField getText_kartenindex_1() {
		return text_kartenindex_1;
	}

	public void setText_kartenindex_1(JTextField text_kartenindex_1) {
		this.text_kartenindex_1 = text_kartenindex_1;
	}

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String args[]) {
		new MauMauJFrame().setVisible(true);

	}

}
