package Problema_Trenuri;

import java.time.LocalDate;

public class Marfar extends Tren {
	private String marfa_transportata;

	public Marfar(int numar_tren, int numar_vagoane, LocalDate data_ultimei_revizii, String marfa_transportata) {
		super(numar_tren, numar_vagoane, data_ultimei_revizii);
		this.marfa_transportata = marfa_transportata;
	}

	public String getMarfa_transportata() {
		return marfa_transportata;
	}

	public void setMarfa_transportata(String marfa_transportata) {
		this.marfa_transportata = marfa_transportata;
	}

	@Override
	public String toString() {
		return super.toString()+"Marfar [marfa_transportata=" + marfa_transportata + "]";
	}
	
}
