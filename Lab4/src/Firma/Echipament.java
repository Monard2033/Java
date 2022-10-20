package Firma;


public class Echipament 
{
	enum Stare {
		achizitionat, expus, vandut
	}
	protected String denumire;
	protected int nr_inv;
	protected int pret;
	protected String zona_mag;
	protected Stare stare;

	public Echipament(String denumire, int nr_inv, int pret, String zona_mag, Stare stare) 
	{
		this.denumire = denumire;
		this.nr_inv = nr_inv;
		this.pret = pret;
		this.stare = stare;

	}
	
	public String getDenumire() {
		return denumire;
	}

	public void setDenumire(String denumire) {
		this.denumire = denumire;
	}

	public int getNr_inv() {
		return nr_inv;
	}

	public void setNr_inv(int nr_inv) {
		this.nr_inv = nr_inv;
	}

	public int getPret() {
		return pret;
	}

	public void setPret(int pret) {
		this.pret = pret;
	}

	public String getZona_mag() {
		return zona_mag;
	}

	public void setZona_mag(String zona_mag) {
		this.zona_mag = zona_mag;
	}

	public Stare getStare() {
		return stare;
	}

	public void setStare(Stare stare) {
		this.stare = stare;
	}


	@Override
	public String toString() {
		return  "Echipament [denumire=" + denumire + ", nr_inv=" + nr_inv + ", pret=" + pret + ", zona_mag=" + zona_mag
				+ ", stare=" + stare + "]";
	}
	
	
}