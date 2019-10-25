package wetter.information.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Wetterdaten")
public class Wetterdaten implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int stadtId;
	@Column(name = "Name")
	private String stadtName;
	@Column(name = "Zeit")
	private Date Zeitzone;
	@Column(name = "Lan")
	private int koordLan; // Geografische Lage der Stadt, Längengrad
	@Column(name = "Lon")
	private int koordLon; // Geografische Lage der Stadt, Breitengrad

	@OneToOne(fetch = FetchType.EAGER) // hier wir land wie alle Wetterdaten
	private Laendercode land;

	@OneToOne(fetch = FetchType.EAGER)
	private Temperature temperature;

	@OneToOne(fetch = FetchType.EAGER)
	private Wolken wolke;

	@OneToOne(fetch = FetchType.EAGER)
	private Wetterzustandscodes wetterzustand;

	@OneToOne(fetch = FetchType.EAGER)
	private Wind wind;

	public Wetterdaten(String stadtName, int stadtId) {
		super();
		this.stadtName = stadtName;
		this.stadtId = stadtId;
	}

	public Wetterdaten(int stadtId, int koordLan, int koorLon) {
		super();
		this.stadtId = stadtId;
		this.koordLan = koordLan;
		this.koordLon = koorLon;
	}

	public String getStadtName() {
		return stadtName;
	}

	public void setStadtName(String stadtName) {
		this.stadtName = stadtName;
	}

	public int getKoordLan() {
		return koordLan;
	}

	public void setKoordLan(int KoordLan) {
		this.koordLan = KoordLan;
	}

	public int getKoordLon() {
		return koordLon;
	}

	public void setKoordLon(int koordLon) {
		this.koordLon = koordLon;
	}
}
