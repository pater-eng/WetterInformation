package wetter.information.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Land")
public class Laendercode implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CountryCode")
	private String country; // ISO-Code : 2 Stellige Code
	@Column(name = "SonnenAufgang")
	private Date sonnenAufgang;
	@Column(name = "SonnenUntergang")
	private Date sonnenUntergang;

	public Laendercode(String country, Date sonnenAufgang, Date sonnenUntergang) {
		super();
		this.country = country;
		this.sonnenAufgang = sonnenAufgang;
		this.sonnenUntergang = sonnenUntergang;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Date getSonnenAufgang() {
		return sonnenAufgang;
	}

	public void setSonnenAufgang(Date sonnenAufgang) {
		this.sonnenAufgang = sonnenAufgang;
	}

	public Date getSonnenUntergang() {
		return sonnenUntergang;
	}

	public void setSonnenUntergang(Date sonnenUntergang) {
		this.sonnenUntergang = sonnenUntergang;
	}

}
