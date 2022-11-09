package sub1;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Vapor {
	private String nume;
	private int nr_membri;
	private LocalDate data_lansarii;
	private Viteza viteza;
	
	public Vapor(String nume, int nr_membri, LocalDate data_lansarii, Viteza viteza) {
		super();
		this.nume = nume;
		this.nr_membri = nr_membri;
		this.data_lansarii = data_lansarii;
		this.viteza = viteza;
	}
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public int getNr_membri() {
		return nr_membri;
	}
	public void setNr_membri(int nr_membri) {
		this.nr_membri = nr_membri;
	}
	public LocalDate getData_lansarii() {
		return data_lansarii;
	}
	public void setData_lansarii(LocalDate data_lansarii) {
		this.data_lansarii = data_lansarii;
	}
	public Viteza getViteza() {
		return viteza;
	}
	public void setViteza(Viteza viteza) {
		this.viteza = viteza;
	}
	@Override
	public String toString() {
		return "[nume=" + nume + ", nr_membri=" + nr_membri + ", data_lansarii=" + data_lansarii + ", viteza="
				+ viteza + "]";
	}
	
	public int AniLansare() {
		return (int)ChronoUnit.YEARS.between(this.data_lansarii,LocalDate.now());
	}
	
}
