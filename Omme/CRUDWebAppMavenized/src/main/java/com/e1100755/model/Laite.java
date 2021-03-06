package com.e1100755.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Laite {
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO)

	private int laiteId;
	@Column
	private String nimi;
	@Column
	private String kuvaus;
	@Column
	private double hinta;
	@Column
	private int ostopäivämäärä;
	@Column
	private int takuu;

	public Laite() {

	}

	public Laite(int laiteId, String nimi, String kuvaus, double hinta,
			int ostopäivämäärä, int takuu) {
		this.laiteId = laiteId;
		this.nimi = nimi;
		this.kuvaus = kuvaus;
		this.kuvaus = kuvaus;
		this.ostopäivämäärä = ostopäivämäärä;
		this.takuu = takuu;
	}

	public String getNimi() {
		return nimi;
	}

	public void setNimi(String nimi) {
		this.nimi = nimi;
	}

	public String getKuvaus() {
		return kuvaus;
	}

	public void setKuvaus(String kuvaus) {
		this.kuvaus = kuvaus;
	}

	public double getHinta() {
		return hinta;
	}

	public void setHinta(double hinta) {
		this.hinta = hinta;
	}

	public int getOstopäivämäärä() {
		return ostopäivämäärä;
	}

	public void setOstopäivämäärä(int ostopäivämäärä) {
		this.ostopäivämäärä = ostopäivämäärä;
	}

	public int getTakuu() {
		return takuu;
	}

	public void setTakuu(int takuu) {
		this.takuu = takuu;
	}

	public int getLaiteId() {
		return laiteId;
	}

	public void setLaitteenID(int laiteId) {
		this.laiteId = laiteId;
	}

}
