package sub1;

import java.time.LocalDate;

public class VasCroaziera extends Vapor{
	private int nr_piscine;
	private int nr_restaurante;
	
	public VasCroaziera(String nume, int nr_membri, LocalDate data_lansarii, Viteza viteza, int nr_piscine,
			int nr_restaurante) {
		super(nume, nr_membri, data_lansarii, viteza);
		this.nr_piscine = nr_piscine;
		this.nr_restaurante = nr_restaurante;
	}

	public int getNr_piscine() {
		return nr_piscine;
	}

	public void setNr_piscine(int nr_piscine) {
		this.nr_piscine = nr_piscine;
	}

	public int getNr_restaurante() {
		return nr_restaurante;
	}

	public void setNr_restaurante(int nr_restaurante) {
		this.nr_restaurante = nr_restaurante;
	}

	@Override
	public String toString() {
		return super.toString() + "[nr_piscine=" + nr_piscine + ", nr_restaurante=" + nr_restaurante + "]";
	}
	
	
}
