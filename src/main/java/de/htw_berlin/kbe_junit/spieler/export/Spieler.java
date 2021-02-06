package de.htw_berlin.kbe_junit.spieler.export;

import de.htw_berlin.kbe_junit.karten.export.Karten;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Set;

import javax.persistence.OneToMany;

/**
 * 
 * Klasse Spieler fuer Intanz eines Objekts Spieler.
 * 
 * @author Jean, Alain und Niekema.
 */
@Entity
public class Spieler implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	public String name;

	public ArrayList<Karten> currentkart;

	private Set<Karten> kartens;

	public Spieler(String name) {
		super();
		this.name = name;
		this.currentkart = new ArrayList<Karten>();
	}

	@Column(nullable = false)
	public String getName() {
		return name;
	}

	@Id

	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(nullable = false)

	@OneToMany(mappedBy = "spieler")
	@ElementCollection(targetClass = Karten.class)

	public Set<Karten> getKartens() {
		return kartens;
	}

	public void setKartens(Set<Karten> kartens) {
		this.kartens = kartens;
	}

	public ArrayList<Karten> getCurrentkart() {
		return currentkart;
	}

	public void setCurrentkart(ArrayList<Karten> currentkart) {
		this.currentkart = currentkart;
	}

}
