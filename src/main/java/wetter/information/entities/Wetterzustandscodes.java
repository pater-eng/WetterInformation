package wetter.information.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Wetterzustand")
public class Wetterzustandscodes implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CodeId")
	private int codeId;
	@Column(name = "Main")
	private String main;
	@Column(name = "Beschreibung")
	private String beschreibung;
	@Column(name = "IconId")
	private String iconId;

	public Wetterzustandscodes(int codeId, String main, String beschreibung, String iconId) {
		super();
		this.codeId = codeId;
		this.main = main;
		this.beschreibung = beschreibung;
		this.iconId = iconId;
	}

	public int getCodeId() {
		return codeId;
	}

	public void setCodeId(int codeId) {
		this.codeId = codeId;
	}

	public String getMain() {
		return main;
	}

	public void setMain(String main) {
		this.main = main;
	}

	public String getBeschreibung() {
		return beschreibung;
	}

	public void setBeschreibung(String beschreibung) {
		this.beschreibung = beschreibung;
	}

	public String getIconId() {
		return iconId;
	}

	public void setIconId(String iconId) {
		this.iconId = iconId;
	}

}
