package wetter.information.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table()
public class Temperature implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Temperature")
	private float temperaturwert; // temperature.unitMaßeinheit. Der Possilbe-Wert ist Celsius, Kelvin,
	@Column(name = "Temperature-Max")
	private float temp_max;
	@Column(name = "Temperature-Min")
	private float temp_min;
	@Column(name = "Druck")
	private float druck;
	@Column(name = "Luftfeuchtigkeit")
	private float luftfeuchtigkeit;

	// private Kelvin unit; // es handelt sich hier, um die unité der Temperature,
	// die Kelvin übergeben wird.

	public Temperature(float temperaturwert, float temp_max, float temp_min, float druck, float luftfeuchtigkeit) {
		super();
		this.temperaturwert = temperaturwert;
		this.temp_max = temp_max;
		this.temp_min = temp_min;
		this.druck = druck;
		this.luftfeuchtigkeit = luftfeuchtigkeit;
	}

	public float getTemperaturwert() {
		return temperaturwert;
	}

	public void setTemperaturwert(float temperaturwert) {
		this.temperaturwert = temperaturwert;
	}

	public float getTemp_max() {
		return temp_max;
	}

	public void setTemp_max(float temp_max) {
		this.temp_max = temp_max;
	}

	public float getTemp_min() {
		return temp_min;
	}

	public void setTemp_min(float temp_min) {
		this.temp_min = temp_min;
	}

}
