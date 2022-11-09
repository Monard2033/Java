package sub1;

import java.time.LocalDate;

public class VasMarfa extends Vapor{
	private int nr_containere;

	public VasMarfa(String nume, int nr_membri, LocalDate data_lansarii, Viteza viteza, int nr_containere) {
		super(nume, nr_containere, data_lansarii, viteza);
		this.nr_containere = nr_containere;
	}

	public int getNr_containere() {
		return nr_containere;
	}

	public void setNr_containere(int nr_containere) {
		this.nr_containere = nr_containere;
	}

	@Override
	public String toString() {
		return super.toString() + "[nr_containere=" + nr_containere + "]";
	}
	
	
}
