package Problema_Trenuri;

import java.time.LocalDate;

public class Accelerat extends Tren {
	private int numar_de_locuri;
	private boolean vagon_restaurant;
	public Accelerat(int numar_tren, int numar_vagoane, LocalDate data_ultimei_revizii, int numar_de_locuri,
			boolean vagon_restaurant) {
		super(numar_tren, numar_vagoane, data_ultimei_revizii);
		this.numar_de_locuri = numar_de_locuri;
		this.vagon_restaurant = vagon_restaurant;
	}
	public int getNumar_de_locuri() {
		return numar_de_locuri;
	}
	public void setNumar_de_locuri(int numar_de_locuri) {
		this.numar_de_locuri = numar_de_locuri;
	}
	public boolean isVagon_restaurant() {
		return vagon_restaurant;
	}
	public void setVagon_restaurant(boolean vagon_restaurant) {
		this.vagon_restaurant = vagon_restaurant;
	}
	@Override
	public String toString() {
		return super.toString()+ "Accelerat [numar_de_locuri=" + numar_de_locuri + ", vagon_restaurant=" + vagon_restaurant + "]";
	}
	
}
