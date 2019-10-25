package wetter.information.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Wind implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Geschwindigkeit")
	private float geschwindigkeit;
	@Column(name = "Windrichtung")
	private float windrichtung;

	public Wind(float geschwindigkeit, float windrichtung) {
		super();
		this.geschwindigkeit = geschwindigkeit;
		this.windrichtung = windrichtung;
	}

	public float getGeschwindigkeit() {
		return geschwindigkeit;
	}

	public void setGeschwindigkeit(float geschwindigkeit) {
		this.geschwindigkeit = geschwindigkeit;
	}

	public float getWindrichtung() {
		return windrichtung;
	}

	public void setWindrichtung(float windrichtung) {
		this.windrichtung = windrichtung;
	}

}
